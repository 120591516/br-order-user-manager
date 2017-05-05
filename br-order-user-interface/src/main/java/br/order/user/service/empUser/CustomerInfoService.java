package br.order.user.service.empUser;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.order.user.pojo.empUser.CustomerInfo;


public interface CustomerInfoService {

    String insertCustomerInfo(CustomerInfo customerInfo);

    int updateCustomerInfo(CustomerInfo customerInfo);

    CustomerInfo getCustomerInfo(String customerInfoId);

    int getCountByExample(String customerInfoId,String customerInfoPhone, String customerInfoEmail);
    
    int getCountBy(String customerInfoPhone, String customerInfoEmail);
    //ycy
    PageInfo<CustomerInfo> getCustomerInfoByPage(Integer page,Integer rows,CustomerInfo customerInfo);
    
    /** 
    * @Title: getCustomerInfoById 
    * @Description: 根据注册id查客户信息
    * @param customerRegistId
    * @return    设定文件 
    * @return CustomerInfo    返回类型 
    */
    CustomerInfo getCustomerInfoById(String customerInfoId);
    List<CustomerInfo> getCustomerInfoByPhone(String customerInfoPhone);

    CustomerInfo getCustomerInfoByPrimaryKey(String customerInfoId);
    
}
