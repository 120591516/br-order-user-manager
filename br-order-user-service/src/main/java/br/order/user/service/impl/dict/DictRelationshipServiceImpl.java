package br.order.user.service.impl.dict;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.JsonUtils;
import br.crm.common.utils.RedisConstant;
import br.crm.service.redis.RedisCrmService;
import br.order.user.mapper.dict.DictRelationshipMapper;
import br.order.user.pojo.dict.DictRelationship;
import br.order.user.pojo.dict.DictRelationshipExample;
import br.order.user.service.dict.DictRelationshipService;

@Service
public class DictRelationshipServiceImpl implements DictRelationshipService {

	@Autowired
	private DictRelationshipMapper dictRelationshipMapper;
	@Autowired
	private RedisCrmService redisCrmService;
	

	public RedisCrmService getRedisCrmService() {
		return redisCrmService;
	}

	public void setRedisCrmService(RedisCrmService redisCrmService) {
		this.redisCrmService = redisCrmService;
	}

	public PageInfo<DictRelationship> getDictRelationshipByPage(int page, int rows) {
		DictRelationshipExample example = new DictRelationshipExample();
		PageHelper.startPage(page, rows);
		example.setOrderByClause(" dict_relation_create_time desc");
		List<DictRelationship> list = dictRelationshipMapper.selectByExample(example);
		PageInfo<DictRelationship> pageInfo = new PageInfo<DictRelationship>(list);
		return pageInfo;
	}

	public int addDictRelationship(DictRelationship dictRelationship) {

		int i = dictRelationshipMapper.insertSelective(dictRelationship);

		redisCrmService.set(RedisConstant.br_user_relationship_id + dictRelationship.getDictRelationId(), JSONObject.toJSONString(dictRelationship));

		return i;
	}

	public int updateDictRelationship(DictRelationship dictRelationship) {

		int i = dictRelationshipMapper.updateByPrimaryKeySelective(dictRelationship);

		redisCrmService.set(RedisConstant.br_user_relationship_id + dictRelationship.getDictRelationId(), JSONObject.toJSONString(dictRelationship));

		return i;
	}


	public DictRelationship getDictRelationshipByPid(Long pid) {

		return JsonUtils.jsonToPojo(redisCrmService.get(RedisConstant.br_user_relationship_id + pid), DictRelationship.class);
	}

	/**
	 * <p>
	 * Title:cusInfoListByStatus
	 * </p>
	 * <p>
	 * Description: 亲友关系字典表
	 * </p>
	 * 
	 * @return
	 * @see br.order.user.service.dict.DictRelationshipService#cusInfoListByStatus()
	 */
	public List<DictRelationship> cusInfoListByStatus() {
		DictRelationshipExample example = new DictRelationshipExample();
		example.createCriteria().andDictRelationStatusEqualTo(0);
		List<DictRelationship> list = dictRelationshipMapper.selectByExample(example);
		return list;

	}

	/**
		 * <p>Title:initData</p> 
		 * <p>Description:亲友字典表缓存redis </p> 
	     * @see br.order.user.service.dict.DictRelationshipService#initData()
		 */
	public void initData() {
		List<DictRelationship> list = dictRelationshipMapper.selectByExample(null);
		if(CollectionUtils.isNotEmpty(list)){
			for (DictRelationship dictRelationship : list) {
				String key = RedisConstant.br_user_relationship_id.concat(dictRelationship.getDictRelationId().toString());
				if (!redisCrmService.exists(key)) {
					redisCrmService.set(key, JSONObject.toJSONString(dictRelationship));
				}
			}
		}
	}

}
