package com.jshop.entity;

// Generated 2013-10-6 17:36:02 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GoodsTypeBrandT generated by hbm2java
 */
@Entity
@Table(name = "goods_type_brand_t", catalog = "jshoper3")
public class GoodsTypeBrandT implements java.io.Serializable {

	private String goodsTypeBrandTid;
	private String goodsTypeId;
	private String name;
	private String brandname;
	private String brandid;

	public GoodsTypeBrandT() {
	}

	public GoodsTypeBrandT(String goodsTypeBrandTid) {
		this.goodsTypeBrandTid = goodsTypeBrandTid;
	}

	public GoodsTypeBrandT(String goodsTypeBrandTid, String goodsTypeId,
			String name, String brandname, String brandid) {
		this.goodsTypeBrandTid = goodsTypeBrandTid;
		this.goodsTypeId = goodsTypeId;
		this.name = name;
		this.brandname = brandname;
		this.brandid = brandid;
	}

	@Id
	@Column(name = "GOODS_TYPE_BRAND_TID", unique = true, nullable = false, length = 20)
	public String getGoodsTypeBrandTid() {
		return this.goodsTypeBrandTid;
	}

	public void setGoodsTypeBrandTid(String goodsTypeBrandTid) {
		this.goodsTypeBrandTid = goodsTypeBrandTid;
	}

	@Column(name = "GOODS_TYPE_ID", length = 20)
	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	@Column(name = "NAME", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "BRANDNAME", length = 45)
	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Column(name = "BRANDID", length = 20)
	public String getBrandid() {
		return this.brandid;
	}

	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}

}
