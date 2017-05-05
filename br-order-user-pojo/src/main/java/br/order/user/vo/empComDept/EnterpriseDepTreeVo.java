package br.order.user.vo.empComDept;

import java.io.Serializable;

/** 
* 
* @ClassName: EnterpriseDepTreeVo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 王文腾
* @date 2016年11月22日 下午4:46:53 
*/
public class EnterpriseDepTreeVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String pId;

    private String name;

    private boolean open;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
