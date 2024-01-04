package com.reinext.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//�ЪF&�޲z���q���
@Entity
@Table(name = "landlord")
public class Landlord {

	// landlord_id (���Wint)(�D��)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LANDLORD_ID")
	private int landlordId;

	// �ЪF�m�W
	@Column(name = "LESSOR_NAME")
	private String lessorName;

	// �ЪF�q��
	@Column(name = "LESSOR_PHONE")
	private String lessorPhone;

	// �ЪF�a�}
	@Column(name = "LESSOR_ADDRESS")
	private String lessorAddress;

	// �޲z���q�W��
	@Column(name = "COMPANY_NAME")
	private String companyName;

	// �޲z���q�q��
	@Column(name = "COMPANY_PHONE")
	private String companyPhone;

	// �޲z���q�a�}
	@Column(name = "COMPANY_ADDRESS")
	private String companyAddress;

	// �޲z���q��~�s��
	@Column(name = "COMPANY_ID")
	private String companyId;

	// �޲z(���q)�H���m�W
	@Column(name = "MANAGER_NAME")
	private String managerName;

	/* �H�U�p�G�ЪF�P�ЫΩҦ��̤��P�~�ݭn��g */
	// (�Ы�)�֦��̩m�W
	@Column(name = "OWNER_NAME")
	private String ownerName;

	// (�Ы�)�֦��̦a�}
	@Column(name = "OWNER_ADDRESS")
	private String ownerAddress;

	/* ��I�Я��b���T */
	// �O�_�λȦ�b����b�I��
	@Column(name = "ACCOUNT")
	private String account;

	/* �p�Gaccount = false�h���ζ�g�U���T */

	// ����W��
	@Column(name = "BRANCH_NAME")
	private String branchName;

	// �b������
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;

	// �Ȧ�b��
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;

	// �b���Ҧ��̩m�W(���W)
	@Column(name = "HOLDER_NAME")
	private String holderName;

	// (��b)����O�t���
	@Column(name = "FEE_BEARER")
	private String feeBearer;

	// ����room_id���~����
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
