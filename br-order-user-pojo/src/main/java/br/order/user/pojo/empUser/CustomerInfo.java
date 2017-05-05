package br.order.user.pojo.empUser;

import java.io.Serializable;
import java.util.Date;

public class CustomerInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customerInfoId;

    private String customerInfoPhone;

    private String customerInfoEmail;

    private String customerInfoHeadImg;

    private Integer customerInfoSex;

    private String customerInfoName;

    private String customerInfoIdentityNumber;

    private Long provinceId;

    private Long cityId;

    private Long areaId;

    private String customerInfoAddress;

    private Integer customerInfoStatus;

    private String customerInfoEditId;

    private Date customerInfoCreateTime;

    private Date customerInfoEditTime;

    public String getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(String customerInfoId) {
        this.customerInfoId = customerInfoId == null ? null : customerInfoId.trim();
    }

    public String getCustomerInfoPhone() {
        return customerInfoPhone;
    }

    public void setCustomerInfoPhone(String customerInfoPhone) {
        this.customerInfoPhone = customerInfoPhone == null ? null : customerInfoPhone.trim();
    }

    public String getCustomerInfoEmail() {
        return customerInfoEmail;
    }

    public void setCustomerInfoEmail(String customerInfoEmail) {
        this.customerInfoEmail = customerInfoEmail == null ? null : customerInfoEmail.trim();
    }

    public String getCustomerInfoHeadImg() {
        return customerInfoHeadImg;
    }

    public void setCustomerInfoHeadImg(String customerInfoHeadImg) {
        this.customerInfoHeadImg = customerInfoHeadImg == null ? null : customerInfoHeadImg.trim();
    }

    public Integer getCustomerInfoSex() {
        return customerInfoSex;
    }

    public void setCustomerInfoSex(Integer customerInfoSex) {
        this.customerInfoSex = customerInfoSex;
    }

    public String getCustomerInfoName() {
        return customerInfoName;
    }

    public void setCustomerInfoName(String customerInfoName) {
        this.customerInfoName = customerInfoName == null ? null : customerInfoName.trim();
    }

    public String getCustomerInfoIdentityNumber() {
        return customerInfoIdentityNumber;
    }

    public void setCustomerInfoIdentityNumber(String customerInfoIdentityNumber) {
        this.customerInfoIdentityNumber = customerInfoIdentityNumber == null ? null : customerInfoIdentityNumber.trim();
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getCustomerInfoAddress() {
        return customerInfoAddress;
    }

    public void setCustomerInfoAddress(String customerInfoAddress) {
        this.customerInfoAddress = customerInfoAddress == null ? null : customerInfoAddress.trim();
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
        this.customerInfoEditId = customerInfoEditId == null ? null : customerInfoEditId.trim();
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
}