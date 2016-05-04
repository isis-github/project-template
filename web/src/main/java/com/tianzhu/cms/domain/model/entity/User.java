package com.tianzhu.cms.domain.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CMS_USER database table.
 * 
 */
@Entity
@Table(name="CMS_USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_USER_USERID_GENERATOR", sequenceName="CMS_USER_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_USER_USERID_GENERATOR")
	@Column(name="USER_ID", unique=true, nullable=false)
	private Long userId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=200)
	private String name;

	@Column(name="OPEN_ID")
	private Long openId;

	private int type;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="User")
	private List<Comment> Comments;

	public User() {
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Long getOpenId() {
		return this.openId;
	}

	public void setOpenId(Long openId) {
		this.openId = openId;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Comment> getComments() {
		return this.Comments;
	}

	public void setComments(List<Comment> Comments) {
		this.Comments = Comments;
	}

	

}