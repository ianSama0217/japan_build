package com.reinext.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//�Ыθ�T(���ѳ]�ơB�Я��B�򯲶O�ΡB�̤j��s�O�ΡB�Ƶ�)
@Entity
@Table(name = "room")
public class Room {

	// room_id (���Wint)(�D��)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROOM_ID")
	private int roomId;

	// �ؿv���Ӽh
	@Column(name = "FLOOR")
	private String floor;
	// �ؿv���и�
	@Column(name = "ROOM_NUM")
	private String roomNum;

	// �Ф��槽
	@Column(name = "FLOOR_PLAN")
	private String floorPlan;

	// �Ǥ��W��
	@Column(name = "FLOOR_SPACE")
	private String floorSpace;

	// ���x(��L)�W��
	@Column(name = "BALCONY_SPACE")
	private String balconySpace;

	// �Я��O��
	@Column(name = "RENT_COST")
	private int rentCost;

	// ú����(�C��?��)
	@Column(name = "RENT_DEADLINE")
	private int rentDeadline;

	// �޲z�O
	@Column(name = "MANAGEMENT_FEE")
	private int managementFee;

	// ú����(�C��?��)
	@Column(name = "MANA_DEADLINE")
	private int manaDeadline;

	// ���(?�Ӥ�)
	@Column(name = "DEPOSIT")
	private int deposit;

	// �����O��
	@Column(name = "PARKING_COST")
	private int parkingCost;

	// ���[�]�ƶO��
	@Column(name = "FACILITY_FEE")
	private int facilityFee;

	// §��
	@Column(name = "KEY_MONEY")
	private int keyMoney;

	// �_�ͼƶq
	@Column(name = "KEY_COUNT")
	private String keyCount;

	// �q�O
	@Column(name = "ELECTRICITY")
	private String electricity;

	// �q�OID
	@Column(name = "ELECTRICITY_ID")
	private String electricityId;

	// �q�O���O
	@Column(name = "ELECTRICITY_TYPE")
	private String electricityType;

	// �q�O�Ƶ�����
	@Column(name = "ELECTRICITY_REMARK")
	private String electricityRemark;

	// �˴�
	@Column(name = "GAS")
	private String gas;

	// �˴�id
	@Column(name = "GAS_ID")
	private String gasId;

	// �˴����O
	@Column(name = "GAS_TYPE")
	private String gasType;

	// �˴��Ƶ�����
	@Column(name = "GAS_REMARK")
	private String gasRemark;

	// �˴��l
	@Column(name = "STOVE")
	private String stove;

	// �˴��l���O
	@Column(name = "STOVE_ID")
	private String stoveId;

	// �˴��l���O
	@Column(name = "STOVE_TYPE")
	private String stoveType;

	// �˴��l�Ƶ�����
	@Column(name = "STOVE_REMARK")
	private String stoveRemark;

	// �Ѥ�
	@Column(name = "WATER_SUPPLY")
	private String waterSupply;

	// �Ѥ�id
	@Column(name = "WATER_SUPPLY_ID")
	private String waterSupplyId;

	// �Ѥ�����
	@Column(name = "WATER_SUPPLY_TYPE")
	private String waterSupplyType;

	// �Ѥ��Ƶ�����
	@Column(name = "WATER_SUPPLY_REMARK")
	private String waterSupplyRemark;

	// �U���D(�Ƥ���)
	@Column(name = "SEWER")
	private String sewer;

	// �U���DID
	@Column(name = "SEWER_ID")
	private String sewerId;

	// �U���D���O
	@Column(name = "SEWER_TYPE")
	private String sewerType;

	// �U���D�Ƶ�����
	@Column(name = "SEWER_REMARK")
	private String sewerRemark;

	// �p��
	@Column(name = "KITCHEN")
	private String kitchen;

	// �p�г]��ID
	@Column(name = "KITCHEN_ID")
	private String kitchenId;

	// �p�г]�Ƥ��e
	@Column(name = "KITCHEN_TYPE")
	private String kitchenType;

