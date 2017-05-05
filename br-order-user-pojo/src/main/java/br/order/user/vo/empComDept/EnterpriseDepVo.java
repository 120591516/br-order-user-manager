package br.order.user.vo.empComDept;

import java.io.Serializable;

import br.order.user.pojo.empComDept.EnterpriseDep;

public class EnterpriseDepVo extends EnterpriseDep implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String enterpriseFullName;

    private String enterpriseSimpleName;

    private String enterpriseCode;

    public String getEnterpriseFullName() {
        return enterpriseFullName;
    }

    public void setEnterpriseFullName(String enterpriseFullName) {
        this.enterpriseFullName = enterpriseFullName;
    }

    public String getEnterpriseSimpleName() {
        return enterpriseSimpleName;
    }

    public void setEnterpriseSimpleName(String enterpriseSimpleName) {
        this.enterpriseSimpleName = enterpriseSimpleName;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

}
