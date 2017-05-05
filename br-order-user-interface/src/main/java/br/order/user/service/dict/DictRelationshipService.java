package br.order.user.service.dict;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.order.user.pojo.dict.DictRelationship;


public interface DictRelationshipService {
	PageInfo<DictRelationship> getDictRelationshipByPage(int page, int rows);

	int addDictRelationship(DictRelationship dictrelationship);

	int updateDictRelationship(DictRelationship dictrelationship);
	
	DictRelationship getDictRelationshipByPid(Long pid);
	
	List<DictRelationship> cusInfoListByStatus();
	
	void initData();
}
