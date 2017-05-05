package br.order.user.mapper.empUser;

import br.order.user.pojo.empUser.CustomerRegist;
import br.order.user.pojo.empUser.CustomerRegistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerRegistMapper {
    int countByExample(CustomerRegistExample example);

    int deleteByExample(CustomerRegistExample example);

    int deleteByPrimaryKey(String customerRegistId);

    int insert(CustomerRegist record);

    int insertSelective(CustomerRegist record);

    List<CustomerRegist> selectByExample(CustomerRegistExample example);

    CustomerRegist selectByPrimaryKey(String customerRegistId);

    int updateByExampleSelective(@Param("record") CustomerRegist record, @Param("example") CustomerRegistExample example);

    int updateByExample(@Param("record") CustomerRegist record, @Param("example") CustomerRegistExample example);

    int updateByPrimaryKeySelective(CustomerRegist record);

    int updateByPrimaryKey(CustomerRegist record);
}