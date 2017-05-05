package br.order.user.vo.empUser;

import java.io.Serializable;
import java.util.Date;

import br.order.user.pojo.empUser.CustomerInfo;

/** 
 * <b>Application 注册用户列表返回信息:</b>CSTP维护<br>
 * <b>Application describing:</b> <br>
 * <b>Copyright:</b>Copyright &copy; 2016 CSTP部版权所有。<br>
 * <b>Company:</b>CSTP<br>
 * <b>Date:</b>2016年9月9日<br>
 * @author Author
 * @version $Revision$
 */
public class CustomerInfoVo extends CustomerInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseFullName;

    private String customerRegistId;

    private String enterpriseCode;

    private String enterpriceLicenseNo;

    private String customerInfoNameEnterprise;

    private String customerInfoPhoneEnterprise;

    private Date customerRegistCreateTime;//注册时间

    public String getCustomerRegistId() {
        return customerRegistId;
    }

    public void setCustomerRegistId(String customerRegistId) {
        this.customerRegistId = customerRegistId;
    }

    public Date getCustomerRegistCreateTime() {
        return customerRegistCreateTime;
    }

    public void setCustomerRegistCreateTime(Date customerRegistCreateTime) {
        this.customerRegistCreateTime = customerRegistCreateTime;
    }

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

    public String getCustomerInfoNameEnterprise() {
        return customerInfoNameEnterprise;
    }

    public void setCustomerInfoNameEnterprise(String customerInfoNameEnterprise) {
        this.customerInfoNameEnterprise = customerInfoNameEnterprise;
    }

    public String getCustomerInfoPhoneEnterprise() {
        return customerInfoPhoneEnterprise;
    }

    public void setCustomerInfoPhoneEnterprise(String customerInfoPhoneEnterprise) {
        this.customerInfoPhoneEnterprise = customerInfoPhoneEnterprise;
    }

}
