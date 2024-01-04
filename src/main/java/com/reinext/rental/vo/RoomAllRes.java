package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.constants.RtnMsg;
import com.reinext.rental.entity.Room;

public class RoomAllRes {
	private RtnMsg rtnMsg;

	private List<Room> roomList;

	public RoomAllRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomAllRes(RtnMsg rtnMsg) {
		super();
		this.rtnMsg = rtnMsg;
	}

	public RoomAllRes(RtnMsg rtnMsg, List<Room> roomList) {
		super();
		this.rtnMsg = rtnMsg;
		this.roomList = roomList;
	}

	public RtnMsg getRtnMsg() {
		return rtnMsg;
	}

	public void setRtnMsg(RtnMsg rtnMsg) {
		this.rtnMsg = rtnMsg;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

}
