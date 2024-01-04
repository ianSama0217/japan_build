package com.reinext.rental.vo;

import com.reinext.rental.constants.RtnMsg;
import com.reinext.rental.entity.Station;

public class StationCreateRes {
	private RtnMsg rtnMsg;

	private Station station;

	public StationCreateRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StationCreateRes(RtnMsg rtnMsg, Station station) {
		super();
		this.rtnMsg = rtnMsg;
		this.station = station;
	}

	public RtnMsg getRtnMsg() {
		return rtnMsg;
	}

	public void setRtnMsg(RtnMsg rtnMsg) {
		this.rtnMsg = rtnMsg;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

}
