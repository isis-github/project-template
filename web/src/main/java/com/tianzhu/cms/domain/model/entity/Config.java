package com.tianzhu.cms.domain.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CMS_CONFIG database table.
 * 
 */
@Entity
@Table(name="CMS_CONFIG")
@NamedQuery(name="Config.findAll", query="SELECT c FROM Config c")
public class Config implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_CONFIG_CONFIDID_GENERATOR", sequenceName="CMS_CONFIG_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_CONFIG_CONFIDID_GENERATOR")
	@Column(name="CONFID_ID", unique=true, nullable=false)
	private Long confidId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=2000)
	private String description;

	@Column(name="KEY", nullable=false, length=45)
	private String key;

	@Column(length=200)
	private String value;

	public Config() {
	}

	public Long getConfidId() {
		return this.confidId;
	}

	public void setConfidId(Long confidId) {
		this.confidId = confidId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}