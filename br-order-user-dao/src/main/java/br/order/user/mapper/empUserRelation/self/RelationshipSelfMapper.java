package br.order.user.mapper.empUserRelation.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.order.user.vo.empUserRelation.RelationShipVo;

public interface RelationshipSelfMapper {
	
   List<RelationShipVo> getRelationShipsByParam(@Param("relationship")RelationShipVo relationship);
   
   //RelationShipVo getRelationshipById(String customerInfoId);
   
   RelationShipVo getRelationship(String relationshipId);
}
