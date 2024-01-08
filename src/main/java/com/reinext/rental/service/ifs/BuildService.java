package com.reinext.rental.service.ifs;

import com.reinext.rental.entity.Build;
import com.reinext.rental.entity.Landlord;
import com.reinext.rental.entity.NearStation;
import com.reinext.rental.entity.Room;
import com.reinext.rental.entity.Tenant;
import com.reinext.rental.vo.BuildAllRes;
import com.reinext.rental.vo.BuildRes;
import com.reinext.rental.vo.RoomAllRes;
import com.reinext.rental.vo.SearchAllRes;
import com.reinext.rental.vo.StationAllRes;

public interface BuildService {

	/**
	 * 儲存Build資料 #創建和更新
	 **/
	public BuildRes save(Build build);
	
	/**
	 * 儲存nearStation資料 #創建和更新
	 **/
	public BuildRes save(NearStation nStation);

	/**
	 * 儲存Room資料 #創建和更新
	 **/
	public BuildRes save(Room room);

	/**
	 * 儲存Landlord資料 #創建和更新
	 **/
	public BuildRes save(Landlord landlord);

	/**
	 * 儲存Tenant資料 #創建和更新
	 **/
	public BuildRes save(Tenant tenant);

	/**
	 * 刪除Build、room、station資料(參數:build_id) #刪除
	 **/
	public BuildRes deleteBuild(int id);
	
	/**
	 * 刪除station資料(參數:build_id) #刪除
	 **/
	public BuildRes deleteStation(int id);
	
	/**
	 * 刪除指定room資料(參數:room_id) #刪除
	 **/
	public BuildRes deleteRoom(int id);

	/**
	 * 顯示所有Build資訊(參數build_id) #顯示房屋列表
	 **/
	public BuildAllRes getAllBuildInfo();

	/**
	 * 取得Build資訊(參數build_id) #點擊房屋列表後顯示 #點擊後台更新icon
	 **/
	public BuildRes getBuildInfo(int id);

	/**
	 * 取得Build和room資訊(參數build_id) #顯示客戶端build、room資料
	 **/
	public SearchAllRes getAllBuildRoomInfo();
	
	/**
	 * 顯示對應build_id的station資訊(參數build_id) #點擊車站icon
	 **/
	public StationAllRes getStationInfoByBuildId(int id);
	
	/**
	 * 顯示對應build_id的room資訊(參數build_id) #點擊物件列表
	 **/
	public RoomAllRes getRoomInfoByBuildId(int id);

	/**
	 * 取得Room資訊(參數room_id) #點擊編輯房間、取得房間資訊
	 **/
	public BuildRes getRoomInfo(int id);

	/**
	 * 取得Landlord資訊(參數room_id) #更新完room頁面後點擊下一步
	 **/
	public BuildRes getLandlordInfo(int id);

	/**
	 * 取得Tenant資訊(參數room_id) #更新完Landlord頁面後點擊下一步
	 **/
	public BuildRes getTenantInfo(int id);

	/**
	 * 取得build、room、landlord、tenant資訊(參數build_id) #客戶端點擊物件資訊
	 **/
	public BuildRes getContractInfo(int id);
}
