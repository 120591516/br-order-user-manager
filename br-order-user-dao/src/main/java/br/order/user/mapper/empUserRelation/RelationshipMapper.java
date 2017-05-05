package br.order.user.mapper.empUserRelation;

import br.order.user.pojo.empUserRelation.Relationship;
import br.order.user.pojo.empUserRelation.RelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationshipMapper {
    int countByExample(RelationshipExample example);

    int deleteByExample(RelationshipExample example);

    int deleteByPrimaryKey(String relationshipId);

    int insert(Relationship record);

    int insertSelective(Relationship record);

    List<Relationship> selectByExample(RelationshipExample example);

    Relationship selectByPrimaryKey(String relationshipId);

    int updateByExampleSelective(@Param("record") Relationship record, @Param("example") RelationshipExample example);

    int updateByExample(@Param("record") Relationship record, @Param("example") RelationshipExample example);

    int updateByPrimaryKeySelective(Relationship record);

    int updateByPrimaryKey(Relationship record);
}