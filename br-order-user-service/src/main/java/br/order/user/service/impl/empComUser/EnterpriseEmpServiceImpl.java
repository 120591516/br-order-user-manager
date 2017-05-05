package br.order.user.service.impl.empComUser;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.order.user.mapper.empCom.EnterpriseMapper;
import br.order.user.mapper.empComDept.EnterpriseDepMapper;
import br.order.user.mapper.empComUser.EnterpriseEmpMapper;
import br.order.user.mapper.empComUser.self.EnterpriseEmpSelfMapper;
import br.order.user.mapper.empUser.CustomerInfoMapper;
import br.order.user.pojo.empCom.Enterprise;
import br.order.user.pojo.empComDept.EnterpriseDep;
import br.order.user.pojo.empComUser.EnterpriseEmp;
import br.order.user.pojo.empComUser.EnterpriseEmpExample;
import br.order.user.pojo.empComUser.EnterpriseEmpExample.Criteria;
import br.order.user.pojo.empUser.CustomerInfo;
import br.order.user.service.empComUser.EnterpriseEmpService;
import br.order.user.vo.empComUser.EnterpriseEmpVo;

@Service
public class EnterpriseEmpServiceImpl implements EnterpriseEmpService {
    @Autowired
    private EnterpriseEmpMapper enterpriseEmpMapper;

    @Autowired
    private EnterpriseEmpSelfMapper enterpriseEmpSelfMapper;

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @Autowired
    private EnterpriseDepMapper enterpriseDepMapper;
    
    @Autowired
    private CustomerInfoMapper customerInfoMapper;
    /**
    	 * <p>Title:insertEnterpriseEmp</p> 
    	 * <p>Description: 增加员工的信息</p> 
    	 * @param enterpriseEmp
    	 * @return
         * @see br.order.user.service.empComUser.EnterpriseEmpService#insertEnterpriseEmp(br.order.user.pojo.permission.EnterpriseEmp)
    	 */
    public int insertEnterpriseEmp(EnterpriseEmp enterpriseEmp) {
        enterpriseEmp.setEnterpriseEmpId(UUIDUtils.getId());
        enterpriseEmp.setStatus(0);
        enterpriseEmp.setCreatetime(new Date());
        enterpriseEmp.setEdittime(enterpriseEmp.getCreatetime());
        return enterpriseEmpMapper.insertSelective(enterpriseEmp);
    }

    /**
    	 * <p>Title:getEnterpriseEmpByInfoId</p> 
    	 * <p>Description:根据员工id查询员工信息 </p> 
    	 * @param customerInfoId
    	 * @return
         * @see br.order.user.service.empComUser.EnterpriseEmpService#getEnterpriseEmpByInfoId(java.lang.Long)
    	 */
    public EnterpriseEmp getEnterpriseEmpByInfoId(String customerInfoId) {

        return enterpriseEmpMapper.selectByPrimaryKey(customerInfoId);
    }

    /**
    	 * <p>Title:getEnterpriseEmpByDeptId</p> 
    	 * <p>Description: 根据部门ID查询部门下的员工</p> 
    	 * @param enterpriseDeptId
    	 * @return
         * @see br.order.user.service.empComUser.EnterpriseEmpService#getEnterpriseEmpByDeptId(java.lang.Long)
    	 */
    public List<EnterpriseEmp> getEnterpriseEmpByDeptId(String enterpriseDeptId) {
        return enterpriseEmpSelfMapper.getEnterpriseEmpByDeptId(enterpriseDeptId);
    }

    /**
    	 * <p>Title:getEnterpriseEmp</p> 
    	 * <p>Description:分页查询员工信息 </p> 
    	 * @param page
    	 * @param rows
    	 * @param enterpriseEmpVo
    	 * @return
         * @see br.order.user.service.empComUser.EnterpriseEmpService#getEnterpriseEmp(java.lang.Integer, java.lang.Integer, br.order.user.vo.empComUser.EnterpriseEmpVo)
    	 */
    public PageInfo<EnterpriseEmpVo> getEnterpriseEmp(Integer page, Integer rows, EnterpriseEmpVo enterpriseEmpVo) {
        // TODO Auto-generated method stub
        PageHelper.startPage(page, rows);
        List<EnterpriseEmpVo> enterpriseEmp = enterpriseEmpSelfMapper.getEnterpriseEmpByAllPage(enterpriseEmpVo);
        PageInfo<EnterpriseEmpVo> pageInfo = new PageInfo<EnterpriseEmpVo>(enterpriseEmp);
        return pageInfo;

    }

    /**
    	 * <p>Title:updateEnterpriseEmp</p> 
    	 * <p>Description: 修改员工</p> 
    	 * @param enterpriseEmp
    	 * @return
         * @see br.order.user.service.empComUser.EnterpriseEmpService#updateEnterpriseEmp(br.order.user.pojo.permission.EnterpriseEmp)
    	 */
    public int updateEnterpriseEmp(EnterpriseEmp enterpriseEmp) {
        enterpriseEmp.setEdittime(new Date());
        return enterpriseEmpMapper.updateByPrimaryKeySelective(enterpriseEmp);
    }

