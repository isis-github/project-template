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
 * The persistent class for the CMS_MEDIA database table.
 * 
 */
@Entity
@Table(name="CMS_MEDIA")
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_MEDIA_MEDIAID_GENERATOR", sequenceName="CMS_MEDIA_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_MEDIA_MEDIAID_GENERATOR")
	@Column(name="MEDIA_ID", unique=true, nullable=false)
	private Long mediaId;

	@Column(name="ARTICLE_TITLE", length=200)
	private String articleTitle;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	private int length;

	@Column(length=200)
	private String name;

	@Column(length=200)
	private String path;

	@Column(name="TYPE")
	private int type;

	//bi-directional many-to-one association to Article
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ARTICLE_ID", nullable=false)
	private Article Article;
	
	//bi-directional many-to-one association to Article
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="FOLDER_ID", nullable=false)
		private Folder folder;

	public Media() {
	}

	public Long getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(Long mediaId) {
		this.mediaId = mediaId;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
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

}