package com.reinext.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//房東&管理公司資料
@Entity
@Table(name = "landlord")
public class Landlord {

	// landlord_id (遞增int)(主鍵)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LANDLORD_ID")
	private int landlordId;

	// 房東姓名
	@Column(name = "LESSOR_NAME")
	private String lessorName;

	// 房東電話
	@Column(name = "LESSOR_PHONE")
	private String lessorPhone;

	// 房東地址
	@Column(name = "LESSOR_ADDRESS")
	private String lessorAddress;

	// 管理公司名稱
	@Column(name = "COMPANY_NAME")
	private String companyName;

	// 管理公司電話
	@Column(name = "COMPANY_PHONE")
	private String companyPhone;

	// 管理公司地址
	@Column(name = "COMPANY_ADDRESS")
	private String companyAddress;

	// 管理公司營業編號
	@Column(name = "COMPANY_ID")
	private String companyId;

	// 管理(公司)人員姓名
	@Column(name = "MANAGER_NAME")
	private String managerName;

	/* 以下如果房東與房屋所有者不同才需要填寫 */
	// (房屋)擁有者姓名
	@Column(name = "OWNER_NAME")
	private String ownerName;

	// (房屋)擁有者地址
	@Column(name = "OWNER_ADDRESS")
	private String ownerAddress;

	/* 支付房租帳戶資訊 */
	// 是否用銀行帳戶轉帳付款
	@Column(name = "ACCOUNT")
	private String account;

	/* 如果account = false則不用填寫下方資訊 */

	// 分行名稱
	@Column(name = "BRANCH_NAME")
	private String branchName;

	// 帳戶類型
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;

	// 銀行帳號
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;

	// 帳號所有者姓名(假名)
	@Column(name = "HOLDER_NAME")
	private String holderName;

	// (轉帳)手續費負擔者
	@Column(name = "FEE_BEARER")
	private String feeBearer;

	// 對應room_id的外部鍵
	@Column(name = "ROOM_ID")
	private int roomId;

	public Landlord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Landlord(String lessorName, String lessorPhone, String lessorAddress, String companyName,
			String companyPhone, String companyAddress, String companyId, String managerName, String ownerName,
			String ownerAddress, String account, String branchName, String accountType, String accountNumber,
			String holderName, String feeBearer, int roomId) {
		super();
		this.lessorName = lessorName;
		this.lessorPhone = lessorPhone;
		this.lessorAddress = lessorAddress;
		this.companyName = companyName;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		this.companyId = companyId;
		this.managerName = managerName;
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.account = account;
		this.branchName = branchName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.feeBearer = feeBearer;
		this.roomId = roomId;
	}

	public Landlord(int landlordId, String lessorName, String lessorPhone, String lessorAddress, String companyName,
			String companyPhone, String companyAddress, String companyId, String managerName, String ownerName,
			String ownerAddress, String account, String branchName, String accountType, String accountNumber,
			String holderName, String feeBearer, int roomId) {
		super();
		this.landlordId = landlordId;
		this.lessorName = lessorName;
		this.lessorPhone = lessorPhone;
		this.lessorAddress = lessorAddress;
		this.companyName = companyName;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		this.companyId = companyId;
		this.managerName = managerName;
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.account = account;
		this.branchName = branchName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.feeBearer = feeBearer;
		this.roomId = roomId;
	}

	public int getLandlordId() {
		return landlordId;
	}

	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}

	public String getLessorName() {
		return lessorName;
	}

	public void setLessorName(String lessorName) {
		this.lessorName = lessorName;
	}

	public String getLessorPhone() {
		return lessorPhone;
	}

	public void setLessorPhone(String lessorPhone) {
		this.lessorPhone = lessorPhone;
	}

	public String getLessorAddress() {
		return lessorAddress;
	}

	public void setLessorAddress(String lessorAddress) {
		this.lessorAddress = lessorAddress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getFeeBearer() {
		return feeBearer;
	}

	public void setFeeBearer(String feeBearer) {
		this.feeBearer = feeBearer;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

}
