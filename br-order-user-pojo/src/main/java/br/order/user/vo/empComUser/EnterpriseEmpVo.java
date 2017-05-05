package br.order.user.vo.empComUser;

import java.io.Serializable;

import br.order.user.pojo.empComUser.EnterpriseEmp;

public class EnterpriseEmpVo extends EnterpriseEmp implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String enterpriseFullName;//公司全名

    private String enterpriseSimpleName;//公司简称

    private String enterpriseDepParentId;//上级部门id

    private String enterpriseCode;//公司代码

    private String enterpriseDepName;//部门名称

    private String customerInfoPhone;//手机号码

    private Integer customerInfoSex;//性别

    private String customerInfoIdentityNumber;//身份证号

    private String customerInfoName;//姓名

    private String customerInfoEmail;//邮箱

    public String getEnterpriseDepParentId() {
        return enterpriseDepParentId;
    }

    public void setEnterpriseDepParentId(String enterpriseDepParentId) {
        this.enterpriseDepParentId = enterpriseDepParentId;
    }

    public String getEnterpriseSimpleName() {
        return enterpriseSimpleName;
    }

    public void setEnterpriseSimpleName(String enterpriseSimpleName) {
        this.enterpriseSimpleName = enterpriseSimpleName;
    }

    public String getCustomerInfoEmail() {
        return customerInfoEmail;
    }

    public void setCustomerInfoEmail(String customerInfoEmail) {
        this.customerInfoEmail = customerInfoEmail;
    }

    public String getCustomerInfoPhone() {
        return customerInfoPhone;
    }

    public void setCustomerInfoPhone(String customerInfoPhone) {
        this.customerInfoPhone = customerInfoPhone;
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

    public String getCustomerInfoName() {
        return customerInfoName;
    }

    public void setCustomerInfoName(String customerInfoName) {
        this.customerInfoName = customerInfoName;
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

    public String getEnterpriseDepName() {
        return enterpriseDepName;
    }

    public void setEnterpriseDepName(String enterpriseDepName) {
        this.enterpriseDepName = enterpriseDepName;
    }

}
