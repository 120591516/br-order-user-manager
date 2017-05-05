package br.order.user.mapper.empUser.self;

import org.apache.ibatis.annotations.Param;

import br.order.user.pojo.empUser.CustomerRegist;
import br.order.user.vo.empUser.CustomerRegistVo;

public interface CustomerRegistSelfMapper {
	 /** 
	* @Title: selectByPrimaryKey 
	* @Description: 根据注册id查询注册信息
	* @param customerRegistId
	* @return    设定文件 
	* @return CustomerRegist    返回类型 
	*/
	CustomerRegist selectByPrimaryKey(String customerRegistId);
	
	CustomerRegistVo selectByPrimary(String customerRegistId);
	
	/** 
	* @Title: getLoginByPhoneOrPassword 
	* @Description: 用户登录时用户名和密码
	* @param username
	* @param Password
	* @return    设定文件 
	* @return int    返回类型 
	*/
	CustomerRegistVo getLoginByPhoneOrPassword(@Param("username") String username,@Param("type") Integer type);
}
