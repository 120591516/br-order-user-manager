package br.order.user.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class DictRelationship implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long dictRelationId;

    private String dictRelationName;

    private String dictRelationCode;

    private String dictRelationInputCode;

    private String dictRelationNote;

    private String dictRelationCodex;

    private Date dictRelationCreateTime;

    private Date dictRelationEditTime;

    private Integer dictRelationStatus;

    public Long getDictRelationId() {
        return dictRelationId;
    }

    public void setDictRelationId(Long dictRelationId) {
        this.dictRelationId = dictRelationId;
    }

    public String getDictRelationName() {
        return dictRelationName;
    }

    public void setDictRelationName(String dictRelationName) {
        this.dictRelationName = dictRelationName == null ? null : dictRelationName.trim();
    }

    public String getDictRelationCode() {
        return dictRelationCode;
    }

    public void setDictRelationCode(String dictRelationCode) {
        this.dictRelationCode = dictRelationCode == null ? null : dictRelationCode.trim();
    }

    public String getDictRelationInputCode() {
        return dictRelationInputCode;
    }

    public void setDictRelationInputCode(String dictRelationInputCode) {
        this.dictRelationInputCode = dictRelationInputCode == null ? null : dictRelationInputCode.trim();
    }

    public String getDictRelationNote() {
        return dictRelationNote;
    }

    public void setDictRelationNote(String dictRelationNote) {
        this.dictRelationNote = dictRelationNote == null ? null : dictRelationNote.trim();
    }

    public String getDictRelationCodex() {
        return dictRelationCodex;
    }

    public void setDictRelationCodex(String dictRelationCodex) {
        this.dictRelationCodex = dictRelationCodex == null ? null : dictRelationCodex.trim();
    }

    public Date getDictRelationCreateTime() {
        return dictRelationCreateTime;
    }

    public void setDictRelationCreateTime(Date dictRelationCreateTime) {
        this.dictRelationCreateTime = dictRelationCreateTime;
    }

    public Date getDictRelationEditTime() {
        return dictRelationEditTime;
    }

    public void setDictRelationEditTime(Date dictRelationEditTime) {
        this.dictRelationEditTime = dictRelationEditTime;
    }

    public Integer getDictRelationStatus() {
        return dictRelationStatus;
    }

    public void setDictRelationStatus(Integer dictRelationStatus) {
        this.dictRelationStatus = dictRelationStatus;
    }
}