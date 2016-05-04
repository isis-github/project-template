package com.tianzhu.cms.domain.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CMS_ARTICLE database table.
 * 
 */
@Entity
@Table(name="CMS_ARTICLE")
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_ARTICLE_ARTICLEID_GENERATOR", sequenceName="CMS_ARTICLE_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_ARTICLE_ARTICLEID_GENERATOR")
	@Column(name="ARTICLE_ID", unique=true, nullable=false)
	private Long articleId;

	@Column(name="COMMENT_COUNT", nullable=false)
	private int commentCount;

	@Lob
	private String content;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(name="IS_CHECK", nullable=false)
	private int isCheck;

	@Column(length=200)
	private String path;

	@Column(length=60)
	private String picture;

	@Column(nullable=false)
	private int status;

	@Column(length=2000)
	private String summary;

	@Column(nullable=false, length=200)
	private String title;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Column(name="VIEW_COUNT", nullable=false)
	private int viewCount;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="Article")
	private List<Comment> Comments;

	//bi-directional many-to-one association to Media
	@OneToMany(mappedBy="Article")
	private List<Media> Medias;

	//uni-directional many-to-one association to Admin
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ADMIN_ID", nullable=false)
	private Admin Admin;

	//bi-directional many-to-one association to Folder
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FOLDER_ID")
	private Folder Folder;

	public Article() {
	}

	public Long getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public int getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
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

	public int getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public List<Comment> getComments() {
		return this.Comments;
	}

	public void setComments(List<Comment> Comments) {
		this.Comments = Comments;
	}

	

	public List<Media> getMedias() {
		return this.Medias;
	}

	public void setMedias(List<Media> Medias) {
		this.Medias = Medias;
	}

	

	public Admin getAdmin() {
		return this.Admin;
	}

	public void setAdmin(Admin Admin) {
		this.Admin = Admin;
	}

	public Folder getFolder() {
		return this.Folder;
	}

	public void setFolder(Folder Folder) {
		this.Folder = Folder;
	}

}