package com.reinext.rental.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//租戶資料
@Entity
@Table(name = "tenant")
public class Tenant {
	// landlord_id (遞增int)(主鍵)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TENANT_ID")
	private int tenantId;

	// 租客姓名
	@Column(name = "TENANT_NAME")
	private String tenantName;

	// 租客年齡
	@Column(name = "TENANT_AGE")
	private String tenantAge;

	// 住戶姓名(複數)
	@Column(name = "RESIDENT_NAME")
	private String residentName;

	// 住戶年齡(複數)
	@Column(name = "RESIDENT_AGE")
	private String residentAge;

	// 聯絡人姓名
	@Column(name = "CONTACT_NAME")
	private String contactName;

	// 租戶和聯絡人的關係
	@Column(name = "RELATIONSHIP")
	private String relationship;

	// 聯絡人地址
	@Column(name = "CONTACT_ADDRESS")
	private String contactAddress;

	// 聯絡人電話
	@Column(name = "CONTACT_PHONE")
	private String contactPhone;

	// 聯絡人公司地址
	@Column(name = "COMPANY_ADDRESS")
	private String companyAddressNum;

	// 聯絡人公司電話
	@Column(name = "COMPANY_PHONE")
	private String companyPhoneNumber;

	// 聯絡人手機號碼
	@Column(name = "CELLPHONE")
	private String cellphone;

	// 合約開始時間
	@Column(name = "START_DATE")
	private LocalDate startDate;

	// 合約結束時間
	@Column(name = "END_DATE")
	private LocalDate endDate;

	// 交付租屋處日期
	@Column(name = "DELIVERY_DATE")
	private LocalDate deliveryDate;

	// 對應room_id的外部鍵
	@Column(name = "ROOM_ID")
	private int roomId;

	public Tenant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tenant(String tenantName, String tenantAge, String residentName, String residentAge, String contactName,
			String relationship, String contactAddress, String contactPhone, String companyAddressNum,
			String companyPhoneNumber, String cellphone, LocalDate startDate, LocalDate endDate, LocalDate deliveryDate,
			int roomId) {
		super();
		this.tenantName = tenantName;
		this.tenantAge = tenantAge;
		this.residentName = residentName;
		this.residentAge = residentAge;
		this.contactName = contactName;
		this.relationship = relationship;
		this.contactAddress = contactAddress;
		this.contactPhone = contactPhone;
		this.companyAddressNum = companyAddressNum;
		this.companyPhoneNumber = companyPhoneNumber;
		this.cellphone = cellphone;
		this.startDate = startDate;
		this.endDate = endDate;
		this.deliveryDate = deliveryDate;
		this.roomId = roomId;
	}

	public Tenant(int tenantId, String tenantName, String tenantAge, String residentName, String residentAge,
			String contactName, String relationship, String contactAddress, String contactPhone,
			String companyAddressNum, String companyPhoneNumber, String cellphone, LocalDate startDate,
			LocalDate endDate, LocalDate deliveryDate, int roomId) {
		super();
		this.tenantId = tenantId;
		this.tenantName = tenantName;
		this.tenantAge = tenantAge;
		this.residentName = residentName;
		this.residentAge = residentAge;
		this.contactName = contactName;
		this.relationship = relationship;
		this.contactAddress = contactAddress;
		this.contactPhone = contactPhone;
		this.companyAddressNum = companyAddressNum;
		this.companyPhoneNumber = companyPhoneNumber;
		this.cellphone = cellphone;
		this.startDate = startDate;
		this.endDate = endDate;
		this.deliveryDate = deliveryDate;
		this.roomId = roomId;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenantAge() {
		return tenantAge;
	}

	public void setTenantAge(String tenantAge) {
		this.tenantAge = tenantAge;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getResidentAge() {
		return residentAge;
	}

	public void setResidentAge(String residentAge) {
		this.residentAge = residentAge;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getCompanyAddressNum() {
		return companyAddressNum;
	}

	public void setCompanyAddressNum(String companyAddressNum) {
		this.companyAddressNum = companyAddressNum;
	}

	public String getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}

	public void setCompanyPhoneNumber(String companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

}
