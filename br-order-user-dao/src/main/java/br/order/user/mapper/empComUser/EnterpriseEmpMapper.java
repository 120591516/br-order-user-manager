package br.order.user.mapper.empComUser;

import br.order.user.pojo.empComUser.EnterpriseEmp;
import br.order.user.pojo.empComUser.EnterpriseEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseEmpMapper {
    int countByExample(EnterpriseEmpExample example);

    int deleteByExample(EnterpriseEmpExample example);

    int deleteByPrimaryKey(String enterpriseEmpId);

    int insert(EnterpriseEmp record);

    int insertSelective(EnterpriseEmp record);

    List<EnterpriseEmp> selectByExample(EnterpriseEmpExample example);

    EnterpriseEmp selectByPrimaryKey(String enterpriseEmpId);

    int updateByExampleSelective(@Param("record") EnterpriseEmp record, @Param("example") EnterpriseEmpExample example);

    int updateByExample(@Param("record") EnterpriseEmp record, @Param("example") EnterpriseEmpExample example);

    int updateByPrimaryKeySelective(EnterpriseEmp record);

    int updateByPrimaryKey(EnterpriseEmp record);
}