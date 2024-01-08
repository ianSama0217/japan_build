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
	 * �x�sBuild��� #�ЫةM��s
	 **/
	public BuildRes save(Build build);
	
	/**
	 * �x�snearStation��� #�ЫةM��s
	 **/
	public BuildRes save(NearStation nStation);

	/**
	 * �x�sRoom��� #�ЫةM��s
	 **/
	public BuildRes save(Room room);

	/**
	 * �x�sLandlord��� #�ЫةM��s
	 **/
	public BuildRes save(Landlord landlord);

	/**
	 * �x�sTenant��� #�ЫةM��s
	 **/
	public BuildRes save(Tenant tenant);

	/**
	 * �R��Build�Broom�Bstation���(�Ѽ�:build_id) #�R��
	 **/
	public BuildRes deleteBuild(int id);
	
	/**
	 * �R��station���(�Ѽ�:build_id) #�R��
	 **/
	public BuildRes deleteStation(int id);
	
	/**
	 * �R�����wroom���(�Ѽ�:room_id) #�R��
	 **/
	public BuildRes deleteRoom(int id);

	/**
	 * ��ܩҦ�Build��T(�Ѽ�build_id) #��ܩЫΦC��
	 **/
	public BuildAllRes getAllBuildInfo();

	/**
	 * ���oBuild��T(�Ѽ�build_id) #�I���ЫΦC������ #�I����x��sicon
	 **/
	public BuildRes getBuildInfo(int id);

	/**
	 * ���oBuild�Mroom��T(�Ѽ�build_id) #��ܫȤ��build�Broom���
	 **/
	public SearchAllRes getAllBuildRoomInfo();
	
	/**
	 * ��ܹ���build_id��station��T(�Ѽ�build_id) #�I������icon
	 **/
	public StationAllRes getStationInfoByBuildId(int id);
	
	/**
	 * ��ܹ���build_id��room��T(�Ѽ�build_id) #�I������C��
	 **/
	public RoomAllRes getRoomInfoByBuildId(int id);

	/**
	 * ���oRoom��T(�Ѽ�room_id) #�I���s��ж��B���o�ж���T
	 **/
	public BuildRes getRoomInfo(int id);

	/**
	 * ���oLandlord��T(�Ѽ�room_id) #��s��room�������I���U�@�B
	 **/
	public BuildRes getLandlordInfo(int id);

	/**
	 * ���oTenant��T(�Ѽ�room_id) #��s��Landlord�������I���U�@�B
	 **/
	public BuildRes getTenantInfo(int id);

	/**
	 * ���obuild�Broom�Blandlord�Btenant��T(�Ѽ�build_id) #�Ȥ���I�������T
	 **/
	public BuildRes getContractInfo(int id);
}
