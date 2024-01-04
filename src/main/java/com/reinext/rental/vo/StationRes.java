package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.constants.RtnMsg;

public class StationRes {
	private RtnMsg rtnMsg;

	private List<String> stationInfos;

	public StationRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StationRes(RtnMsg rtnMsg) {
		super();
		this.rtnMsg = rtnMsg;
	}

	public StationRes(RtnMsg rtnMsg, List<String> stationInfos) {
		super();
		this.rtnMsg = rtnMsg;
		this.stationInfos = stationInfos;
	}

	public RtnMsg getRtnMsg() {
		return rtnMsg;
	}

	public void setRtnMsg(RtnMsg rtnMsg) {
		this.rtnMsg = rtnMsg;
	}

	public List<String> getStationInfos() {
		return stationInfos;
	}

	public void setStationInfos(List<String> stationInfos) {
		this.stationInfos = stationInfos;
	}

}
