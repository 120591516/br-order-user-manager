package br.order.user.service.impl.empUser;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import br.crm.common.utils.UUIDUtils;
import br.order.user.mapper.empUser.CustomerInfoMapper;
import br.order.user.mapper.empUser.self.CustomerInfoSelfMapper;
import br.order.user.pojo.empUser.CustomerInfo;
import br.order.user.pojo.empUser.CustomerInfoExample;
import br.order.user.pojo.empUser.CustomerInfoExample.Criteria;
import br.order.user.service.empUser.CustomerInfoService;
import br.order.user.vo.empUser.CustomerRegistVo;

/** 
* (客户信息service)
* @ClassName: CustomerInfoServiceImpl 
* @Description: TODO(客户信息service) 
* @author 王文腾
* @date 2016年9月14日 上午11:54:25 
*/
@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
    /**
     * {客户信息DAO}
     */
	@Autowired
    private HttpServletRequest request;
    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    @Autowired
    private CustomerInfoSelfMapper customerInfoSelfMapper;
    
    /**
    	 * <p>Title:insertCustomerInfo</p> 
    	 * <p>Description: 添加客户信息对象</p> 
    	 * @param customerInfo
    	 * @return
         * @see br.order.user.service.empUser.CustomerInfoService#insertCustomerInfo(br.order.user.pojo.permission.CustomerInfo)
    	 */
    public String insertCustomerInfo(CustomerInfo customerInfo) {
        customerInfo.setCustomerInfoId(UUIDUtils.getId());
        customerInfo.setCustomerInfoStatus(0);
        customerInfo.setCustomerInfoCreateTime(new Date());
        customerInfo.setCustomerInfoEditTime(customerInfo.getCustomerInfoCreateTime());
        customerInfoMapper.insertSelective(customerInfo);
        return customerInfo.getCustomerInfoId();
    }

    /**
    	 * <p>Title:updateCustomerInfo</p> 
    	 * <p>Description:  修改客户信息</p> 
    	 * @param customerInfo
    	 * @return
         * @see br.order.user.service.empUser.CustomerInfoService#updateCustomerInfo(br.order.user.pojo.permission.CustomerInfo)
    	 */
    public int updateCustomerInfo(CustomerInfo customerInfo) {
        customerInfo.setCustomerInfoEditTime(new Date());
        return customerInfoMapper.updateByPrimaryKeySelective(customerInfo);
    }

    /**
    	 * <p>Title:getCustomerInfo</p> 
    	 * <p>Description: 客户信息</p> 
    	 * @param customerInfoId
    	 * @return
         * @see br.order.user.service.empUser.CustomerInfoService#getCustomerInfo(java.lang.Long)
    	 */
    public CustomerInfo getCustomerInfo(String customerInfoId) {
        return customerInfoMapper.selectByPrimaryKey(customerInfoId);
    }

    /**
    	 * <p>Title:getCountByExample</p> 
    	 * <p>Description: 用户名重名校验</p> 
    	 * @param customerInfoPhone 注册手机
    	 * @param customerInfoEmail 注册邮箱
    	 * @return
         * @see br.order.user.service.empUser.CustomerInfoService#getCountByExample(java.lang.String, java.lang.String)
    	 */
    public int getCountByExample(String customerInfoId,String customerInfoPhone, String customerInfoEmail) {    	
        int i = 0;
        CustomerInfoExample example = new CustomerInfoExample();
        Criteria criteria = example.createCriteria();
        if (customerInfoPhone == null) {
            criteria.andCustomerInfoIdEqualTo(customerInfoId).andCustomerInfoEmailEqualTo(customerInfoEmail);
            i= customerInfoMapper.countByExample(example);
        }
        else {
            criteria.andCustomerInfoIdEqualTo(customerInfoId).andCustomerInfoPhoneEqualTo(customerInfoPhone);
            i = customerInfoMapper.countByExample(example);
        }
        return i;
    }

    //ycy  分页查询用户信息表
    /**
    	 * <p>Title:getCustomerInfoByPage</p> 
    	 * <p>Description: </p> 
    	 * @param page
    	 * @param rows
    	 * @param customerInfo
    	 * @return
         * @see br.order.user.service.empUser.CustomerInfoService#getCustomerInfoByPage(java.lang.Integer, java.lang.Integer, br.order.user.pojo.permission.CustomerInfo)
    	 */
    public PageInfo<CustomerInfo> getCustomerInfoByPage(Integer page, Integer rows, CustomerInfo customerInfo) {
        // TODO Auto-generated method stub
        PageHelper.startPage(page, rows);
        CustomerInfoExample example = new CustomerInfoExample();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andCustomerInfoStatusEqualTo(0);
        List<CustomerInfo> selectByExample = customerInfoMapper.selectByExample(example);
        PageInfo<CustomerInfo> pageInfo = new PageInfo<CustomerInfo>(selectByExample);
        return pageInfo;
    }

    public CustomerInfo getCustomerInfoById(String customerInfoId) {
        // TODO Auto-generated method stub
        return customerInfoSelfMapper.selectByPrimaryKey(customerInfoId);
    }

    public List<CustomerInfo> getCustomerInfoByPhone(String customerInfoPhone) {
        CustomerInfoExample example = new CustomerInfoExample();
        Criteria createCriteria = example.createCriteria();
        if (StringUtils.isNotEmpty(customerInfoPhone)) {
            createCriteria.andCustomerInfoPhoneEqualTo(customerInfoPhone);
        }

        return customerInfoMapper.selectByExample(example);
    }

    public CustomerInfo getCustomerInfoByPrimaryKey(String customerInfoId) {
        return customerInfoMapper.selectByPrimaryKey(customerInfoId);
    }

	public int getCountBy(String customerInfoPhone, String customerInfoEmail) {
		 int i = 0;
	        CustomerInfoExample example = new CustomerInfoExample();
	        Criteria criteria = example.createCriteria();
	        if (customerInfoPhone == null) {
	            criteria.andCustomerInfoEmailEqualTo(customerInfoEmail);
	            i= customerInfoMapper.countByExample(example);
	        }
	        else {
	            criteria.andCustomerInfoPhoneEqualTo(customerInfoPhone);
	            i = customerInfoMapper.countByExample(example);
	        }
	        return i;
	}

}
