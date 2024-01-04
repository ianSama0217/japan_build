package com.reinext.rental.constants;

public enum RtnMsg {
	/* 列舉所有可能發生的錯誤，客製化錯誤訊息回傳 */
	SUCCESSFUL(200, "Successful!"), //
	DATABASE_IS_EMPTY(500, "Database is empty!"), //
	PARAM_ERROR(400, "Param error!"), //
	ADDRESS_IS_EXIST(400, "Address is exist!"), //
	PREFECTURE_NOT_FOUND(400, "Prefecture not found!"), //
	CREATE_FAIL(500, "Create fail!"), //
	BUILD_IS_EMPTY(500, "Build is empty!"), //
	BUILD_CREATE_FAILED(500, "Build create failed!"), //
	ID_NOT_FOUND(400, "Id not found!"), //
	CONTRACTPERIOD_IS_EMPTY(500, "ContractPeriod is empty!"), //
	CONTRACTPERIOD_CREATE_FAILED(500, "ContractPeriod create failed!"), //
	LANDLORD_IS_EMPTY(500, "Landlord is empty!"), //
	LANDLORD_CREATE_FAILED(500, "Landlord create failed!"), //
	TENANT_IS_EMPTY(500, "Tenant is empty!"), //
	TENANT_CREATE_FAILED(500, "Tenant create failed!"), //
	MAX_AMOUNT_IS_EMPTY(500, "Max amount is empty!"), //
	MAX_AMOUNT_CREATE_FAILED(500, "Max amount create failed!"), //
	RENEWAL_FEE_IS_EMPTY(500, "Renewal fee is empty!"), //
	RENEWAL_FEE_CREATE_FAILED(500, "Renewal fee create failed!"), //
	SPECIAL_TERM_IS_EMPTY(500, "Special term is empty!"), //
	SPECIAL_TERM_CREATE_FAILED(500, "Special term create failed!"), //
	RENT_IS_EMPTY(500, "Rent is empty!"), //
	RENT_CREATE_FAILED(500, "Rent create failed!"), //
	FACILITY_IS_EMPTY(500, "Facility is empty!"), //
	FACILITY_CREATE_FAILED(500, "Facility create failed!"), //
	PUBLIC_FACILITY_IS_EMPTY(500, "Public facility is empty!"), //
	PUBLIC_FACILITY_CREATE_FAILED(500, "Public facility create failed!"), //
	BUILD_ID_NOT_FOUND(400, "Build id not found!"), //
	ROOM_IS_EMPTY(500, "Room is empty!"), //
	Room_ID_NOT_FOUND(400, "Room id not found!"), //
	STATION_ID_NOT_FOUND(400, "Station id not found!"), //
	STATION_IS_EMPTY(500, "Station is empty!"), //
	;

	private int code;

	private String message;

	private RtnMsg(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
