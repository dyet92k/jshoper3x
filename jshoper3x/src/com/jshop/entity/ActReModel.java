package com.jshop.entity;

// Generated 2013-10-6 17:36:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ActReModel generated by hbm2java
 */
@Entity
@Table(name = "act_re_model", catalog = "jshoper3")
public class ActReModel implements java.io.Serializable {

	private String id;
	private ActGeBytearray actGeBytearrayByEditorSourceExtraValueId;
	private ActGeBytearray actGeBytearrayByEditorSourceValueId;
	private ActReDeployment actReDeployment;
	private Integer rev;
	private String name;
	private String key;
	private String category;
	private Date createTime;
	private Date lastUpdateTime;
	private Integer version;
	private String metaInfo;

	public ActReModel() {
	}

	public ActReModel(String id, Date createTime, Date lastUpdateTime) {
		this.id = id;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	public ActReModel(String id,
			ActGeBytearray actGeBytearrayByEditorSourceExtraValueId,
			ActGeBytearray actGeBytearrayByEditorSourceValueId,
			ActReDeployment actReDeployment, Integer rev, String name,
			String key, String category, Date createTime, Date lastUpdateTime,
			Integer version, String metaInfo) {
		this.id = id;
		this.actGeBytearrayByEditorSourceExtraValueId = actGeBytearrayByEditorSourceExtraValueId;
		this.actGeBytearrayByEditorSourceValueId = actGeBytearrayByEditorSourceValueId;
		this.actReDeployment = actReDeployment;
		this.rev = rev;
		this.name = name;
		this.key = key;
		this.category = category;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
		this.version = version;
		this.metaInfo = metaInfo;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EDITOR_SOURCE_EXTRA_VALUE_ID_")
	public ActGeBytearray getActGeBytearrayByEditorSourceExtraValueId() {
		return this.actGeBytearrayByEditorSourceExtraValueId;
	}

	public void setActGeBytearrayByEditorSourceExtraValueId(
			ActGeBytearray actGeBytearrayByEditorSourceExtraValueId) {
		this.actGeBytearrayByEditorSourceExtraValueId = actGeBytearrayByEditorSourceExtraValueId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EDITOR_SOURCE_VALUE_ID_")
	public ActGeBytearray getActGeBytearrayByEditorSourceValueId() {
		return this.actGeBytearrayByEditorSourceValueId;
	}

	public void setActGeBytearrayByEditorSourceValueId(
			ActGeBytearray actGeBytearrayByEditorSourceValueId) {
		this.actGeBytearrayByEditorSourceValueId = actGeBytearrayByEditorSourceValueId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPLOYMENT_ID_")
	public ActReDeployment getActReDeployment() {
		return this.actReDeployment;
	}

	public void setActReDeployment(ActReDeployment actReDeployment) {
		this.actReDeployment = actReDeployment;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "NAME_")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "KEY_")
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "CATEGORY_")
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_", nullable = false, length = 0)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_TIME_", nullable = false, length = 0)
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "VERSION_")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "META_INFO_", length = 4000)
	public String getMetaInfo() {
		return this.metaInfo;
	}

	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}

}
