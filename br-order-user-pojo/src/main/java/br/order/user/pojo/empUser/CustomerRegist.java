package br.order.user.pojo.empUser;

import java.io.Serializable;
import java.util.Date;

public class CustomerRegist implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customerRegistId;

    private String customerInfoId;

    private String customerRegistPassword;

    private Integer customerPerson;

    private String customerPersonId;

    private Integer customerCompany;

    private String customerCompanyId;

    private Integer customerRegistEmail;

    private Integer customerRegistSms;

    private Integer customerRegistStatus;

    private Date customerRegistCreateTime;

    private Date customerRegistEditTime;

    public String getCustomerRegistId() {
        return customerRegistId;
    }

    public void setCustomerRegistId(String customerRegistId) {
        this.customerRegistId = customerRegistId == null ? null : customerRegistId.trim();
    }

    public String getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(String customerInfoId) {
        this.customerInfoId = customerInfoId == null ? null : customerInfoId.trim();
    }

    public String getCustomerRegistPassword() {
        return customerRegistPassword;
    }

    public void setCustomerRegistPassword(String customerRegistPassword) {
        this.customerRegistPassword = customerRegistPassword == null ? null : customerRegistPassword.trim();
    }

    public Integer getCustomerPerson() {
        return customerPerson;
    }

    public void setCustomerPerson(Integer customerPerson) {
        this.customerPerson = customerPerson;
    }

    public String getCustomerPersonId() {
        return customerPersonId;
    }

    public void setCustomerPersonId(String customerPersonId) {
        this.customerPersonId = customerPersonId == null ? null : customerPersonId.trim();
    }

    public Integer getCustomerCompany() {
        return customerCompany;
    }

    public void setCustomerCompany(Integer customerCompany) {
        this.customerCompany = customerCompany;
    }

    public String getCustomerCompanyId() {
        return customerCompanyId;
    }

    public void setCustomerCompanyId(String customerCompanyId) {
        this.customerCompanyId = customerCompanyId == null ? null : customerCompanyId.trim();
    }

    public Integer getCustomerRegistEmail() {
        return customerRegistEmail;
    }

    public void setCustomerRegistEmail(Integer customerRegistEmail) {
        this.customerRegistEmail = customerRegistEmail;
    }

    public Integer getCustomerRegistSms() {
        return customerRegistSms;
    }

    public void setCustomerRegistSms(Integer customerRegistSms) {
        this.customerRegistSms = customerRegistSms;
    }

    public Integer getCustomerRegistStatus() {
        return customerRegistStatus;
    }

    public void setCustomerRegistStatus(Integer customerRegistStatus) {
        this.customerRegistStatus = customerRegistStatus;
    }

    public Date getCustomerRegistCreateTime() {
        return customerRegistCreateTime;
    }

    public void setCustomerRegistCreateTime(Date customerRegistCreateTime) {
        this.customerRegistCreateTime = customerRegistCreateTime;
    }

    public Date getCustomerRegistEditTime() {
        return customerRegistEditTime;
    }

    public void setCustomerRegistEditTime(Date customerRegistEditTime) {
        this.customerRegistEditTime = customerRegistEditTime;
    }
}