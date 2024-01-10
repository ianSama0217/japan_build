package com.reinext.rental.constants;

public enum RtnMsg {
	/* 列舉所有可能發生的錯誤，客製化錯誤訊息回傳 */
	SUCCESSFUL(200, "成功"), //
	DATABASE_IS_EMPTY(500, "データベースは空です"), //
	PARAM_ERROR(400, "パラメータエラー"), //
	ADDRESS_IS_EXIST(400, "住所は存在します"), //
	PREFECTURE_NOT_FOUND(400, "都道府県が見つかりません"), //
	CREATE_FAIL(500, "追加に失敗しました"), //
	BUILD_IS_EMPTY(500, "ビルは空です"), //
	BUILD_CREATE_FAILED(500, "ビル追加に失敗しました"), //
	ID_NOT_FOUND(400, "IDが見つかりません"), //
	BUILD_ID_NOT_FOUND(400, "ビルIDが見つかりません"), //
	ROOM_IS_EMPTY(500, "ルームは空です"), //
	Room_ID_NOT_FOUND(400, "ルームIDが見つかりません"), //
	STATION_ID_NOT_FOUND(400, "ステーションIDが見つかりません"), //
	STATION_IS_EMPTY(500, "ステーションは空です"), //
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
