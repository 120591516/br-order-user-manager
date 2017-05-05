package br.order.user.vo.empUserRelation;

import java.io.Serializable;

import br.order.user.pojo.empUserRelation.Relationship;

public class RelationShipVo extends Relationship implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sex;//性别  0：男   1：女
	private String relation;//关系
	private Integer register;//是否注册  0：是   1：否  
	private String sexName;
	private String customerInfoPhone;
	private String customerInfoEmail;
	private String customerInfoName;
	private String customerInfoIdentityNumber;
	private String relationName;
	
	
	public String getSexName() {
		return sexName;
	}
	public void setSexName(String sexName) {
		this.sexName = sexName;
	}
	public String getRelationName() {
		return relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public Integer getRegister() {
		return register;
	}
	public void setRegister(Integer register) {
		this.register = register;
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
	public String getCustomerInfoName() {
		return customerInfoName;
	}
	public void setCustomerInfoName(String customerInfoName) {
		this.customerInfoName = customerInfoName;
	}
	public String getCustomerInfoIdentityNumber() {
		return customerInfoIdentityNumber;
	}
	public void setCustomerInfoIdentityNumber(String customerInfoIdentityNumber) {
		this.customerInfoIdentityNumber = customerInfoIdentityNumber;
	}
	
	
}
