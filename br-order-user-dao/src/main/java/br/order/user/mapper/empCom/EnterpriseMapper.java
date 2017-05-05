package br.order.user.mapper.empCom;

import br.order.user.pojo.empCom.Enterprise;
import br.order.user.pojo.empCom.EnterpriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseMapper {
    int countByExample(EnterpriseExample example);

    int deleteByExample(EnterpriseExample example);

    int deleteByPrimaryKey(String enterpriseId);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    List<Enterprise> selectByExample(EnterpriseExample example);

    Enterprise selectByPrimaryKey(String enterpriseId);

    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}