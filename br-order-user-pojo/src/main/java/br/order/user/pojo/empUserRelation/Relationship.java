package br.order.user.pojo.empUserRelation;

import java.io.Serializable;
import java.util.Date;

public class Relationship implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String relationshipId;

    private String customerInfoId;

    private String customerInfoRelationId;

    private Long dictRelationId;

    private Integer status;

    private Date createtime;

    private Date edittime;

    public String getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId == null ? null : relationshipId.trim();
    }

    public String getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(String customerInfoId) {
        this.customerInfoId = customerInfoId == null ? null : customerInfoId.trim();
    }

    public String getCustomerInfoRelationId() {
        return customerInfoRelationId;
    }

    public void setCustomerInfoRelationId(String customerInfoRelationId) {
        this.customerInfoRelationId = customerInfoRelationId == null ? null : customerInfoRelationId.trim();
    }

    public Long getDictRelationId() {
        return dictRelationId;
    }

    public void setDictRelationId(Long dictRelationId) {
        this.dictRelationId = dictRelationId;
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