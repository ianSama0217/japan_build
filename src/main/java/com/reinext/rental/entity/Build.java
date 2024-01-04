package com.reinext.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "build")
public class Build {

	// build_id (遞增int)(主鍵)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	// 建築物名稱
	@Column(name = "BUILD_NAME")
	private String buildName;

	// 建築物在哪一棟(可能有A、B、C棟)
	@Column(name = "BUILD")
	private String buildNum;

	// 都道府縣
	@Column(name = "PREF")
	private String pref;

	// 市町村
	@Column(name = "MUNI")
	private String muni;

	// 建築物地址
	@Column(name = "ADDRESS")
	private String address;

	// 建物類型(公寓、社區大樓)
	@Column(name = "BUILD_TYPE")
	private String buildType;

	// 土地權狀
	@Column(name = "LAND_TITLE")
	private String landTitle;

	// 建材
	@Column(name = "MATERIAL")
	private String material;

	// 戶數(決定一筆build的room資料數量)
	@Column(name = "HOUSEHOLDS")
	private String houseHolds;

	// 建造日期(年)
	@Column(name = "BULID_DATE_YEAR")
	private String buildDateYear;

	// 建造日期(月)
	@Column(name = "BULID_DATE_MONTH")
	private String buildDateMonth;

	// 整修年分
	@Column(name = "REPAIR_DATE_YEAR")
	private String repairDateYear;

	/* 公共設備資訊 */
	// 電梯
	@Column(name = "ELEVATOR")
	private String elevator;

	// 電梯備註
	@Column(name = "ELEVATOR_REMARK")
	private String elevatorRemark;

	// 電子鎖
	@Column(name = "AUTO_LOCK")
	private String autoLock;

	// 電子鎖備註
	@Column(name = "AUTO_LOCK_REMARK")
	private String autoLockRemark;

	// 信箱
	@Column(name = "MAIL_BOX")
	private String mailBox;

	// 信箱備註
	@Column(name = "MAIL_BOX_REMARK")
	private String mailBoxRemark;

	// 宅配箱
	@Column(name = "DELIVERY_BOX")
	private String deliveryBox;

	// 宅配箱備註
	@Column(name = "DELIVERY_BOX_REMARK")
	private String deliveryBoxRemark;

	// 儲物間
	@Column(name = "TRUNKROOM")
	private String trunkroom;

	// 儲物間是否可使用
	@Column(name = "TRUNKROOM_TYPE")
	private String trunkroomType;

	// 儲物間備註說明
	@Column(name = "TRUNKROOM_REMARK")
	private String trunkroomRemark;

	// 汽車停車場
	@Column(name = "CAR_PARKING")
	private String carParking;

	// 汽車停車場是否可使用
	@Column(name = "CAR_PARKING_TYPE")
	private String carParkingType;

	// 汽車停車場備註說明
	@Column(name = "CAR_PARKING_REMARK")
	private String carParkingRemark;

	// 腳踏車停車場
	@Column(name = "BICYCLE_PARKING")
	private String bicycleParking;

	// 腳踏車停車場是否可使用
	@Column(name = "BICYCLE_PARKING_TYPE")
	private String bicycleParkingType;

	// 腳踏車停車場備註說明
	@Column(name = "BICYCLE_PARKING_REMARK")
	private String bicycleParkingRemark;

	// 機車停車場
	@Column(name = "BIKE_PARKING")
	private String bikeParking;

	// 機車停車場是否可使用
	@Column(name = "BIKE_PARKING_TYPE")
	private String bikeParkingType;

	// 機車停車場備註說明
	@Column(name = "BIKE_PARKING_REMARK")
	private String bikeParkingRemark;

