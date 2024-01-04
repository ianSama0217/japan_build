package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.constants.RtnMsg;
import com.reinext.rental.entity.Build;
import com.reinext.rental.entity.Landlord;
import com.reinext.rental.entity.NearStation;
import com.reinext.rental.entity.Room;
import com.reinext.rental.entity.Tenant;

public class BuildRes {

	private RtnMsg rtnMsg;

	private Build build;

	private Room room;

	private NearStation nearStation;

	private List<Room> roomList;

	private Landlord landlord;

	private Tenant tenant;

	public BuildRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuildRes(RtnMsg rtnMsg) {
		super();
		this.rtnMsg = rtnMsg;
	}

	public BuildRes(RtnMsg rtnMsg, Build build) {
		super();
		this.rtnMsg = rtnMsg;
		this.build = build;
	}

	public BuildRes(RtnMsg rtnMsg, NearStation nearStation) {
		super();
		this.rtnMsg = rtnMsg;
		this.nearStation = nearStation;
	}

	public BuildRes(RtnMsg rtnMsg, Build build, Room room) {
		super();
		this.rtnMsg = rtnMsg;
		this.build = build;
		this.room = room;
	}

	public BuildRes(RtnMsg rtnMsg, Room room) {
		super();
		this.rtnMsg = rtnMsg;
		this.room = room;
	}

	public BuildRes(RtnMsg rtnMsg, Tenant tenant) {
		super();
		this.rtnMsg = rtnMsg;
		this.tenant = tenant;
	}

	public BuildRes(RtnMsg rtnMsg, Landlord landlord) {
		super();
		this.rtnMsg = rtnMsg;
		this.landlord = landlord;
	}

	public BuildRes(RtnMsg rtnMsg, Build build, Room room, Landlord landlord, Tenant tenant) {
		super();
		this.rtnMsg = rtnMsg;
		this.build = build;
		this.room = room;
		this.landlord = landlord;
		this.tenant = tenant;
	}

	public RtnMsg getRtnMsg() {
		return rtnMsg;
	}

	public void setRtnMsg(RtnMsg rtnMsg) {
		this.rtnMsg = rtnMsg;
	}

	public Build getBuild() {
		return build;
	}

	public void setBuild(Build build) {
		this.build = build;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Landlord getLandlord() {
		return landlord;
	}

	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public NearStation getNearStation() {
		return nearStation;
	}

	public void setNearStation(NearStation nearStations) {
		this.nearStation = nearStations;
	}

}
