package com.tianzhu.cms.domain.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CMS_COMMENT database table.
 * 
 */
@Entity
@Table(name="CMS_COMMENT")
@NamedQuery(name="Comment.findAll", query="SELECT c FROM Comment c")
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_COMMENT_COMMENTID_GENERATOR", sequenceName="CMS_COMMENT_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_COMMENT_COMMENTID_GENERATOR")
	@Column(name="COMMENT_ID", unique=true, nullable=false)
	private Long commentId;

	@Column(length=2000)
	private String content;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=45)
	private String email;

	@Column(name="FATHER_ID")
	private Long fatherId;

	@Column(length=45)
	private String ip;

	@Column(length=45)
	private String name;

	@Column(length=45)
	private String phone;

	@Column(nullable=false)
	private int status;
	
	@Column(name="KIND")
	private int kind;

	@Column(length=200)
	private String url;

	//bi-directional many-to-one association to Article
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ARTICLE_ID")
	private Article Article;
	
	
	//bi-directional many-to-one association to Article
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="FOLDER_ID")
		private Folder folder;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private User User;

	public Comment() {
	}

	public Long getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
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

	public Long getFatherId() {
		return this.fatherId;
	}

	public void setFatherId(Long fatherId) {
		this.fatherId = fatherId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getKind() {
		return this.kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Article getArticle() {
		return this.Article;
	}

	public void setArticle(Article Article) {
		this.Article = Article;
	}
	
	public Folder getFolder() {
		return this.folder;
	}

	public void setArticle(Folder folder) {
		this.folder = folder;
	}

	public User getUser() {
		return this.User;
	}

	public void setUser(User User) {
		this.User = User;
	}

}