	public Build() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 新增用的建構方法(沒id)
	public Build(String buildName, String buildNum, String pref, String muni, String address, String buildType,
			String landTitle, String material, String houseHolds, String buildDateYear, String buildDateMonth,
			String repairDateYear, String elevator, String elevatorRemark, String autoLock, String autoLockRemark,
			String mailBox, String mailBoxRemark, String deliveryBox, String deliveryBoxRemark, String trunkroom,
			String trunkroomType, String trunkroomRemark, String carParking, String carParkingType,
			String carParkingRemark, String bicycleParking, String bicycleParkingType, String bicycleParkingRemark,
			String bikeParking, String bikeParkingType, String bikeParkingRemark) {
		super();
		this.buildName = buildName;
		this.buildNum = buildNum;
		this.pref = pref;
		this.muni = muni;
		this.address = address;
		this.buildType = buildType;
		this.landTitle = landTitle;
		this.material = material;
		this.houseHolds = houseHolds;
		this.buildDateYear = buildDateYear;
		this.buildDateMonth = buildDateMonth;
		this.repairDateYear = repairDateYear;
		this.elevator = elevator;
		this.elevatorRemark = elevatorRemark;
		this.autoLock = autoLock;
		this.autoLockRemark = autoLockRemark;
		this.mailBox = mailBox;
		this.mailBoxRemark = mailBoxRemark;
		this.deliveryBox = deliveryBox;
		this.deliveryBoxRemark = deliveryBoxRemark;
		this.trunkroom = trunkroom;
		this.trunkroomType = trunkroomType;
		this.trunkroomRemark = trunkroomRemark;
		this.carParking = carParking;
		this.carParkingType = carParkingType;
		this.carParkingRemark = carParkingRemark;
		this.bicycleParking = bicycleParking;
		this.bicycleParkingType = bicycleParkingType;
		this.bicycleParkingRemark = bicycleParkingRemark;
		this.bikeParking = bikeParking;
		this.bikeParkingType = bikeParkingType;
		this.bikeParkingRemark = bikeParkingRemark;
	}