	// �p�гƵ�����
	@Column(name = "KITCHEN_REMARK")
	private String kitchenRemark;

	// �Z��
	@Column(name = "TOILET")
	private String toilet;

	// �Z�ҳ]��id
	@Column(name = "TOILET_ID")
	private String toiletId;

	// �Z�ҳ]�Ƥ��e
	@Column(name = "TOILET_TYPE")
	private String toiletType;

	// �Z�ҳƵ�����
	@Column(name = "TOILET_REMARK")
	private String toiletRemark;

	// �D��
	@Column(name = "BATHROOM")
	private String bathroom;

	// �D�ǳ]��id
	@Column(name = "BATHROOM_ID")
	private String bathroomId;

	// �D�ǳ]�Ƥ��e
	@Column(name = "BATHROOM_TYPE")
	private String bathroomType;

	// �D�ǳƵ�����
	@Column(name = "BATHROOM_REMARK")
	private String bathroomRemark;

	// �~��x
	@Column(name = "WASH_BASIN")
	private String washBasin;

	// �~��xid
	@Column(name = "WASH_BASIN_ID")
	private String washBasinId;

	// �~��x����
	@Column(name = "WASH_BASIN_TYPE")
	private String washBasinType;

	// �~��x�Ƶ�����
	@Column(name = "WASH_BASIN_REMARK")
	private String washBasinRemark;

	// �~�����m��
	@Column(name = "WASH_MACHINE")
	private String washMachine;

	// �~�����m�����O
	@Column(name = "WASH_MACHINE_ID")
	private String washMachineId;

	// �~�����m�����O
	@Column(name = "WASH_MACHINE_TYPE")
	private String washMachineType;

	// �~�����m���Ƶ�����
	@Column(name = "WASH_MACHINE_REMARK")
	private String washMachineRemark;

	// ������
	@Column(name = "HOT_WATER")
	private String hotWater;

	// ������id
	@Column(name = "HOT_WATER_ID")
	private String hotWaterId;

	// ����������
	@Column(name = "HOT_WATER_TYPE")
	private String hotWaterType;

	// �������Ƶ�����
	@Column(name = "HOT_WATER_REMARK")
	private String hotWaterRemark;

	// �Ž�
	@Column(name = "AIR_CON")
	private String airCon;

	// �Ž�id
	@Column(name = "AIR_CON_ID")
	private String airConId;

	// �Ž�����
	@Column(name = "AIR_CON_TYPE")
	private String airConType;

	// �ŽճƵ�����
	@Column(name = "AIR_CON_REMARK")
	private String airConRemark;

	// �ө��]��
	@Column(name = "LIGHT")
	private String light;

	// �ө��]�ƳƵ�
	@Column(name = "LIGHT_REMARK")
	private String lightRemark;

	// �a��
	@Column(name = "FURNITURE")
	private String furniture;

	// �a��ID
	@Column(name = "FURNITURE_ID")
	private String furnitureId;

	// �a������
	@Column(name = "FURNITURE_TYPE")
	private String furnitureType;

	// �a��Ƶ�����
	@Column(name = "FURNITURE_REMARK")
	private String furnitureRemark;

	// �Ʀ�q��
	@Column(name = "DIGITAL")
	private String digital;

	// �Ʀ�q���Ƶ�
	@Column(name = "DIGITAL_REMARK")
	private String digitalRemark;

	// ���u�q��
	@Column(name = "CATV")
	private String catv;

	// ���u�q������
	@Column(name = "CATV_REMARK")
	private String catvRemark;

	// ����
	@Column(name = "NET")
	private String net;

	// �����Ƶ�����
	@Column(name = "NET_REMARK")
	private String netRemark;

	// �x����
	@Column(name = "TRUNKROOM")
	private String trunkroom;

	// �x�����Ƶ�����
	@Column(name = "TRUNKROOM_REMARK")
	private String trunkroomRemark;

	// ���B�x�|
	@Column(name = "GARDEN")
	private String garden;

