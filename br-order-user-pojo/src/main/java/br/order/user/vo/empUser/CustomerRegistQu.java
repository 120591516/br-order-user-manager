package br.order.user.vo.empUser;

import java.io.Serializable;

/** 
 * <b>Application 注册用户信息列表查询条件:</b>CSTP维护<br>
 * <b>Application describing:</b> <br>
 * <b>Copyright:</b>Copyright &copy; 2016 CSTP部版权所有。<br>
 * <b>Company:</b>CSTP<br>
 * <b>Date:</b>2016年9月9日<br>
 * @author Author
 * @version $Revision$
 */ 
public class CustomerRegistQu implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String enterpriseFullName;
    private String enterpriseCode;
    private String enterpriceLicenseNo;
    private String customerInfoName;
    private String customerInfoPhone;
    public String getEnterpriseFullName() {
        return enterpriseFullName;
    }
    public void setEnterpriseFullName(String enterpriseFullName) {
        this.enterpriseFullName = enterpriseFullName;
    }
    public String getEnterpriseCode() {
        return enterpriseCode;
    }
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }
    public String getEnterpriceLicenseNo() {
        return enterpriceLicenseNo;
    }
    public void setEnterpriceLicenseNo(String enterpriceLicenseNo) {
        this.enterpriceLicenseNo = enterpriceLicenseNo;
    }
    public String getCustomerInfoName() {
        return customerInfoName;
    }
    public void setCustomerInfoName(String customerInfoName) {
        this.customerInfoName = customerInfoName;
    }
    public String getCustomerInfoPhone() {
        return customerInfoPhone;
    }
    public void setCustomerInfoPhone(String customerInfoPhone) {
        this.customerInfoPhone = customerInfoPhone;
    }
    
}
