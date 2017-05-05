package br.order.user.vo.empUser;

import java.io.Serializable;
import java.util.Date;

import br.order.user.pojo.empUser.CustomerRegist;

public class CustomerRegistVo extends CustomerRegist implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerInfoName;
	private String enterpriseId;
	private String enterpriseFullName;
    private String customerInfoPhone;
    private String customerInfoEmail;
    private String customerInfoHeadImg;
    private Integer customerInfoSex;
    private String customerInfoIdentityNumber;
    private String customerInfoAddress;
    private Integer customerInfoStatus;
    private String customerInfoEditId;
    private Date customerInfoCreateTime;
    public String getCustomerInfoName() {
		return customerInfoName;
	}
	public void setCustomerInfoName(String customerInfoName) {
		this.customerInfoName = customerInfoName;
	}
	public String getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseFullName() {
		return enterpriseFullName;
	}
	public void setEnterpriseFullName(String enterpriseFullName) {
		this.enterpriseFullName = enterpriseFullName;
	}
	public String getCustomerInfoPhone() {
		return customerInfoPhone;
	}
	public void setCustomerInfoPhone(String customerInfoPhone) {
		this.customerInfoPhone = customerInfoPhone;
	}
	public String getCustomerInfoEmail() {
		return customerInfoEmail;
	}
	public void setCustomerInfoEmail(String customerInfoEmail) {
		this.customerInfoEmail = customerInfoEmail;
	}
	public String getCustomerInfoHeadImg() {
		return customerInfoHeadImg;
	}
	public void setCustomerInfoHeadImg(String customerInfoHeadImg) {
		this.customerInfoHeadImg = customerInfoHeadImg;
	}
	public Integer getCustomerInfoSex() {
		return customerInfoSex;
	}
	public void setCustomerInfoSex(Integer customerInfoSex) {
		this.customerInfoSex = customerInfoSex;
	}
	public String getCustomerInfoIdentityNumber() {
		return customerInfoIdentityNumber;
	}
	public void setCustomerInfoIdentityNumber(String customerInfoIdentityNumber) {
		this.customerInfoIdentityNumber = customerInfoIdentityNumber;
	}
	public String getCustomerInfoAddress() {
		return customerInfoAddress;
	}
	public void setCustomerInfoAddress(String customerInfoAddress) {
		this.customerInfoAddress = customerInfoAddress;
	}
	public Integer getCustomerInfoStatus() {
		return customerInfoStatus;
	}
	public void setCustomerInfoStatus(Integer customerInfoStatus) {
		this.customerInfoStatus = customerInfoStatus;
	}
	public String getCustomerInfoEditId() {
		return customerInfoEditId;
	}
	public void setCustomerInfoEditId(String customerInfoEditId) {
		this.customerInfoEditId = customerInfoEditId;
	}
	public Date getCustomerInfoCreateTime() {
		return customerInfoCreateTime;
	}
	public void setCustomerInfoCreateTime(Date customerInfoCreateTime) {
		this.customerInfoCreateTime = customerInfoCreateTime;
	}
	public Date getCustomerInfoEditTime() {
		return customerInfoEditTime;
	}
	public void setCustomerInfoEditTime(Date customerInfoEditTime) {
		this.customerInfoEditTime = customerInfoEditTime;
	}
	private Date customerInfoEditTime;
    
    

	
	

}
