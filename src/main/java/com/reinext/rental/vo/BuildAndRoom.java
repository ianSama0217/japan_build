package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.entity.Build;
import com.reinext.rental.entity.NearStation;
import com.reinext.rental.entity.Room;

public class BuildAndRoom {
	private Build build;

	private List<Room> roomList;

	private List<NearStation> nearStations;

	public BuildAndRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuildAndRoom(Build build, List<Room> roomList) {
		super();
		this.build = build;
		this.roomList = roomList;
	}

	public BuildAndRoom(Build build, List<Room> roomList, List<NearStation> nearStations) {
		super();
		this.build = build;
		this.roomList = roomList;
		this.nearStations = nearStations;
	}

	public Build getBuild() {
		return build;
	}

	public void setBuild(Build build) {
		this.build = build;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public List<NearStation> getNearStations() {
		return nearStations;
	}

	public void setNearStations(List<NearStation> nearStations) {
		this.nearStations = nearStations;
	}

}
