package br.order.user.service.impl.empUserRelation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.order.user.mapper.empUserRelation.RelationshipMapper;
import br.order.user.mapper.empUserRelation.self.RelationshipSelfMapper;
import br.order.user.pojo.empUserRelation.Relationship;
import br.order.user.pojo.empUserRelation.RelationshipExample;
import br.order.user.pojo.empUserRelation.RelationshipExample.Criteria;
import br.order.user.service.empUserRelation.RelationshipService;
import br.order.user.vo.empUserRelation.RelationShipVo;

@Service
public class RelationshipServiceImpl implements RelationshipService {
	@Autowired
	private RelationshipSelfMapper relationshipSelfMapper;
	@Autowired
	private RelationshipMapper relationshipMapper;
	
	/**
		 * <p>Title:getRelationship</p> 
		 * <p>Description: 查询家庭成员信息 </p> 
		 * @param page
		 * @param rows
		 * @param relationship
		 * @return
	     * @see br.order.user.service.empUserRelation.RelationshipService#getRelationship(java.lang.Integer, java.lang.Integer, br.order.user.vo.empUserRelation.RelationShipVo)
		 */
	public PageInfo<RelationShipVo> getRelationship(Integer page, Integer rows, RelationShipVo relationship) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, rows);
		List<RelationShipVo> list = relationshipSelfMapper.getRelationShipsByParam(relationship);
		PageInfo<RelationShipVo> pageInfo = new PageInfo<RelationShipVo>(list);

		return pageInfo;
	}

	/**
		 * <p>Title:insertRelationship</p> 
		 * <p>Description:新增关系表 </p> 
		 * @param relationship
		 * @return
	     * @see br.order.user.service.empUserRelation.RelationshipService#insertRelationship(br.order.user.pojo.permission.Relationship)
		 */
	public int insertRelationship(Relationship relationship) {
		relationship.setRelationshipId(UUIDUtils.getId());
		relationship.setStatus(0);
		relationship.setCreatetime(new Date());
		relationship.setEdittime(relationship.getCreatetime());
		return relationshipMapper.insertSelective(relationship);
	}

	public int updateByExampleSelective(Relationship relationship) {
 		RelationshipExample example = new RelationshipExample();
		Criteria criteria = example.createCriteria();
		criteria.andCustomerInfoIdEqualTo(relationship.getCustomerInfoId());
		criteria.andCustomerInfoRelationIdEqualTo(relationship.getCustomerInfoRelationId());
		return relationshipMapper.updateByExampleSelective(relationship, example);
	}

	public List<Relationship> cusInfoListByStatus() {
		RelationshipExample example = new RelationshipExample();
		example.createCriteria().andStatusEqualTo(0);
		return relationshipMapper.selectByExample(example);
	}

	/**
		 * <p>Title:getRelationshipById</p> 
		 * <p>Description: 根据id查询家庭成员的详细信息</p> 
		 * @param relationshipId
		 * @return
		 * 
		 * 
	     * @see br.order.user.service.empUserRelation.RelationshipService#getRelationshipById(java.lang.Long)
		 */
	/*public RelationShipVo getRelationshipById(String customerInfoId) {
		// TODO Auto-generated method stub
		return relationshipSelfMapper.getRelationshipById(customerInfoId);
	}*/

	/**
		 * <p>Title:updateByPrimaryKeySelective</p> 
		 * <p>Description: 逻辑删除家庭成员关系表</p> 
		 * @param relationship
		 * @return
	     * @see br.order.user.service.empUserRelation.RelationshipService#updateByPrimaryKeySelective(br.order.user.pojo.empUserRelation.Relationship)
		 */
	public int updateByPrimaryKeySelective(Relationship relationship) {
		return relationshipMapper.updateByPrimaryKeySelective(relationship);
	}

	/**
		 * <p>Title:getRelationship</p> 
		 * <p>Description: 根据relationshipId查询对象</p>
		 * @param relationshipId
		 * @return
	     * @see br.order.user.service.empUserRelation.RelationshipService#getRelationship(java.lang.Long)
		 */
	public Relationship getRelationship(String relationshipId) {
		return relationshipMapper.selectByPrimaryKey(relationshipId);
	}

	public RelationShipVo getRelationshipById(String relationshipId) {
		return relationshipSelfMapper.getRelationship(relationshipId);
	}



	
	

}
