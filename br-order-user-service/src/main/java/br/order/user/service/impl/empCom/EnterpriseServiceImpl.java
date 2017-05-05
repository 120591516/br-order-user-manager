package br.order.user.service.impl.empCom;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.crm.pojo.dict.DictImg;
import br.crm.service.dict.DictImgService;
import br.order.user.mapper.empCom.EnterpriseMapper;
import br.order.user.mapper.empCom.self.EnterpriseSelfMapper;
import br.order.user.pojo.empCom.Enterprise;
import br.order.user.pojo.empCom.EnterpriseExample;
import br.order.user.pojo.empCom.EnterpriseExample.Criteria;
import br.order.user.service.empCom.EnterpriseService;
import br.order.user.vo.empCom.EnterpriseVo;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
	@Autowired
	private EnterpriseMapper enterpriseMapper;
	@Autowired
	private EnterpriseSelfMapper enterpriseSelfMapper;
	@Autowired
	private DictImgService dictImgService;

	/**
		 * <p>Title:insertEnterprise</p> 
		 * <p>Description:添加企业信息 </p> 
		 * @param enterprise
		 * @return
	     * @see br.order.user.service.empCom.EnterpriseService#insertEnterprise(br.order.user.pojo.permission.Enterprise)
		 */
	public String insertEnterprise(Enterprise enterprise) {
		enterprise.setEnterpriseId(UUIDUtils.getId());
		enterprise.setEnterpriseCreateTime(new Date());
		enterprise.setEnterpriseEditTime(enterprise.getEnterpriseCreateTime());
		enterprise.setEnterpriseStatus(0);
		enterpriseMapper.insertSelective(enterprise);
		return enterprise.getEnterpriseId();
	}

	/**
		 * <p>Title:updateEnterprise</p> 
		 * <p>Description: 修改企业信息 </p> 
		 * @param enterprise
		 * @return
	     * @see br.order.user.service.empCom.EnterpriseService#updateEnterprise(br.order.user.pojo.permission.Enterprise)
		 */
	public int updateEnterprise(Enterprise enterprise) {
		
		return enterpriseMapper.updateByPrimaryKeySelective(enterprise);
	}

	public Enterprise getEnterpriseById(String enterpriseById) {

		return enterpriseMapper.selectByPrimaryKey(enterpriseById);
	}

	public PageInfo<Enterprise> getEnterpriseByPage(Integer page, Integer rows, Enterprise enterprise) {

		PageHelper.startPage(page, rows);
		EnterpriseExample example = new EnterpriseExample();
		Criteria criteria = example.createCriteria();
		criteria.andEnterpriseStatusEqualTo(0);
		List<Enterprise> selectByExample = enterpriseMapper.selectByExample(example);
		PageInfo<Enterprise> pageInfo = new PageInfo<Enterprise>(selectByExample);
		return pageInfo;
	}

	// ycy
	/**
		 * <p>Title:getEnterpriseByAllPage</p> 
		 * <p>Description:分页查询企业信息列表 </p> 
		 * @param page
		 * @param rows
		 * @param enterpriseVo
		 * @return
	     * @see br.order.user.service.empCom.EnterpriseService#getEnterpriseByAllPage(java.lang.Integer, java.lang.Integer, br.order.user.vo.empCom.EnterpriseVo)
		 */
	public PageInfo<EnterpriseVo> getEnterpriseByAllPage(Integer page, Integer rows, EnterpriseVo enterpriseVo) {
		PageHelper.startPage(page, rows);
		List<EnterpriseVo> enterpriseByPage = enterpriseSelfMapper.getEnterpriseByPage(enterpriseVo);
		PageInfo<EnterpriseVo> pageInfo = new PageInfo<EnterpriseVo>(enterpriseByPage);
		return pageInfo;
	}

	/**
		 * <p>Title:getEnterpriseVoById</p> 
		 * <p>Description:根据注册id查询企业信息 </p> 
		 * @param enterpriseId
		 * @return
	     * @see br.order.user.service.empCom.EnterpriseService#getEnterpriseVoById(java.lang.Long)
		 */
	public EnterpriseVo getEnterpriseVoById(String enterpriseId) {

		EnterpriseVo e = enterpriseSelfMapper.getEnterpriseVoById(enterpriseId);
		// 在Business数据库中查询dict_img
		// 营业执照图片id
		if(e !=null&&e.getEnterpriceLicenseImgId()!=null){
		
			DictImg selectByPrimaryKey = dictImgService.getEntityById(Long.valueOf(e.getEnterpriceLicenseImgId()));
			e.setEnterpriseLicenseImgUrl(selectByPrimaryKey.getImgLocation());
		}
		if(e !=null&&e.getEnterpriceLicenseOpenImgId()!=null){
		// 开户许可证图片的id
			DictImg dictOpenImg = dictImgService.getEntityById(Long.valueOf(e.getEnterpriceLicenseOpenImgId()));
			e.setEnterpriseLicenseOpenImgUrl(dictOpenImg.getImgLocation());
		}
			return e;

	}

	/**
		 * <p>Title:getValidEnterprise</p> 
		 * <p>Description:查询有效企业列表 </p> 
		 * @return
	     * @see br.order.user.service.empCom.EnterpriseService#getValidEnterprise()
		 */
	public List<Enterprise> getValidEnterprise() {
		// TODO Auto-generated method stub
		EnterpriseExample example = new EnterpriseExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andEnterpriseStatusEqualTo(0);
		return enterpriseMapper.selectByExample(example);
		 
	}

}
