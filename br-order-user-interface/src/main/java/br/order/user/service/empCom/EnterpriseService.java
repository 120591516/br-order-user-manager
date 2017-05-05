package br.order.user.service.empCom;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.order.user.pojo.empCom.Enterprise;
import br.order.user.vo.empCom.EnterpriseVo;


public interface EnterpriseService {

    String insertEnterprise(Enterprise enterprise);

    int updateEnterprise(Enterprise enterprise);

    Enterprise getEnterpriseById(String enterpriseId);

    PageInfo<Enterprise> getEnterpriseByPage(Integer page, Integer rows, Enterprise enterprise);
    
    //ycy
    /** 
    * @Title: getEnterpriseByAllPage 
    * @Description: 企业分页列表
    * @param page
    * @param rows
    * @param enterpriseVo
    * @return    设定文件 
    * @return PageInfo<EnterpriseVo>    返回类型 
    */
    PageInfo<EnterpriseVo> getEnterpriseByAllPage(Integer page, Integer rows, EnterpriseVo enterpriseVo);
    
    /** 
    * @Title: getEnterpriseVoById 
    * @Description: 根据企业Id查询企业信息
    * @param enterpriseId
    * @return    设定文件 
    * @return EnterpriseVo    返回类型 
    */
    EnterpriseVo getEnterpriseVoById(String enterpriseId);
    
    /** 
    * @Title: getValidEnterprise 
    * @Description: 查询有效企业信息列表
    * @return    设定文件 
    * @return List<EnterpriseVo>    返回类型 
    */
    List<Enterprise> getValidEnterprise();
    
}