	// 更新用的建構方法(有build_id)
	public Build(int id, String buildName, String buildNum, String pref, String muni, String address, String buildType,
			String landTitle, String material, String houseHolds, String buildDateYear, String buildDateMonth,
			String repairDateYear, String elevator, String elevatorRemark, String autoLock, String autoLockRemark,
			String mailBox, String mailBoxRemark, String deliveryBox, String deliveryBoxRemark, String trunkroom,
			String trunkroomType, String trunkroomRemark, String carParking, String carParkingType,
			String carParkingRemark, String bicycleParking, String bicycleParkingType, String bicycleParkingRemark,
			String bikeParking, String bikeParkingType, String bikeParkingRemark) {
		super();
		this.id = id;
		this.buildName = buildName;
		this.buildNum = buildNum;
		this.pref = pref;
		this.muni = muni;
		this.address = address;
		this.buildType = buildType;
		this.landTitle = landTitle;
		this.material = material;
		this.houseHolds = houseHolds;
		this.buildDateYear = buildDateYear;
		this.buildDateMonth = buildDateMonth;
		this.repairDateYear = repairDateYear;
		this.elevator = elevator;
		this.elevatorRemark = elevatorRemark;
		this.autoLock = autoLock;
		this.autoLockRemark = autoLockRemark;
		this.mailBox = mailBox;
		this.mailBoxRemark = mailBoxRemark;
		this.deliveryBox = deliveryBox;
		this.deliveryBoxRemark = deliveryBoxRemark;
		this.trunkroom = trunkroom;
		this.trunkroomType = trunkroomType;
		this.trunkroomRemark = trunkroomRemark;
		this.carParking = carParking;
		this.carParkingType = carParkingType;
		this.carParkingRemark = carParkingRemark;
		this.bicycleParking = bicycleParking;
		this.bicycleParkingType = bicycleParkingType;
		this.bicycleParkingRemark = bicycleParkingRemark;
		this.bikeParking = bikeParking;
		this.bikeParkingType = bikeParkingType;
		this.bikeParkingRemark = bikeParkingRemark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getBuildNum() {
		return buildNum;
	}

	public void setBuildNum(String buildNum) {
		this.buildNum = buildNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}

	public String getLandTitle() {
		return landTitle;
	}

	public void setLandTitle(String landTitle) {
		this.landTitle = landTitle;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getHouseHolds() {
		return houseHolds;
	}

	public void setHouseHolds(String houseHolds) {
		this.houseHolds = houseHolds;
	}

	public String getBuildDateYear() {
		return buildDateYear;
	}

	public void setBuildDateYear(String buildDateYear) {
		this.buildDateYear = buildDateYear;
	}

	public String getBuildDateMonth() {
		return buildDateMonth;
	}

	public void setBuildDateMonth(String buildDateMonth) {
		this.buildDateMonth = buildDateMonth;
	}

	public String getRepairDateYear() {
		return repairDateYear;
	}

	public void setRepairDateYear(String repairDateYear) {
		this.repairDateYear = repairDateYear;
	}

	public String getElevator() {
		return elevator;
	}

	public void setElevator(String elevator) {
		this.elevator = elevator;
	}

	public String getElevatorRemark() {
		return elevatorRemark;
	}

	public void setElevatorRemark(String elevatorRemark) {
		this.elevatorRemark = elevatorRemark;
	}

	public String getAutoLock() {
		return autoLock;
	}

	public void setAutoLock(String autoLock) {
		this.autoLock = autoLock;
	}

	public String getAutoLockRemark() {
		return autoLockRemark;
	}

	public void setAutoLockRemark(String autoLockRemark) {
		this.autoLockRemark = autoLockRemark;
	}

	public String getMailBox() {
		return mailBox;
	}

	public void setMailBox(String mailBox) {
		this.mailBox = mailBox;
	}

	public String getMailBoxRemark() {
		return mailBoxRemark;
	}

	public void setMailBoxRemark(String mailBoxRemark) {
		this.mailBoxRemark = mailBoxRemark;
	}

	public String getDeliveryBox() {
		return deliveryBox;
	}

	public void setDeliveryBox(String deliveryBox) {
		this.deliveryBox = deliveryBox;
	}

	public String getDeliveryBoxRemark() {
		return deliveryBoxRemark;
	}

	public void setDeliveryBoxRemark(String deliveryBoxRemark) {
		this.deliveryBoxRemark = deliveryBoxRemark;
	}

	public String getTrunkroom() {
		return trunkroom;
	}

	public void setTrunkroom(String trunkroom) {
		this.trunkroom = trunkroom;
	}

	public String getTrunkroomType() {
		return trunkroomType;
	}

	public void setTrunkroomType(String trunkroomType) {
		this.trunkroomType = trunkroomType;
	}

	public String getTrunkroomRemark() {
		return trunkroomRemark;
	}

	public void setTrunkroomRemark(String trunkroomRemark) {
		this.trunkroomRemark = trunkroomRemark;
	}

	public String getCarParking() {
		return carParking;
	}

	public void setCarParking(String carParking) {
		this.carParking = carParking;
	}

	public String getCarParkingType() {
		return carParkingType;
	}

	public void setCarParkingType(String carParkingType) {
		this.carParkingType = carParkingType;
	}

	public String getCarParkingRemark() {
		return carParkingRemark;
	}

	public void setCarParkingRemark(String carParkingRemark) {
		this.carParkingRemark = carParkingRemark;
	}

	public String getBicycleParking() {
		return bicycleParking;
	}

	public void setBicycleParking(String bicycleParking) {
		this.bicycleParking = bicycleParking;
	}

	public String getBicycleParkingType() {
		return bicycleParkingType;
	}

	public void setBicycleParkingType(String bicycleParkingType) {
		this.bicycleParkingType = bicycleParkingType;
	}

	public String getBicycleParkingRemark() {
		return bicycleParkingRemark;
	}

	public void setBicycleParkingRemark(String bicycleParkingRemark) {
		this.bicycleParkingRemark = bicycleParkingRemark;
	}

	public String getBikeParking() {
		return bikeParking;
	}

	public void setBikeParking(String bikeParking) {
		this.bikeParking = bikeParking;
	}

	public String getBikeParkingType() {
		return bikeParkingType;
	}

	public void setBikeParkingType(String bikeParkingType) {
		this.bikeParkingType = bikeParkingType;
	}

	public String getBikeParkingRemark() {
		return bikeParkingRemark;
	}

	public void setBikeParkingRemark(String bikeParkingRemark) {
		this.bikeParkingRemark = bikeParkingRemark;
	}

	public String getPref() {
		return pref;
	}

	public void setPref(String pref) {
		this.pref = pref;
	}

	public String getMuni() {
		return muni;
	}

	public void setMuni(String muni) {
		this.muni = muni;
	}

}
