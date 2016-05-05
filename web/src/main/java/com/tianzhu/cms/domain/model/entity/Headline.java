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
 * The persistent class for the CMS_HEADLINE database table.
 * 
 */
@Entity
@Table(name="CMS_HEADLINE")
@NamedQuery(name="Headline.findAll", query="SELECT h FROM Headline h")
public class Headline implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_HEADLINE_HEADLINEID_GENERATOR", sequenceName="CMS_HEADLINE_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_HEADLINE_HEADLINEID_GENERATOR")
	@Column(name="HEADLINE_ID", unique=true, nullable=false)
	private Long headlineId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=200)
	private String name;

	@Column(length=200)
	private String picture;

	private int sort;

	@Column(length=200)
	private String url;

	public Headline() {
	}

	public Long getHeadlineId() {
		return this.headlineId;
	}

	public void setHeadlineId(Long headlineId) {
		this.headlineId = headlineId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String piture) {
		this.picture = piture;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}