package br.order.user.mapper.empComUser.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.order.user.pojo.empComUser.EnterpriseEmp;
import br.order.user.vo.empComUser.EnterpriseEmpVo;

public interface EnterpriseEmpSelfMapper {
    //ycy
    List<EnterpriseEmpVo> getEnterpriseEmp(EnterpriseEmp enterpriseEmp);

    List<EnterpriseEmpVo> getAllEnterpriseEmpByPage(@Param("enterpriseDeptId") String enterpriseDeptId);

    /** 
    * @Title: getEnterpriseEmpByAllPage 
    * @Description: 分页查询员工信息
    * @param enterpriseEmpVo
    * @return    设定文件 
    * @return List<EnterpriseEmpVo>    返回类型 
    */
    List<EnterpriseEmpVo> getEnterpriseEmpByAllPage(EnterpriseEmpVo enterpriseEmpVo);

    /** 
    * @Title: getEnterpriseEmpByInfoId 
    * @Description: 根据id查询员工信息
    * @param customerInfoId
    * @return    设定文件 
    * @return EnterpriseEmp    返回类型 
    */
    EnterpriseEmp getEnterpriseEmpByInfoId(String customerInfoId);

    /** 
    * @Title: getEmterPriseEmpById 
    * @Description: 根据enterpriseEmpId获取员工信息
    * @param enterpriseEmpId
    * @return    设定文件 
    * @return EnterpriseEmp    返回类型 
    */
    EnterpriseEmp getEmterPriseEmpById(String enterpriseEmpId);

    List<EnterpriseEmp> getEnterpriseEmpByDeptId(String enterpriseDepId);

}