	// �x�|�Ƶ�����
	@Column(name = "GARDEN_REMARK")
	private String gardenRemark;

	// �ѻO
	@Column(name = "ROOF_BALCONY")
	private String roofBalcony;

	// �ѻO�Ƶ�����
	@Column(name = "ROOF_BALCONY_REMARK")
	private String roofBalconyRemark;

	// �_��
	@Column(name = "ROOM_KEY")
	private String roomKey;

	// �_�ͳƵ�
	@Column(name = "ROOM_KEY_REMARK")
	private String roomKeyRemark;

	// �O�_����s�O��
	@Column(name = "RENEWAL")
	private String renewal;

	/* �p�Gfee = false�B���U�N���ζ�g */

	// �������(�X�Ӥ�)
	@Column(name = "RENEWAL_FEE_MONTH")
	private String renewalFeeMonth;

	// �򯲶O��/��
	@Column(name = "RENEWAL_FEE")
	private String renewalFee;

	// �̤j�B�ת��B
	@Column(name = "MAX_AMOUNT")
	private String maxAmount;

	// �B�~������T
	@Column(name = "TERM")
	private String term;

	// �s��build��ƪ�~����
	@Column(name = "BUILD_ID")
	private int buildId;

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	// ���եΪ�room�s�W
	public Room(String floor, String roomNum, String floorPlan, String floorSpace, String balconySpace, int rentCost,
			int managementFee, int buildId) {
		super();
		this.floor = floor;
		this.roomNum = roomNum;
		this.floorPlan = floorPlan;
		this.floorSpace = floorSpace;
		this.balconySpace = balconySpace;
		this.rentCost = rentCost;
		this.managementFee = managementFee;
		this.buildId = buildId;
	}

