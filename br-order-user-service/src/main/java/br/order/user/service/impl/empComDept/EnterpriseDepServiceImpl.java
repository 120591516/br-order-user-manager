package br.order.user.service.impl.empComDept;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.order.common.utils.MyPredicate;
import br.order.user.mapper.empComDept.EnterpriseDepMapper;
import br.order.user.mapper.empComDept.self.EnterpriseDepSelfMapper;
import br.order.user.pojo.empComDept.EnterpriseDep;
import br.order.user.pojo.empComDept.EnterpriseDepExample;
import br.order.user.pojo.empComDept.EnterpriseDepExample.Criteria;
import br.order.user.service.empComDept.EnterpriseDepService;
import br.order.user.vo.empComDept.EnterpriseDepTreeVo;
import br.order.user.vo.empComDept.EnterpriseDepVo;

/** 
* (企业部门service)
* @ClassName: EnterpriseDepServiceImpl 
* @Description: TODO(企业部门service) 
* @author 王文腾
* @date 2016年9月14日 上午11:56:28 
*/
@Service
public class EnterpriseDepServiceImpl implements EnterpriseDepService {
    @Autowired
    private EnterpriseDepMapper enterpriseDepMapper;

    @Autowired
    private EnterpriseDepSelfMapper enterpriseDepSelfMapper;

    /**
    	 * <p>Title:insertEnterpriseDep</p> 
    	 * <p>Description: 添加企业部门信息</p> 
    	 * @param enterpriseDep
    	 * @return
         * @see br.order.user.service.empComDept.EnterpriseDepService#insertEnterpriseDep(br.order.user.pojo.permission.EnterpriseDep)
    	 */
    public int insertEnterpriseDep(EnterpriseDep enterpriseDep) {
        enterpriseDep.setEnterpriseDepId(UUIDUtils.getId());
        return enterpriseDepMapper.insertSelective(enterpriseDep);
    }

    /**
    	 * <p>Title:updateEnterpriseDep</p> 
    	 * <p>Description:修改企业的信息 </p> 
    	 * @param enterpriseDep
    	 * @return
         * @see br.order.user.service.empComDept.EnterpriseDepService#updateEnterpriseDep(br.order.user.pojo.permission.EnterpriseDep)
    	 */
    public int updateEnterpriseDep(EnterpriseDep enterpriseDep) {
        // TODO Auto-generated method stub
        return enterpriseDepMapper.updateByPrimaryKeySelective(enterpriseDep);
    }

    /** 
    *  获取企业部门列表
    * <p>Title: getAllEnterpriseDep</p> 
    * <p>Description: </p> 
    * @param enterpriseDepVo
    * @return
    * @see br.order.user.service.empComDept.EnterpriseDepService#getAllEnterpriseDep(br.order.user.vo.empComDept.EnterpriseDepVo) 
    */
    public List<EnterpriseDepVo> getAllEnterpriseDep(EnterpriseDepVo enterpriseDepVo) {
        return enterpriseDepSelfMapper.getAllEnterpriseDepByPage(enterpriseDepVo);
    }
    
    /** 
    *  获取当前企业下的部门列表
    * <p>Title: getDepInEnterprise</p> 
    * <p>Description: </p> 
    * @param entDepVo
    * @return
    * @see br.order.user.service.empComDept.EnterpriseDepService#getDepInEnterprise(br.order.user.vo.empComDept.EnterpriseDepVo) 
    */
    public List<EnterpriseDep> getDepInEnterprise(String  enterpriseId) {
        EnterpriseDepExample example=new EnterpriseDepExample();
        Criteria criteria = example.createCriteria();
        criteria.andEnterpriseIdEqualTo(enterpriseId).andEnterpriseDepStatusEqualTo(0);
        return enterpriseDepMapper.selectByExample(example);
    }

    /**
    	 * <p>Title:getEnterpriseDepById</p> 
    	 * <p>Description:查询部门信息 </p> 
    	 * @param enterpriseDeptId
    	 * @return
         * @see br.order.user.service.empComDept.EnterpriseDepService#getEnterpriseDepById(java.lang.Long)
    	 */
    public EnterpriseDep getEnterpriseDepById(String enterpriseDeptId) {
        return enterpriseDepMapper.selectByPrimaryKey(enterpriseDeptId);
    }

    /**
    	 * <p>Title:getAllEnterpriseDep</p> 
    	 * <p>Description: 分页查询企业下部门的列表</p> 
    	 * @param page
    	 * @param rows
    	 * @param enterpriseDepVo
    	 * @return
         * @see br.order.user.service.empComDept.EnterpriseDepService#getAllEnterpriseDep(java.lang.Integer, java.lang.Integer, br.order.user.vo.empComDept.EnterpriseDepVo)
    	 */
    public PageInfo<EnterpriseDepVo> getAllEnterpriseDep(Integer page, Integer rows, EnterpriseDepVo enterpriseDepVo) {
        // TODO Auto-generated method stub
        PageHelper.startPage(page, rows);
        List<EnterpriseDepVo> allEnterpriseDep = enterpriseDepSelfMapper.getAllEnterpriseDepByPage(enterpriseDepVo);
        PageInfo<EnterpriseDepVo> pageInfo = new PageInfo<EnterpriseDepVo>(allEnterpriseDep);
        return pageInfo;
    }

