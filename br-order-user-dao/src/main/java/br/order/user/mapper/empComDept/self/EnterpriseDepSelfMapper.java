package br.order.user.mapper.empComDept.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.order.user.vo.empComDept.EnterpriseDepVo;

public interface EnterpriseDepSelfMapper {
    /** 
    * @Title: getAllEnterpriseDepByPage 
    * @Description: 部門分頁列表
    * @param enterpriseDepVo
    * @return    设定文件 
    * @return List<EnterpriseDepVo>    返回类型 
    */
    List<EnterpriseDepVo> getAllEnterpriseDepByPage(@Param("enterpriseDepVo")EnterpriseDepVo enterpriseDepVo);
}
