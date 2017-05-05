package br.order.user.mapper.empComDept;

import br.order.user.pojo.empComDept.EnterpriseDep;
import br.order.user.pojo.empComDept.EnterpriseDepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseDepMapper {
    int countByExample(EnterpriseDepExample example);

    int deleteByExample(EnterpriseDepExample example);

    int deleteByPrimaryKey(String enterpriseDepId);

    int insert(EnterpriseDep record);

    int insertSelective(EnterpriseDep record);

    List<EnterpriseDep> selectByExample(EnterpriseDepExample example);

    EnterpriseDep selectByPrimaryKey(String enterpriseDepId);

    int updateByExampleSelective(@Param("record") EnterpriseDep record, @Param("example") EnterpriseDepExample example);

    int updateByExample(@Param("record") EnterpriseDep record, @Param("example") EnterpriseDepExample example);

    int updateByPrimaryKeySelective(EnterpriseDep record);

    int updateByPrimaryKey(EnterpriseDep record);
}