    /**
    	 * <p>Title:getValidEnterpriseDep</p> 
    	 * <p>Description:获取部门的有效信息 </p> 
    	 * @param enterpriseDep
    	 * @return
         * @see br.order.user.service.empComDept.EnterpriseDepService#getValidEnterpriseDep(br.order.user.pojo.permission.EnterpriseDep)
    	 */
    public List<EnterpriseDep> getValidEnterpriseDep() {
        EnterpriseDepExample example = new EnterpriseDepExample();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andEnterpriseDepStatusEqualTo(0);
        return enterpriseDepMapper.selectByExample(example);

    }

    public List<EnterpriseDepTreeVo> getMenuTree(String empId) {
        EnterpriseDepExample example = new EnterpriseDepExample();
        Criteria criteria = example.createCriteria();
        criteria.andEnterpriseDepStatusEqualTo(0).andEnterpriseIdEqualTo(empId);
        List<EnterpriseDep> enterpriseDep = enterpriseDepMapper.selectByExample(example);
        Predicate predicate = new MyPredicate("enterpriseDepParentId", "0");
        List<EnterpriseDep> top = (List<EnterpriseDep>) CollectionUtils.select(enterpriseDep, predicate);
        List<EnterpriseDepTreeVo> reslut = new ArrayList<EnterpriseDepTreeVo>();
        EnterpriseDepTreeVo depTreeVo = null;
        for (EnterpriseDep entDep : enterpriseDep) {
            depTreeVo = new EnterpriseDepTreeVo();
            depTreeVo.setId(entDep.getEnterpriseDepId());
            depTreeVo.setpId(entDep.getEnterpriseDepParentId());
            depTreeVo.setName(entDep.getEnterpriseDepName());
            if (entDep.getEnterpriseDepParentId().equals("0")) {
                depTreeVo.setOpen(true);
            }
            reslut.add(depTreeVo);
        }
        return reslut;
    }

    /** 
    *  获取该部门下级部门数量
    * <p>Title: countDeptChildNum</p> 
    * <p>Description: </p> 
    * @param enterpriseDeptId 部门id
    * @return
    * @see br.order.user.service.empComDept.EnterpriseDepService#countDeptChildNum(java.lang.String) 
    */
    public int countDeptChildNum(String enterpriseDeptId) {
        EnterpriseDepExample example = new EnterpriseDepExample();
        Criteria criteria = example.createCriteria();
        criteria.andEnterpriseDepStatusEqualTo(0).andEnterpriseDepParentIdEqualTo(enterpriseDeptId);
        int count =enterpriseDepMapper.countByExample(example);
        return count;
    }

    public int checkDeptName(String enterpriseDeptName) {
        EnterpriseDepExample example = new EnterpriseDepExample();
        Criteria criteria = example.createCriteria();
        criteria.andEnterpriseDepNameEqualTo(enterpriseDeptName);
        int count =enterpriseDepMapper.countByExample(example);
        return count;
    }

/*    
 * 迭代遍历部门树咱不用
 * private EnterpriseDepTreeVo iteration(EnterpriseDep top, List<EnterpriseDep> enterpriseDep) {
        EnterpriseDepTreeVo enterpriseDepTreeVo = new EnterpriseDepTreeVo();
        enterpriseDepTreeVo.setId(top.getEnterpriseDepId());
        enterpriseDepTreeVo.setpId(top.getEnterpriseDepParentId());
        enterpriseDepTreeVo.setName(top.getEnterpriseDepName());
        enterpriseDepTreeVo.setOpen(false);
        Predicate predicate = new MyPredicate("enterpriseDepParentId", enterpriseDepTreeVo.getId());
        List<EnterpriseDep> children = (List<EnterpriseDep>) CollectionUtils.select(enterpriseDep, predicate);
        for (EnterpriseDep entDep3 : children) {
            EnterpriseDepTreeVo childrens = new EnterpriseDepTreeVo();
            childrens.setId(entDep3.getEnterpriseDepId());
            childrens.setpId(entDep3.getEnterpriseDepParentId());
            childrens.setName(entDep3.getEnterpriseDepName());
            childrens.setOpen(false);
//            childrens.setChildrens(iteration(entDep3, enterpriseDep).getChildrens());
//            enterpriseDepTreeVo.getChildrens().add(childrens);
        }
        return enterpriseDepTreeVo;
    }*/
        
}
