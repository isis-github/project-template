package com.tianzhu.cms.domain.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CMS_FOLDER database table.
 * 
 */
@Entity
@Table(name="CMS_FOLDER")
@NamedQuery(name="Folder.findAll", query="SELECT f FROM Folder f")
public class Folder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_FOLDER_FOLDERID_GENERATOR", sequenceName="CMS_FOLDER_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_FOLDER_FOLDERID_GENERATOR")
	@Column(name="FOLDER_ID", unique=true, nullable=false)
	private Long folderId;

	@Column(length=2000)
	private String content;

	@Column(nullable=false)
	private int count;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(nullable=false, length=45)
	private String ename;

	@Column(name="FATHER_ID", nullable=false)
	private Long fatherId;

	@Column(nullable=false)
	private int height;

	@Column(name="IS_CHECK", nullable=false)
	private int isCheck;

	@Column(name="LEVEL_ID", nullable=false)
	private int levelId;

	@Column(nullable=false, length=200)
	private String name;

	@Column(nullable=false, length=200)
	private String path;

	@Column(nullable=false)
	private int sort;

	@Column(nullable=false)
	private int status;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Column(nullable=false)
	private int width;

	//bi-directional many-to-many association to Admin
	@ManyToMany(mappedBy="Folders")
	private List<Admin> Admins;

	//bi-directional many-to-one association to Article
	@OneToMany(mappedBy="Folder")
	private List<Article> Articles;

	public Folder() {
	}

	public Long getFolderId() {
		return this.folderId;
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Long getFatherId() {
		return this.fatherId;
	}

	public void setFatherId(Long fatherId) {
		this.fatherId = fatherId;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public int getLevelId() {
		return this.levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
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

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public List<Admin> getAdmins() {
		return this.Admins;
	}

	public void setAdmins(List<Admin> Admins) {
		this.Admins = Admins;
	}

	public List<Article> getArticles() {
		return this.Articles;
	}

	public void setArticles(List<Article> Articles) {
		this.Articles = Articles;
	}

	

}