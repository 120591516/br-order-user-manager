package br.order.user.pojo.empComUser;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseEmp implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseEmpId;

    private String enterpriseId;

    private String enterpriseDepId;

    private String customerInfoId;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getEnterpriseEmpId() {
        return enterpriseEmpId;
    }

    public void setEnterpriseEmpId(String enterpriseEmpId) {
        this.enterpriseEmpId = enterpriseEmpId == null ? null : enterpriseEmpId.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getEnterpriseDepId() {
        return enterpriseDepId;
    }

    public void setEnterpriseDepId(String enterpriseDepId) {
        this.enterpriseDepId = enterpriseDepId == null ? null : enterpriseDepId.trim();
    }

    public String getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(String customerInfoId) {
        this.customerInfoId = customerInfoId == null ? null : customerInfoId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }
}