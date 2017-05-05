package br.order.user.service.empComDept;

import java.util.List;

//git.oschina.net/scaler/br-order-user-manager.git
import com.github.pagehelper.PageInfo;

import br.order.user.pojo.empComDept.EnterpriseDep;
import br.order.user.vo.empComDept.EnterpriseDepTreeVo;
import br.order.user.vo.empComDept.EnterpriseDepVo;


public interface EnterpriseDepService {

    int insertEnterpriseDep(EnterpriseDep enterpriseDep);

    int updateEnterpriseDep(EnterpriseDep enterpriseDep);
    
    EnterpriseDep getEnterpriseDepById(String enterpriseDeptId);  
    
    List<EnterpriseDepVo> getAllEnterpriseDep(EnterpriseDepVo enterpriseDepVo);
    
    PageInfo<EnterpriseDepVo> getAllEnterpriseDep(Integer page,Integer Rows,EnterpriseDepVo enterpriseDepVo);

	List<EnterpriseDep> getValidEnterpriseDep();
    
	List<EnterpriseDepTreeVo> getMenuTree(String  empId);
    
	int countDeptChildNum(String enterpriseDeptId);

    int checkDeptName(String enterpriseDeptName);

    List<EnterpriseDep> getDepInEnterprise(String enterpriseId);
}