	public Room(String floor, String roomNum, String floorPlan, String floorSpace, String balconySpace, int rentCost,
			int rentDeadline, int managementFee, int manaDeadline, int deposit, int parkingCost, int facilityFee,
			int keyMoney, String keyCount, String electricity, String electricityId, String electricityType,
			String electricityRemark, String gas, String gasId, String gasType, String gasRemark, String stove,
			String stoveId, String stoveType, String stoveRemark, String waterSupply, String waterSupplyId,
			String waterSupplyType, String waterSupplyRemark, String sewer, String sewerId, String sewerType,
			String sewerRemark, String kitchen, String kitchenId, String kitchenType, String kitchenRemark,
			String toilet, String toiletId, String toiletType, String toiletRemark, String bathroom, String bathroomId,
			String bathroomType, String bathroomRemark, String washBasin, String washBasinId, String washBasinType,
			String washBasinRemark, String washMachine, String washMachineId, String washMachineType,
			String washMachineRemark, String hotWater, String hotWaterId, String hotWaterType, String hotWaterRemark,
			String airCon, String airConId, String airConType, String airConRemark, String light, String lightRemark,
			String furniture, String furnitureId, String furnitureType, String furnitureRemark, String digital,
			String digitalRemark, String catv, String catvRemark, String net, String netRemark, String trunkroom,
			String trunkroomRemark, String garden, String gardenRemark, String roofBalcony, String roofBalconyRemark,
			String roomKey, String roomKeyRemark, String renewal, String renewalFeeMonth, String renewalFee,
			String maxAmount, String term, int buildId) {
		super();
		this.floor = floor;
		this.roomNum = roomNum;
		this.floorPlan = floorPlan;
		this.floorSpace = floorSpace;
		this.balconySpace = balconySpace;
		this.rentCost = rentCost;
		this.rentDeadline = rentDeadline;
		this.managementFee = managementFee;
		this.manaDeadline = manaDeadline;
		this.deposit = deposit;
		this.parkingCost = parkingCost;
		this.facilityFee = facilityFee;
		this.keyMoney = keyMoney;
		this.keyCount = keyCount;
		this.electricity = electricity;
		this.electricityId = electricityId;
		this.electricityType = electricityType;
		this.electricityRemark = electricityRemark;
		this.gas = gas;
		this.gasId = gasId;
		this.gasType = gasType;
		this.gasRemark = gasRemark;
		this.stove = stove;
		this.stoveId = stoveId;
		this.stoveType = stoveType;
		this.stoveRemark = stoveRemark;
		this.waterSupply = waterSupply;
		this.waterSupplyId = waterSupplyId;
		this.waterSupplyType = waterSupplyType;
		this.waterSupplyRemark = waterSupplyRemark;
		this.sewer = sewer;
		this.sewerId = sewerId;
		this.sewerType = sewerType;
		this.sewerRemark = sewerRemark;
		this.kitchen = kitchen;
		this.kitchenId = kitchenId;
		this.kitchenType = kitchenType;
		this.kitchenRemark = kitchenRemark;
		this.toilet = toilet;
		this.toiletId = toiletId;
		this.toiletType = toiletType;
		this.toiletRemark = toiletRemark;
		this.bathroom = bathroom;
		this.bathroomId = bathroomId;
		this.bathroomType = bathroomType;
		this.bathroomRemark = bathroomRemark;
		this.washBasin = washBasin;
		this.washBasinId = washBasinId;
		this.washBasinType = washBasinType;
		this.washBasinRemark = washBasinRemark;
		this.washMachine = washMachine;
		this.washMachineId = washMachineId;
		this.washMachineType = washMachineType;
		this.washMachineRemark = washMachineRemark;
		this.hotWater = hotWater;
		this.hotWaterId = hotWaterId;
		this.hotWaterType = hotWaterType;
		this.hotWaterRemark = hotWaterRemark;
		this.airCon = airCon;
		this.airConId = airConId;
		this.airConType = airConType;
		this.airConRemark = airConRemark;
		this.light = light;
		this.lightRemark = lightRemark;
		this.furniture = furniture;
		this.furnitureId = furnitureId;
		this.furnitureType = furnitureType;
		this.furnitureRemark = furnitureRemark;
		this.digital = digital;
		this.digitalRemark = digitalRemark;
		this.catv = catv;
		this.catvRemark = catvRemark;
		this.net = net;
		this.netRemark = netRemark;
		this.trunkroom = trunkroom;
		this.trunkroomRemark = trunkroomRemark;
		this.garden = garden;
		this.gardenRemark = gardenRemark;
		this.roofBalcony = roofBalcony;
		this.roofBalconyRemark = roofBalconyRemark;
		this.roomKey = roomKey;
		this.roomKeyRemark = roomKeyRemark;
		this.renewal = renewal;
		this.renewalFeeMonth = renewalFeeMonth;
		this.renewalFee = renewalFee;
		this.maxAmount = maxAmount;
		this.term = term;
		this.buildId = buildId;
	}

