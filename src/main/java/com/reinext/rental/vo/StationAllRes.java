package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.constants.RtnMsg;
import com.reinext.rental.entity.NearStation;

public class StationAllRes {
	private RtnMsg rtnMsg;

	private List<NearStation> nStations;

	public StationAllRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StationAllRes(RtnMsg rtnMsg) {
		super();
		this.rtnMsg = rtnMsg;
	}

	public StationAllRes(RtnMsg rtnMsg, List<NearStation> nStations) {
		super();
		this.rtnMsg = rtnMsg;
		this.nStations = nStations;
	}

	public RtnMsg getRtnMsg() {
		return rtnMsg;
	}

	public void setRtnMsg(RtnMsg rtnMsg) {
		this.rtnMsg = rtnMsg;
	}

	public List<NearStation> getnStations() {
		return nStations;
	}

	public void setnStations(List<NearStation> nStations) {
		this.nStations = nStations;
	}

}
