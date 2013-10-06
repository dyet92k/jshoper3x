package com.jshop.entity;

// Generated 2013-10-6 17:36:02 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ExpresstempleteT generated by hbm2java
 */
@Entity
@Table(name = "expresstemplete_t", catalog = "jshoper3")
public class ExpresstempleteT implements java.io.Serializable {

	private String expresstempleteid;
	private String sendName;
	private String sendCountry;
	private String sendProvince;
	private String sendCity;
	private String sendDistrict;
	private String sendStreet;
	private String sendTelno;
	private String sendMobile;
	private String recipientName;
	private String recipientCountry;
	private String recipientProvince;
	private String recipientCity;
	private String recipientDistrict;
	private String recipientStreet;
	private String recipientTelno;
	private String recipientMobile;
	private String recipientPostcode;
	private String year;
	private String month;
	private String day;
	private String orderid;
	private String notes;
	private String sendTime;
	private String rightTag;
	private String logisticsid;
	private String state;
	private String expressCss;
	private String expressImg;
	private String kindeditorCode;
	private String sendContactor;
	private String recipientContactor;
	private String hour;
	private String minutes;
	private String quantity;

	public ExpresstempleteT() {
	}

	public ExpresstempleteT(String expresstempleteid) {
		this.expresstempleteid = expresstempleteid;
	}

	public ExpresstempleteT(String expresstempleteid, String sendName,
			String sendCountry, String sendProvince, String sendCity,
			String sendDistrict, String sendStreet, String sendTelno,
			String sendMobile, String recipientName, String recipientCountry,
			String recipientProvince, String recipientCity,
			String recipientDistrict, String recipientStreet,
			String recipientTelno, String recipientMobile,
			String recipientPostcode, String year, String month, String day,
			String orderid, String notes, String sendTime, String rightTag,
			String logisticsid, String state, String expressCss,
			String expressImg, String kindeditorCode, String sendContactor,
			String recipientContactor, String hour, String minutes,
			String quantity) {
		this.expresstempleteid = expresstempleteid;
		this.sendName = sendName;
		this.sendCountry = sendCountry;
		this.sendProvince = sendProvince;
		this.sendCity = sendCity;
		this.sendDistrict = sendDistrict;
		this.sendStreet = sendStreet;
		this.sendTelno = sendTelno;
		this.sendMobile = sendMobile;
		this.recipientName = recipientName;
		this.recipientCountry = recipientCountry;
		this.recipientProvince = recipientProvince;
		this.recipientCity = recipientCity;
		this.recipientDistrict = recipientDistrict;
		this.recipientStreet = recipientStreet;
		this.recipientTelno = recipientTelno;
		this.recipientMobile = recipientMobile;
		this.recipientPostcode = recipientPostcode;
		this.year = year;
		this.month = month;
		this.day = day;
		this.orderid = orderid;
		this.notes = notes;
		this.sendTime = sendTime;
		this.rightTag = rightTag;
		this.logisticsid = logisticsid;
		this.state = state;
		this.expressCss = expressCss;
		this.expressImg = expressImg;
		this.kindeditorCode = kindeditorCode;
		this.sendContactor = sendContactor;
		this.recipientContactor = recipientContactor;
		this.hour = hour;
		this.minutes = minutes;
		this.quantity = quantity;
	}

	@Id
	@Column(name = "EXPRESSTEMPLETEID", unique = true, nullable = false, length = 20)
	public String getExpresstempleteid() {
		return this.expresstempleteid;
	}

	public void setExpresstempleteid(String expresstempleteid) {
		this.expresstempleteid = expresstempleteid;
	}

	@Column(name = "SEND_NAME", length = 45)
	public String getSendName() {
		return this.sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
	}

	@Column(name = "SEND_COUNTRY", length = 20)
	public String getSendCountry() {
		return this.sendCountry;
	}

	public void setSendCountry(String sendCountry) {
		this.sendCountry = sendCountry;
	}

	@Column(name = "SEND_PROVINCE", length = 20)
	public String getSendProvince() {
		return this.sendProvince;
	}

	public void setSendProvince(String sendProvince) {
		this.sendProvince = sendProvince;
	}

	@Column(name = "SEND_CITY", length = 20)
	public String getSendCity() {
		return this.sendCity;
	}

	public void setSendCity(String sendCity) {
		this.sendCity = sendCity;
	}

	@Column(name = "SEND_DISTRICT", length = 20)
	public String getSendDistrict() {
		return this.sendDistrict;
	}

	public void setSendDistrict(String sendDistrict) {
		this.sendDistrict = sendDistrict;
	}

	@Column(name = "SEND_STREET", length = 20)
	public String getSendStreet() {
		return this.sendStreet;
	}

