package br.order.user.service.empComUser;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.order.user.pojo.empCom.Enterprise;
import br.order.user.pojo.empComDept.EnterpriseDep;
import br.order.user.pojo.empComUser.EnterpriseEmp;
import br.order.user.vo.empComUser.EnterpriseEmpVo;
import br.order.user.vo.empUser.CustomerInfoVo;

public interface EnterpriseEmpService {

    int insertEnterpriseEmp(EnterpriseEmp enterpriseEmp);

    EnterpriseEmp getEnterpriseEmpByInfoId(String customerInfoId);


	List<EnterpriseEmp> getEnterpriseEmpByDeptId(String enterpriseDeptId);
	
	PageInfo<EnterpriseEmpVo> getEnterpriseEmp(Integer page,Integer rows,EnterpriseEmpVo enterpriseEmpVo);
	 
	int updateEnterpriseEmp(EnterpriseEmp enterpriseEmp);

    //删除企业下所有员工

    int updataEnterpriseEmpByExample(Enterprise enterprise);

    //删除部门下所有员工
    int updataEnterpriseEmpByExample(EnterpriseDep enterpriseDep);
    
    PageInfo<EnterpriseEmpVo> getAllEnterpriseEmpByPage(Integer page, Integer rows,String enterpriseDeptId);

	EnterpriseEmp getEmterPriseEmpById(String enterpriseEmpId);
	
	int countEmpNumByDeptId(String enterpriseDeptId);
}
