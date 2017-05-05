package br.order.user.service.empUser;

import com.github.pagehelper.PageInfo;

import br.order.user.pojo.empUser.CustomerRegist;
import br.order.user.vo.empUser.CustomerInfoVo;
import br.order.user.vo.empUser.CustomerRegistQu;
import br.order.user.vo.empUser.CustomerRegistVo;


public interface CustomerRegistService {
	
    String insertCustomerRegist(CustomerRegist customerRegist);
    
    int updateCustomerRegist(CustomerRegist customerRegist);
    
    CustomerRegist updateCustomerRegistById(String customerRegistId);
    
    CustomerRegistVo getCustomerRegist(String customerRegistId);
	
	CustomerRegist getCustomerRegistById(String customerRegistId);

	PageInfo<CustomerInfoVo> getCustomerRegistByPage(Integer page,Integer rows,CustomerRegistQu customerRegist);

	/** 
	* @Title: getLoginByPhoneOrPassword 
	* @Description: 用户登录的电话和密码 
	* @param username
	* @param Password
	* @return    设定文件 
	* @return int    返回类型 
	*/
	CustomerRegistVo getLoginByPhone(String username,Integer type);
	
	CustomerRegist getCustomerInfoId(String customerInfoId);
	
}
