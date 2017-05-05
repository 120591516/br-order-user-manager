package br.order.user.service.empUserRelation;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.order.user.pojo.empUserRelation.Relationship;
import br.order.user.vo.empUserRelation.RelationShipVo;

public interface RelationshipService {

    PageInfo<RelationShipVo> getRelationship(Integer page, Integer rows, RelationShipVo relationship);

    int insertRelationship(Relationship relationship);
    
    int updateByExampleSelective(Relationship relationship);

	List<Relationship> cusInfoListByStatus();
	
	int updateByPrimaryKeySelective(Relationship relationship);
	
	Relationship getRelationship(String relationshipId);
	
	RelationShipVo getRelationshipById(String relationshipId);
	
	
}
