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
 * The persistent class for the CMS_GUESTBOOK database table.
 * 
 */
@Entity
@Table(name="CMS_GUESTBOOK")
@NamedQuery(name="Guestbook.findAll", query="SELECT g FROM Guestbook g")
public class Guestbook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_GUESTBOOK_GUESTBOOKID_GENERATOR", sequenceName="CMS_GUESTBOOK_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_GUESTBOOK_GUESTBOOKID_GENERATOR")
	@Column(name="GUESTBOOK_ID", unique=true, nullable=false)
	private Long guestbookId;

	@Column(length=2000)
	private String content;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=100)
	private String email;

	@Column(length=45)
	private String name;

	@Column(length=2000)
	private String reply;

	@Temporal(TemporalType.DATE)
	@Column(name="REPLY_TIME")
	private Date replyTime;

	private int status;

	@Column(length=200)
	private String title;

	@Column(length=100)
	private String website;

	public Guestbook() {
	}

	public Long getGuestbookId() {
		return this.guestbookId;
	}

	public void setGuestbookId(Long guestbookId) {
		this.guestbookId = guestbookId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}