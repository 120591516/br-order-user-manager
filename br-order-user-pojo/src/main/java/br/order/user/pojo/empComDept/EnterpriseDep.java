package br.order.user.pojo.empComDept;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseDep implements Serializable{
    private String enterpriseDepId;

    private String enterpriseDepParentId;

    private String enterpriseId;

    private String enterpriseDepName;

    private Integer enterpriseDepLevel;

    private Integer enterpriseDepStatus;

    private Date enterpriseDepCreateTime;

    private Date enterpriseDepEditTime;

    private String enterpriseDepEditId;

    public String getEnterpriseDepId() {
        return enterpriseDepId;
    }

    public void setEnterpriseDepId(String enterpriseDepId) {
        this.enterpriseDepId = enterpriseDepId == null ? null : enterpriseDepId.trim();
    }

    public String getEnterpriseDepParentId() {
        return enterpriseDepParentId;
    }

    public void setEnterpriseDepParentId(String enterpriseDepParentId) {
        this.enterpriseDepParentId = enterpriseDepParentId == null ? null : enterpriseDepParentId.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

    public String getEnterpriseDepName() {
        return enterpriseDepName;
    }

    public void setEnterpriseDepName(String enterpriseDepName) {
        this.enterpriseDepName = enterpriseDepName == null ? null : enterpriseDepName.trim();
    }

    public Integer getEnterpriseDepLevel() {
        return enterpriseDepLevel;
    }

    public void setEnterpriseDepLevel(Integer enterpriseDepLevel) {
        this.enterpriseDepLevel = enterpriseDepLevel;
    }

    public Integer getEnterpriseDepStatus() {
        return enterpriseDepStatus;
    }

    public void setEnterpriseDepStatus(Integer enterpriseDepStatus) {
        this.enterpriseDepStatus = enterpriseDepStatus;
    }

    public Date getEnterpriseDepCreateTime() {
        return enterpriseDepCreateTime;
    }

    public void setEnterpriseDepCreateTime(Date enterpriseDepCreateTime) {
        this.enterpriseDepCreateTime = enterpriseDepCreateTime;
    }

    public Date getEnterpriseDepEditTime() {
        return enterpriseDepEditTime;
    }

    public void setEnterpriseDepEditTime(Date enterpriseDepEditTime) {
        this.enterpriseDepEditTime = enterpriseDepEditTime;
    }

    public String getEnterpriseDepEditId() {
        return enterpriseDepEditId;
    }

    public void setEnterpriseDepEditId(String enterpriseDepEditId) {
        this.enterpriseDepEditId = enterpriseDepEditId == null ? null : enterpriseDepEditId.trim();
    }
}