package br.order.user.service.impl.empUser;

import java.util.Date;
import java.util.List;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.order.user.mapper.empUser.CustomerRegistMapper;
import br.order.user.mapper.empUser.self.CustomerInfoSelfMapper;
import br.order.user.mapper.empUser.self.CustomerRegistSelfMapper;
import br.order.user.pojo.empUser.CustomerRegist;
import br.order.user.pojo.empUser.CustomerRegistExample;
import br.order.user.pojo.empUser.CustomerRegistExample.Criteria;
import br.order.user.service.empUser.CustomerRegistService;
import br.order.user.vo.empUser.CustomerInfoVo;
import br.order.user.vo.empUser.CustomerRegistQu;
import br.order.user.vo.empUser.CustomerRegistVo;

/** 
* (客户注册service)
* @ClassName: CustomerRegistServiceImpl 
* @Description: 客户注册service
* @author 王文腾
* @date 2016年9月14日 上午11:55:28 
*/
@Service
public class CustomerRegistServiceImpl implements CustomerRegistService {
	@Autowired
	private CustomerRegistMapper customerRegistMapper;
	@Autowired
	private CustomerRegistSelfMapper customerRegistSelfMapper;
	@Autowired
	private CustomerInfoSelfMapper customerInfoSelfMapper;
	/**
		 * <p>Title:insertCustomerRegist</p> 
		 * <p>Description: 新增客户注册信息 </p> 
		 * @param customerRegist
		 * @return 
	     * @see br.order.user.service.empUser.CustomerRegistService#insertCustomerRegist(br.order.user.pojo.permission.CustomerRegist)
		 */
	public String insertCustomerRegist(CustomerRegist customerRegist) {
        Md5Hash md5 = new Md5Hash(customerRegist.getCustomerRegistPassword());
        customerRegist.setCustomerRegistId(UUIDUtils.getId());
        customerRegist.setCustomerRegistPassword(md5.toString());
        customerRegist.setCustomerRegistStatus(0);
        customerRegist.setCustomerRegistCreateTime(new Date());
        customerRegist.setCustomerRegistEditTime(customerRegist.getCustomerRegistCreateTime());
		customerRegistMapper.insertSelective(customerRegist);
		return customerRegist.getCustomerRegistId();
	}
	
	/** 
	*  修改客户注册信息
	* <p>Title: updateCustomerRegistById</p> 
	* <p>Description: </p> 
	* @param customerRegistId
	* @return
	* @see br.order.user.service.empUser.CustomerRegistService#updateCustomerRegistById(java.lang.Long) 
	*/
	public CustomerRegist updateCustomerRegistById(String customerRegistId) {
		return customerRegistMapper.selectByPrimaryKey(customerRegistId);
	}

	/**
		 * <p>Title:getCustomerRegistById</p> 
		 * <p>Description:  根据id查詢客戶注册信息</p> 
		 * @param customerRegistId
		 * @return
	     * @see br.order.user.service.empUser.CustomerRegistService#getCustomerRegistById(java.lang.Long)
		 */
	public CustomerRegist getCustomerRegistById(String customerRegistId) {
		return customerRegistSelfMapper.selectByPrimaryKey(customerRegistId);
	}

	/**
		 * <p>Title:updateCustomerRegist</p> 
		 * <p>Description: 修改客户注册信息</p> 
		 * @param customerRegist
		 * @return
	     * @see br.order.user.service.empUser.CustomerRegistService#updateCustomerRegist(br.order.user.pojo.permission.CustomerRegist)
		 */
	public int updateCustomerRegist(CustomerRegist customerRegist) {

		return customerRegistMapper.updateByPrimaryKeySelective(customerRegist);
	}
	/**
	 * 
	 * {分页获取注册用户信息列表}
	 * 
	 * @param page 页数
	 * @param rows 每页显示行数
	 * @param customerRegistQu 条件搜索对象
	 * @return 注册信息列表
	 * @author: Author
	 */
	public PageInfo<CustomerInfoVo> getCustomerRegistByPage(Integer page, Integer rows, CustomerRegistQu customerRegistQu) {
		PageHelper.startPage(page, rows);
		List<CustomerInfoVo> list = customerInfoSelfMapper.getAllCustomerInfo(customerRegistQu);
		PageInfo<CustomerInfoVo>pageInfo=new PageInfo<CustomerInfoVo>(list);
		return pageInfo;
	}

	/**
		 * <p>Title:updateCustomerRegist</p> 
		 * <p>Description:根据注册id查询用户信息 </p> 
		 * @param customerRegistId
		 * @return
	     * @see br.order.user.service.empUser.CustomerRegistService#updateCustomerRegist(java.lang.String)
		 */
	public CustomerRegistVo getCustomerRegist(String customerRegistId) {
		return customerRegistSelfMapper.selectByPrimary(customerRegistId);
	}

	public CustomerRegistVo getLoginByPhone(String username,Integer type) {
		 CustomerRegistVo customerRegistVo = customerRegistSelfMapper.getLoginByPhoneOrPassword(username,type);
		 return customerRegistVo;
	}

	public CustomerRegist getCustomerInfoId(String customerInfoId) {
		CustomerRegistExample example = new CustomerRegistExample();
		Criteria createCriteria = example.createCriteria();
		if(customerInfoId !=null){
			createCriteria.andCustomerInfoIdEqualTo(customerInfoId);
		}
		return customerRegistMapper.selectByExample(example).get(0);
	}

}
