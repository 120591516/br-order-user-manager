package br.order.user.pojo.empCom;

import java.io.Serializable;
import java.util.Date;

public class Enterprise implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseId;

    private String enterpriseFullName;

    private String enterpriseSimpleName;

    private String enterpriseCode;

    private String enterpriceLicenseImgId;

    private String enterpriceLicenseNo;

    private String enterpriceLicenseOpenImgId;

    private String enterpriceConnEmpId;

    private String enterpriceLicensePerson;

    private Long provinceId;

    private Long cityId;

    private Long areaId;

    private String enterpriseAddress;

    private Integer enterpriseStatus;

    private Date enterpriseCreateTime;

    private Date enterpriseEditTime;

    private String enterpriseEditId;

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getEnterpriseFullName() {
        return enterpriseFullName;
    }

    public void setEnterpriseFullName(String enterpriseFullName) {
        this.enterpriseFullName = enterpriseFullName == null ? null : enterpriseFullName.trim();
    }

    public String getEnterpriseSimpleName() {
        return enterpriseSimpleName;
    }

    public void setEnterpriseSimpleName(String enterpriseSimpleName) {
        this.enterpriseSimpleName = enterpriseSimpleName == null ? null : enterpriseSimpleName.trim();
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode == null ? null : enterpriseCode.trim();
    }

    public String getEnterpriceLicenseImgId() {
        return enterpriceLicenseImgId;
    }

    public void setEnterpriceLicenseImgId(String enterpriceLicenseImgId) {
        this.enterpriceLicenseImgId = enterpriceLicenseImgId == null ? null : enterpriceLicenseImgId.trim();
    }

    public String getEnterpriceLicenseNo() {
        return enterpriceLicenseNo;
    }

    public void setEnterpriceLicenseNo(String enterpriceLicenseNo) {
        this.enterpriceLicenseNo = enterpriceLicenseNo == null ? null : enterpriceLicenseNo.trim();
    }

    public String getEnterpriceLicenseOpenImgId() {
        return enterpriceLicenseOpenImgId;
    }

    public void setEnterpriceLicenseOpenImgId(String enterpriceLicenseOpenImgId) {
        this.enterpriceLicenseOpenImgId = enterpriceLicenseOpenImgId == null ? null : enterpriceLicenseOpenImgId.trim();
    }

    public String getEnterpriceConnEmpId() {
        return enterpriceConnEmpId;
    }

    public void setEnterpriceConnEmpId(String enterpriceConnEmpId) {
        this.enterpriceConnEmpId = enterpriceConnEmpId == null ? null : enterpriceConnEmpId.trim();
    }

    public String getEnterpriceLicensePerson() {
        return enterpriceLicensePerson;
    }

    public void setEnterpriceLicensePerson(String enterpriceLicensePerson) {
        this.enterpriceLicensePerson = enterpriceLicensePerson == null ? null : enterpriceLicensePerson.trim();
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

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress == null ? null : enterpriseAddress.trim();
    }

    public Integer getEnterpriseStatus() {
        return enterpriseStatus;
    }

    public void setEnterpriseStatus(Integer enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
    }

    public Date getEnterpriseCreateTime() {
        return enterpriseCreateTime;
    }

    public void setEnterpriseCreateTime(Date enterpriseCreateTime) {
        this.enterpriseCreateTime = enterpriseCreateTime;
    }

    public Date getEnterpriseEditTime() {
        return enterpriseEditTime;
    }

    public void setEnterpriseEditTime(Date enterpriseEditTime) {
        this.enterpriseEditTime = enterpriseEditTime;
    }

    public String getEnterpriseEditId() {
        return enterpriseEditId;
    }

    public void setEnterpriseEditId(String enterpriseEditId) {
        this.enterpriseEditId = enterpriseEditId == null ? null : enterpriseEditId.trim();
    }
}