	public Room(int roomId, String floor, String roomNum, String floorPlan, String floorSpace, String balconySpace,
			int rentCost, int rentDeadline, int managementFee, int manaDeadline, int deposit, int parkingCost,
			int facilityFee, int keyMoney, String keyCount, String electricity, String electricityId,
			String electricityType, String electricityRemark, String gas, String gasId, String gasType,
			String gasRemark, String stove, String stoveId, String stoveType, String stoveRemark, String waterSupply,
			String waterSupplyId, String waterSupplyType, String waterSupplyRemark, String sewer, String sewerId,
			String sewerType, String sewerRemark, String kitchen, String kitchenId, String kitchenType,
			String kitchenRemark, String toilet, String toiletId, String toiletType, String toiletRemark,
			String bathroom, String bathroomId, String bathroomType, String bathroomRemark, String washBasin,
			String washBasinId, String washBasinType, String washBasinRemark, String washMachine, String washMachineId,
			String washMachineType, String washMachineRemark, String hotWater, String hotWaterId, String hotWaterType,
			String hotWaterRemark, String airCon, String airConId, String airConType, String airConRemark, String light,
			String lightRemark, String furniture, String furnitureId, String furnitureType, String furnitureRemark,
			String digital, String digitalRemark, String catv, String catvRemark, String net, String netRemark,
			String trunkroom, String trunkroomRemark, String garden, String gardenRemark, String roofBalcony,
			String roofBalconyRemark, String roomKey, String roomKeyRemark, String renewal, String renewalFeeMonth,
			String renewalFee, String maxAmount, String term, int buildId) {
		super();
		this.roomId = roomId;
		this.floor = floor;
		this.roomNum = roomNum;
		this.floorPlan = floorPlan;
		this.floorSpace = floorSpace;
		this.balconySpace = balconySpace;
		this.rentCost = rentCost;
		this.rentDeadline = rentDeadline;
		this.managementFee = managementFee;
		this.manaDeadline = manaDeadline;
		this.deposit = deposit;
		this.parkingCost = parkingCost;
		this.facilityFee = facilityFee;
		this.keyMoney = keyMoney;
		this.keyCount = keyCount;
		this.electricity = electricity;
		this.electricityId = electricityId;
		this.electricityType = electricityType;
		this.electricityRemark = electricityRemark;
		this.gas = gas;
		this.gasId = gasId;
		this.gasType = gasType;
		this.gasRemark = gasRemark;
		this.stove = stove;
		this.stoveId = stoveId;
		this.stoveType = stoveType;
		this.stoveRemark = stoveRemark;
		this.waterSupply = waterSupply;
		this.waterSupplyId = waterSupplyId;
		this.waterSupplyType = waterSupplyType;
		this.waterSupplyRemark = waterSupplyRemark;
		this.sewer = sewer;
		this.sewerId = sewerId;
		this.sewerType = sewerType;
		this.sewerRemark = sewerRemark;
		this.kitchen = kitchen;
		this.kitchenId = kitchenId;
		this.kitchenType = kitchenType;
		this.kitchenRemark = kitchenRemark;
		this.toilet = toilet;
		this.toiletId = toiletId;
		this.toiletType = toiletType;
		this.toiletRemark = toiletRemark;
		this.bathroom = bathroom;
		this.bathroomId = bathroomId;
		this.bathroomType = bathroomType;
		this.bathroomRemark = bathroomRemark;
		this.washBasin = washBasin;
		this.washBasinId = washBasinId;
		this.washBasinType = washBasinType;
		this.washBasinRemark = washBasinRemark;
		this.washMachine = washMachine;
		this.washMachineId = washMachineId;
		this.washMachineType = washMachineType;
		this.washMachineRemark = washMachineRemark;
		this.hotWater = hotWater;
		this.hotWaterId = hotWaterId;
		this.hotWaterType = hotWaterType;
		this.hotWaterRemark = hotWaterRemark;
		this.airCon = airCon;
		this.airConId = airConId;
		this.airConType = airConType;
		this.airConRemark = airConRemark;
		this.light = light;
		this.lightRemark = lightRemark;
		this.furniture = furniture;
		this.furnitureId = furnitureId;
		this.furnitureType = furnitureType;
		this.furnitureRemark = furnitureRemark;
		this.digital = digital;
		this.digitalRemark = digitalRemark;
		this.catv = catv;
		this.catvRemark = catvRemark;
		this.net = net;
		this.netRemark = netRemark;
		this.trunkroom = trunkroom;
		this.trunkroomRemark = trunkroomRemark;
		this.garden = garden;
		this.gardenRemark = gardenRemark;
		this.roofBalcony = roofBalcony;
		this.roofBalconyRemark = roofBalconyRemark;
		this.roomKey = roomKey;
		this.roomKeyRemark = roomKeyRemark;
		this.renewal = renewal;
		this.renewalFeeMonth = renewalFeeMonth;
		this.renewalFee = renewalFee;
		this.maxAmount = maxAmount;
		this.term = term;
		this.buildId = buildId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getFloorPlan() {
		return floorPlan;
	}

	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}

	public String getFloorSpace() {
		return floorSpace;
	}

	public void setFloorSpace(String floorSpace) {
		this.floorSpace = floorSpace;
	}

