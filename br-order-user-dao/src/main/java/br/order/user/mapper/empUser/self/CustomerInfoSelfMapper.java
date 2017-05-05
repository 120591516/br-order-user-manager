package br.order.user.mapper.empUser.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.order.user.pojo.empUser.CustomerInfo;
import br.order.user.vo.empUser.CustomerInfoVo;
import br.order.user.vo.empUser.CustomerRegistQu;

public interface CustomerInfoSelfMapper {
    List<CustomerInfoVo> getAllCustomerInfo(@Param("customerRegistQu")CustomerRegistQu customerRegistQu);
    /** 
    * @Title: selectByPrimaryKey 
    * @Description: 根据注册Id查询客户信息
    * @param customerInfoId
    * @return    设定文件 
    * @return CustomerInfo    返回类型 
    */
    CustomerInfo selectByPrimaryKey(String customerRegistId);
    
}
