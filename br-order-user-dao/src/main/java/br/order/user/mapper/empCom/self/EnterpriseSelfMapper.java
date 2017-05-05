package br.order.user.mapper.empCom.self;

import java.util.List;

import br.order.user.vo.empCom.EnterpriseVo;

public interface EnterpriseSelfMapper {
	//分页查询
	List<EnterpriseVo> getEnterpriseByPage(EnterpriseVo enterpriseVo);
	//根据企业id查询
	EnterpriseVo getEnterpriseVoById(String enterpriseId);

}
