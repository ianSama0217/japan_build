package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.constants.RtnMsg;

public class SearchAllRes {
	private RtnMsg rtnMsg;

	private List<BuildAndRoom> buildAndRoom;

	private List<BuildAndStation> buildAndStations;

	public SearchAllRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchAllRes(RtnMsg rtnMsg) {
		super();
		this.rtnMsg = rtnMsg;
	}

	public SearchAllRes(RtnMsg rtnMsg, List<BuildAndRoom> buildAndRoom) {
		super();
		this.rtnMsg = rtnMsg;
		this.buildAndRoom = buildAndRoom;
	}

	public SearchAllRes(List<BuildAndStation> buildAndStations, RtnMsg rtnMsg) {
		super();
		this.rtnMsg = rtnMsg;
		this.buildAndStations = buildAndStations;
	}

	public RtnMsg getRtnMsg() {
		return rtnMsg;
	}

	public void setRtnMsg(RtnMsg rtnMsg) {
		this.rtnMsg = rtnMsg;
	}

	public List<BuildAndRoom> getBuildAndRoom() {
		return buildAndRoom;
	}

	public void setBuildAndRoom(List<BuildAndRoom> buildAndRoom) {
		this.buildAndRoom = buildAndRoom;
	}

	public List<BuildAndStation> getBuildAndStations() {
		return buildAndStations;
	}

	public void setBuildAndStations(List<BuildAndStation> buildAndStations) {
		this.buildAndStations = buildAndStations;
	}

}
