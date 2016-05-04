package com.tianzhu.web.domain.model;

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
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The persistent class for the T_USER database table.
 * 
 */
@Entity
@Table(name="T_USER")
@NamedQuery(name="TUser.findAll", query="SELECT u FROM TUser u")
public class TUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_USER_USERID_GENERATOR", sequenceName="T_USER_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_USER_USERID_GENERATOR")
	@Column(name="USER_ID")
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_AT")
	private Date createdAt;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_AT")
	private Date updatedAt;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_BIRTH")
	private Date birth;

	@Column(name="USER_EMAIL")
	private String email;

	@Column(name="USER_NAME")
	private String name;

	@Column(name="USER_PASSWORD")
	private String password;

	@Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

	public TUser() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer userId) {
		this.id = userId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date userBirth) {
		this.birth = userBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String userEmail) {
		this.email = userEmail;
	}

	public String getname() {
		return this.name;
	}

	public void setName(String userName) {
		this.name = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String userPassword) {
		this.password = userPassword;
	}

	 public Integer getVersion() {
	        return version;
	    }

	    public void setVersion(Integer version) {
	        this.version = version;
	    }
	    
	    @Override
	    public String toString() {
	        return ToStringBuilder.reflectionToString(this,
	                ToStringStyle.SHORT_PREFIX_STYLE);
	    }

}