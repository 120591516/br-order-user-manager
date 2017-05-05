package br.order.user.mapper.dict;

import br.order.user.pojo.dict.DictRelationship;
import br.order.user.pojo.dict.DictRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictRelationshipMapper {
    int countByExample(DictRelationshipExample example);

    int deleteByExample(DictRelationshipExample example);

    int deleteByPrimaryKey(Long dictRelationId);

    int insert(DictRelationship record);

    int insertSelective(DictRelationship record);

    List<DictRelationship> selectByExample(DictRelationshipExample example);

    DictRelationship selectByPrimaryKey(Long dictRelationId);

    int updateByExampleSelective(@Param("record") DictRelationship record, @Param("example") DictRelationshipExample example);

    int updateByExample(@Param("record") DictRelationship record, @Param("example") DictRelationshipExample example);

    int updateByPrimaryKeySelective(DictRelationship record);

    int updateByPrimaryKey(DictRelationship record);
}