    public int updataEnterpriseEmpByExample(Enterprise enterprise) {
        EnterpriseEmpExample example = new EnterpriseEmpExample();
        Criteria criteria = example.createCriteria();
        EnterpriseEmp enterpriseEmp = new EnterpriseEmp();
        enterpriseEmp.setStatus(1);
        int i = 0;
        criteria.andEnterpriseEmpIdEqualTo(enterprise.getEnterpriseId());
        i = enterpriseEmpMapper.updateByExampleSelective(enterpriseEmp, example);
        return i;
    }

    public int updataEnterpriseEmpByExample(EnterpriseDep enterpriseDep) {
        EnterpriseEmpExample example = new EnterpriseEmpExample();
        Criteria criteria = example.createCriteria();
        EnterpriseEmp enterpriseEmp = new EnterpriseEmp();
        enterpriseEmp.setStatus(1);
        criteria.andEnterpriseEmpIdEqualTo(enterpriseDep.getEnterpriseDepId());
        int i = enterpriseEmpMapper.updateByExampleSelective(enterpriseEmp, example);
        return i;
    }

    /** 
    *  获取部门下的员工信息
    * <p>Title: getAllEnterpriseEmpByPage</p> 
    * <p>Description: </p> 
    * @param page
    * @param rows
    * @param enterpriseDeptId
    * @return
    * @see br.order.user.service.empComUser.EnterpriseEmpService#getAllEnterpriseEmpByPage(java.lang.Integer, java.lang.Integer, java.lang.String) 
    */
    public PageInfo<EnterpriseEmpVo> getAllEnterpriseEmpByPage(Integer page, Integer rows, String enterpriseDeptId) {
        PageHelper.startPage(page, rows);
        EnterpriseEmpExample example = new EnterpriseEmpExample();
        Criteria criteria = example.createCriteria();
        criteria.andEnterpriseDepIdEqualTo(enterpriseDeptId).andStatusEqualTo(0);
        List<EnterpriseEmp> empList = enterpriseEmpMapper.selectByExample(example);
        PageInfo<EnterpriseEmp> pageInfo = new PageInfo<EnterpriseEmp>(empList);
        List<EnterpriseEmpVo> result = new ArrayList<EnterpriseEmpVo>();
        EnterpriseDep dep = null;
        Enterprise com = null;
        EnterpriseEmpVo enterpriseEmpVo = null;
        CustomerInfo customerInfo=null;
        try {
            for (EnterpriseEmp enterpriseEmp : empList) {
                dep = enterpriseDepMapper.selectByPrimaryKey(enterpriseEmp.getEnterpriseDepId());
                com = enterpriseMapper.selectByPrimaryKey(enterpriseEmp.getEnterpriseId());
                customerInfo=customerInfoMapper.selectByPrimaryKey(enterpriseEmp.getCustomerInfoId());
                enterpriseEmpVo = new EnterpriseEmpVo();
                BeanUtils.copyProperties(enterpriseEmpVo, enterpriseEmp);
                BeanUtils.copyProperties(enterpriseEmpVo, dep);
                BeanUtils.copyProperties(enterpriseEmpVo, com);
                BeanUtils.copyProperties(enterpriseEmpVo, customerInfo);
                result.add(enterpriseEmpVo);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        PageInfo<EnterpriseEmpVo> resultPageInfo = new PageInfo<EnterpriseEmpVo>(result);
        resultPageInfo.setLastPage(pageInfo.getLastPage());
        resultPageInfo.setTotal(pageInfo.getTotal());
        resultPageInfo.setIsFirstPage(pageInfo.isIsFirstPage());
        resultPageInfo.setIsLastPage(pageInfo.isIsLastPage());
        resultPageInfo.setNextPage(pageInfo.getNextPage());
        resultPageInfo.setStartRow(pageInfo.getStartRow());
        resultPageInfo.setEndRow(pageInfo.getEndRow());
        resultPageInfo.setNavigatepageNums(pageInfo.getNavigatepageNums());
        return resultPageInfo;
    }

    /**
    	 * <p>Title:getEmterPriseEmpById</p> 
    	 * <p>Description: 根据enterpriseEmpId获取员工信息</p> 
    	 * @param enterpriseEmpId
    	 * @return
         * @see br.order.user.service.empComUser.EnterpriseEmpService#getEmterPriseEmpById(java.lang.Long)
    	 */
    public EnterpriseEmp getEmterPriseEmpById(String enterpriseEmpId) {
        return enterpriseEmpMapper.selectByPrimaryKey(enterpriseEmpId);
    }

    /** 
    *  获取部门下的员工数量
    * <p>Title: countEmpNumByDeptId</p> 
    * <p>Description: </p> 
    * @param enterpriseDeptId 部门id
    * @return
    * @see br.order.user.service.empComUser.EnterpriseEmpService#countEmpNumByDeptId(java.lang.String) 
    */
    public int countEmpNumByDeptId(String enterpriseDeptId) {
        EnterpriseEmpExample example = new EnterpriseEmpExample();
        Criteria criteria = example.createCriteria();
        criteria.andEnterpriseDepIdEqualTo(enterpriseDeptId).andStatusEqualTo(0);
        return enterpriseEmpMapper.countByExample(example);
    }

}