	public String getBalconySpace() {
		return balconySpace;
	}

	public void setBalconySpace(String balconySpace) {
		this.balconySpace = balconySpace;
	}

	public int getRentCost() {
		return rentCost;
	}

	public void setRentCost(int rentCost) {
		this.rentCost = rentCost;
	}

	public int getRentDeadline() {
		return rentDeadline;
	}

	public void setRentDeadline(int rentDeadline) {
		this.rentDeadline = rentDeadline;
	}

	public int getManagementFee() {
		return managementFee;
	}

	public void setManagementFee(int managementFee) {
		this.managementFee = managementFee;
	}

	public int getManaDeadline() {
		return manaDeadline;
	}

	public void setManaDeadline(int manaDeadline) {
		this.manaDeadline = manaDeadline;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getParkingCost() {
		return parkingCost;
	}

	public void setParkingCost(int parkingCost) {
		this.parkingCost = parkingCost;
	}

	public int getFacilityFee() {
		return facilityFee;
	}

	public void setFacilityFee(int facilityFee) {
		this.facilityFee = facilityFee;
	}

	public int getKeyMoney() {
		return keyMoney;
	}

	public void setKeyMoney(int keyMoney) {
		this.keyMoney = keyMoney;
	}

	public String getKeyCount() {
		return keyCount;
	}

	public void setKeyCount(String keyCount) {
		this.keyCount = keyCount;
	}

	public String getElectricity() {
		return electricity;
	}

	public void setElectricity(String electricity) {
		this.electricity = electricity;
	}

	public String getElectricityId() {
		return electricityId;
	}

	public void setElectricityId(String electricityId) {
		this.electricityId = electricityId;
	}

	public String getElectricityType() {
		return electricityType;
	}

	public void setElectricityType(String electricityType) {
		this.electricityType = electricityType;
	}

	public String getElectricityRemark() {
		return electricityRemark;
	}

	public void setElectricityRemark(String electricityRemark) {
		this.electricityRemark = electricityRemark;
	}

	public String getGas() {
		return gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}

	public String getGasId() {
		return gasId;
	}

	public void setGasId(String gasId) {
		this.gasId = gasId;
	}

	public String getGasType() {
		return gasType;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	public String getGasRemark() {
		return gasRemark;
	}

	public void setGasRemark(String gasRemark) {
		this.gasRemark = gasRemark;
	}

	public String getStove() {
		return stove;
	}

	public void setStove(String stove) {
		this.stove = stove;
	}

	public String getStoveId() {
		return stoveId;
	}

	public void setStoveId(String stoveId) {
		this.stoveId = stoveId;
	}

	public String getStoveType() {
		return stoveType;
	}

	public void setStoveType(String stoveType) {
		this.stoveType = stoveType;
	}

	public String getStoveRemark() {
		return stoveRemark;
	}

	public void setStoveRemark(String stoveRemark) {
		this.stoveRemark = stoveRemark;
	}

	public String getWaterSupply() {
		return waterSupply;
	}

	public void setWaterSupply(String waterSupply) {
		this.waterSupply = waterSupply;
	}

	public String getWaterSupplyId() {
		return waterSupplyId;
	}

	public void setWaterSupplyId(String waterSupplyId) {
		this.waterSupplyId = waterSupplyId;
	}

	public String getWaterSupplyType() {
		return waterSupplyType;
	}

	public void setWaterSupplyType(String waterSupplyType) {
		this.waterSupplyType = waterSupplyType;
	}

	public String getWaterSupplyRemark() {
		return waterSupplyRemark;
	}

	public void setWaterSupplyRemark(String waterSupplyRemark) {
		this.waterSupplyRemark = waterSupplyRemark;
	}

	public String getSewer() {
		return sewer;
	}

	public void setSewer(String sewer) {
		this.sewer = sewer;
	}

	public String getSewerId() {
		return sewerId;
	}

	public void setSewerId(String sewerId) {
		this.sewerId = sewerId;
	}

	public String getSewerType() {
		return sewerType;
	}

	public void setSewerType(String sewerType) {
		this.sewerType = sewerType;
	}

	public String getSewerRemark() {
		return sewerRemark;
	}

	public void setSewerRemark(String sewerRemark) {
		this.sewerRemark = sewerRemark;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getKitchenId() {
		return kitchenId;
	}

	public void setKitchenId(String kitchenId) {
		this.kitchenId = kitchenId;
	}

	public String getKitchenType() {
		return kitchenType;
	}

	public void setKitchenType(String kitchenType) {
		this.kitchenType = kitchenType;
	}

	public String getKitchenRemark() {
		return kitchenRemark;
	}

	public void setKitchenRemark(String kitchenRemark) {
		this.kitchenRemark = kitchenRemark;
	}

	public String getToilet() {
		return toilet;
	}

	public void setToilet(String toilet) {
		this.toilet = toilet;
	}

	public String getToiletId() {
		return toiletId;
	}

	public void setToiletId(String toiletId) {
		this.toiletId = toiletId;
	}

	public String getToiletType() {
		return toiletType;
	}

	public void setToiletType(String toiletType) {
		this.toiletType = toiletType;
	}

	public String getToiletRemark() {
		return toiletRemark;
	}

	public void setToiletRemark(String toiletRemark) {
		this.toiletRemark = toiletRemark;
	}

	public String getBathroom() {
		return bathroom;
	}

	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public String getBathroomId() {
		return bathroomId;
	}

	public void setBathroomId(String bathroomId) {
		this.bathroomId = bathroomId;
	}

	public String getBathroomType() {
		return bathroomType;
	}

	public void setBathroomType(String bathroomType) {
		this.bathroomType = bathroomType;
	}

	public String getBathroomRemark() {
		return bathroomRemark;
	}

	public void setBathroomRemark(String bathroomRemark) {
		this.bathroomRemark = bathroomRemark;
	}

	public String getWashBasin() {
		return washBasin;
	}

	public void setWashBasin(String washBasin) {
		this.washBasin = washBasin;
	}

	public String getWashBasinId() {
		return washBasinId;
	}

	public void setWashBasinId(String washBasinId) {
		this.washBasinId = washBasinId;
	}

	public String getWashBasinType() {
		return washBasinType;
	}

	public void setWashBasinType(String washBasinType) {
		this.washBasinType = washBasinType;
	}

	public String getWashBasinRemark() {
		return washBasinRemark;
	}

	public void setWashBasinRemark(String washBasinRemark) {
		this.washBasinRemark = washBasinRemark;
	}

	public String getWashMachine() {
		return washMachine;
	}

	public void setWashMachine(String washMachine) {
		this.washMachine = washMachine;
	}

	public String getWashMachineId() {
		return washMachineId;
	}

	public void setWashMachineId(String washMachineId) {
		this.washMachineId = washMachineId;
	}

	public String getWashMachineType() {
		return washMachineType;
	}

	public void setWashMachineType(String washMachineType) {
		this.washMachineType = washMachineType;
	}

	public String getWashMachineRemark() {
		return washMachineRemark;
	}

	public void setWashMachineRemark(String washMachineRemark) {
		this.washMachineRemark = washMachineRemark;
	}

	public String getHotWater() {
		return hotWater;
	}

	public void setHotWater(String hotWater) {
		this.hotWater = hotWater;
	}

	public String getHotWaterId() {
		return hotWaterId;
	}

	public void setHotWaterId(String hotWaterId) {
		this.hotWaterId = hotWaterId;
	}

	public String getHotWaterType() {
		return hotWaterType;
	}

	public void setHotWaterType(String hotWaterType) {
		this.hotWaterType = hotWaterType;
	}

	public String getHotWaterRemark() {
		return hotWaterRemark;
	}

	public void setHotWaterRemark(String hotWaterRemark) {
		this.hotWaterRemark = hotWaterRemark;
	}

	public String getAirCon() {
		return airCon;
	}

	public void setAirCon(String airCon) {
		this.airCon = airCon;
	}

	public String getAirConId() {
		return airConId;
	}

	public void setAirConId(String airConId) {
		this.airConId = airConId;
	}

	public String getAirConType() {
		return airConType;
	}

	public void setAirConType(String airConType) {
		this.airConType = airConType;
	}

	public String getAirConRemark() {
		return airConRemark;
	}

	public void setAirConRemark(String airConRemark) {
		this.airConRemark = airConRemark;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public String getLightRemark() {
		return lightRemark;
	}

	public void setLightRemark(String lightRemark) {
		this.lightRemark = lightRemark;
	}

	public String getFurniture() {
		return furniture;
	}

	public void setFurniture(String furniture) {
		this.furniture = furniture;
	}

	public String getFurnitureId() {
		return furnitureId;
	}

	public void setFurnitureId(String furnitureId) {
		this.furnitureId = furnitureId;
	}

	public String getFurnitureType() {
		return furnitureType;
	}

	public void setFurnitureType(String furnitureType) {
		this.furnitureType = furnitureType;
	}

	public String getFurnitureRemark() {
		return furnitureRemark;
	}

	public void setFurnitureRemark(String furnitureRemark) {
		this.furnitureRemark = furnitureRemark;
	}

	public String getDigital() {
		return digital;
	}

	public void setDigital(String digital) {
		this.digital = digital;
	}

	public String getDigitalRemark() {
		return digitalRemark;
	}

	public void setDigitalRemark(String digitalRemark) {
		this.digitalRemark = digitalRemark;
	}

	public String getCatv() {
		return catv;
	}

	public void setCatv(String catv) {
		this.catv = catv;
	}

	public String getCatvRemark() {
		return catvRemark;
	}

	public void setCatvRemark(String catvRemark) {
		this.catvRemark = catvRemark;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	public String getNetRemark() {
		return netRemark;
	}

	public void setNetRemark(String netRemark) {
		this.netRemark = netRemark;
	}

	public String getTrunkroom() {
		return trunkroom;
	}

	public void setTrunkroom(String trunkroom) {
		this.trunkroom = trunkroom;
	}

	public String getTrunkroomRemark() {
		return trunkroomRemark;
	}

	public void setTrunkroomRemark(String trunkroomRemark) {
		this.trunkroomRemark = trunkroomRemark;
	}

	public String getGarden() {
		return garden;
	}

	public void setGarden(String garden) {
		this.garden = garden;
	}

	public String getGardenRemark() {
		return gardenRemark;
	}

	public void setGardenRemark(String gardenRemark) {
		this.gardenRemark = gardenRemark;
	}

	public String getRoofBalcony() {
		return roofBalcony;
	}

	public void setRoofBalcony(String roofBalcony) {
		this.roofBalcony = roofBalcony;
	}

	public String getRoofBalconyRemark() {
		return roofBalconyRemark;
	}

	public void setRoofBalconyRemark(String roofBalconyRemark) {
		this.roofBalconyRemark = roofBalconyRemark;
	}

	public String getRoomKey() {
		return roomKey;
	}

	public void setRoomKey(String roomKey) {
		this.roomKey = roomKey;
	}

	public String getRoomKeyRemark() {
		return roomKeyRemark;
	}

	public void setRoomKeyRemark(String roomKeyRemark) {
		this.roomKeyRemark = roomKeyRemark;
	}

	public String getRenewal() {
		return renewal;
	}

	public void setRenewal(String renewal) {
		this.renewal = renewal;
	}

	public String getRenewalFeeMonth() {
		return renewalFeeMonth;
	}

	public void setRenewalFeeMonth(String renewalFeeMonth) {
		this.renewalFeeMonth = renewalFeeMonth;
	}

	public String getRenewalFee() {
		return renewalFee;
	}

	public void setRenewalFee(String renewalFee) {
		this.renewalFee = renewalFee;
	}

	public String getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public int getBuildId() {
		return buildId;
	}

	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}

}
