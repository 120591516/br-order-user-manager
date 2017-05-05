package br.order.user.vo.empCom;

import java.io.Serializable;

import br.order.user.pojo.empCom.Enterprise;

public class EnterpriseVo extends Enterprise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	private String enterpriseLicenseImgUrl;//营业执照图片URL
	
	private String enterpriseLicenseOpenImgUrl;//开户许可证URL
	
	private String enterpriseConnEmpName;//联系人的姓名
	
	private String enterpriseConnEmpPhone;//联系人的电话
	
	private String enterpriseConnEmpEmail;//联系人Email
	
	private String enterpriseConnEmpIDCard;//联系人的身份证号
	
	

	public String getEnterpriseLicenseOpenImgUrl() {
		return enterpriseLicenseOpenImgUrl;
	}

	public void setEnterpriseLicenseOpenImgUrl(String enterpriseLicenseOpenImgUrl) {
		this.enterpriseLicenseOpenImgUrl = enterpriseLicenseOpenImgUrl;
	}

	public String getEnterpriseLicenseImgUrl() {
		return enterpriseLicenseImgUrl;
	}

	public void setEnterpriseLicenseImgUrl(String enterpriseLicenseImgUrl) {
		this.enterpriseLicenseImgUrl = enterpriseLicenseImgUrl;
	}

	public String getEnterpriseConnEmpName() {
		return enterpriseConnEmpName;
	}

	public void setEnterpriseConnEmpName(String enterpriseConnEmpName) {
		this.enterpriseConnEmpName = enterpriseConnEmpName;
	}

	public String getEnterpriseConnEmpPhone() {
		return enterpriseConnEmpPhone;
	}

	public void setEnterpriseConnEmpPhone(String enterpriseConnEmpPhone) {
		this.enterpriseConnEmpPhone = enterpriseConnEmpPhone;
	}

	public String getEnterpriseConnEmpEmail() {
		return enterpriseConnEmpEmail;
	}

	public void setEnterpriseConnEmpEmail(String enterpriseConnEmpEmail) {
		this.enterpriseConnEmpEmail = enterpriseConnEmpEmail;
	}

	public String getEnterpriseConnEmpIDCard() {
		return enterpriseConnEmpIDCard;
	}

	public void setEnterpriseConnEmpIDCard(String enterpriseConnEmpIDCard) {
		this.enterpriseConnEmpIDCard = enterpriseConnEmpIDCard;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
