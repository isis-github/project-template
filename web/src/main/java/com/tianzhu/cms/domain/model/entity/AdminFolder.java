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
 * The persistent class for the CMS_ADMIN_FOLDER database table.
 * 
 */
@Entity
@Table(name="CMS_ADMIN_FOLDER")
@NamedQuery(name="AdminFolder.findAll", query="SELECT a FROM AdminFolder a")
public class AdminFolder implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@SequenceGenerator(name="CMS_ADMIN_FOLDER_ID_GENERATOR", sequenceName="CMS_ADMIN_FOLDER_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_ADMIN_FOLDER_ID_GENERATOR")
	@Column(name="ID", unique=true, nullable=false)
	private Long id;

	@Column(name="ADMIN_ID")
	private Long adminId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(name="FOLDER_ID")
	private Long folderId;

	public AdminFolder() {
	}

	public Long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Long id) {
		this.adminId = id;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getFolderId() {
		return this.folderId;
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

}