	public void setSendStreet(String sendStreet) {
		this.sendStreet = sendStreet;
	}

	@Column(name = "SEND_TELNO", length = 20)
	public String getSendTelno() {
		return this.sendTelno;
	}

	public void setSendTelno(String sendTelno) {
		this.sendTelno = sendTelno;
	}

	@Column(name = "SEND_MOBILE", length = 20)
	public String getSendMobile() {
		return this.sendMobile;
	}

	public void setSendMobile(String sendMobile) {
		this.sendMobile = sendMobile;
	}

	@Column(name = "RECIPIENT_NAME", length = 20)
	public String getRecipientName() {
		return this.recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	@Column(name = "RECIPIENT_COUNTRY", length = 20)
	public String getRecipientCountry() {
		return this.recipientCountry;
	}

	public void setRecipientCountry(String recipientCountry) {
		this.recipientCountry = recipientCountry;
	}

	@Column(name = "RECIPIENT_PROVINCE", length = 20)
	public String getRecipientProvince() {
		return this.recipientProvince;
	}

	public void setRecipientProvince(String recipientProvince) {
		this.recipientProvince = recipientProvince;
	}

	@Column(name = "RECIPIENT_CITY", length = 20)
	public String getRecipientCity() {
		return this.recipientCity;
	}

	public void setRecipientCity(String recipientCity) {
		this.recipientCity = recipientCity;
	}

	@Column(name = "RECIPIENT_DISTRICT", length = 20)
	public String getRecipientDistrict() {
		return this.recipientDistrict;
	}

	public void setRecipientDistrict(String recipientDistrict) {
		this.recipientDistrict = recipientDistrict;
	}

	@Column(name = "RECIPIENT_STREET", length = 20)
	public String getRecipientStreet() {
		return this.recipientStreet;
	}

	public void setRecipientStreet(String recipientStreet) {
		this.recipientStreet = recipientStreet;
	}

	@Column(name = "RECIPIENT_TELNO", length = 20)
	public String getRecipientTelno() {
		return this.recipientTelno;
	}

	public void setRecipientTelno(String recipientTelno) {
		this.recipientTelno = recipientTelno;
	}

	@Column(name = "RECIPIENT_MOBILE", length = 20)
	public String getRecipientMobile() {
		return this.recipientMobile;
	}

	public void setRecipientMobile(String recipientMobile) {
		this.recipientMobile = recipientMobile;
	}

	@Column(name = "RECIPIENT_POSTCODE", length = 20)
	public String getRecipientPostcode() {
		return this.recipientPostcode;
	}

	public void setRecipientPostcode(String recipientPostcode) {
		this.recipientPostcode = recipientPostcode;
	}

	@Column(name = "YEAR", length = 20)
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(name = "MONTH", length = 20)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Column(name = "DAY", length = 20)
	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Column(name = "ORDERID", length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "NOTES", length = 20)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "SEND_TIME", length = 20)
	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	@Column(name = "RIGHT_TAG", length = 20)
	public String getRightTag() {
		return this.rightTag;
	}

	public void setRightTag(String rightTag) {
		this.rightTag = rightTag;
	}

	@Column(name = "LOGISTICSID", length = 20)
	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	@Column(name = "STATE", length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "EXPRESS_CSS", length = 500)
	public String getExpressCss() {
		return this.expressCss;
	}

	public void setExpressCss(String expressCss) {
		this.expressCss = expressCss;
	}

	@Column(name = "EXPRESS_IMG")
	public String getExpressImg() {
		return this.expressImg;
	}

	public void setExpressImg(String expressImg) {
		this.expressImg = expressImg;
	}

	@Column(name = "KINDEDITOR_CODE", length = 65535)
	public String getKindeditorCode() {
		return this.kindeditorCode;
	}

	public void setKindeditorCode(String kindeditorCode) {
		this.kindeditorCode = kindeditorCode;
	}

	@Column(name = "SEND_CONTACTOR", length = 20)
	public String getSendContactor() {
		return this.sendContactor;
	}

	public void setSendContactor(String sendContactor) {
		this.sendContactor = sendContactor;
	}

	@Column(name = "RECIPIENT_CONTACTOR", length = 20)
	public String getRecipientContactor() {
		return this.recipientContactor;
	}

	public void setRecipientContactor(String recipientContactor) {
		this.recipientContactor = recipientContactor;
	}

	@Column(name = "HOUR", length = 20)
	public String getHour() {
		return this.hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	@Column(name = "MINUTES", length = 20)
	public String getMinutes() {
		return this.minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	@Column(name = "QUANTITY", length = 20)
	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
