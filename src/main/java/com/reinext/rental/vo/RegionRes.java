package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.constants.RtnMsg;

public class RegionRes {

	private RtnMsg rtnMsg;

	private List<String> regionInfo;

	public RegionRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegionRes(RtnMsg rtnMsg) {
		super();
		this.rtnMsg = rtnMsg;
	}

	public RegionRes(RtnMsg rtnMsg, List<String> regionInfo) {
		super();
		this.rtnMsg = rtnMsg;
		this.regionInfo = regionInfo;
	}

	public RtnMsg getRtnMsg() {
		return rtnMsg;
	}

	public void setRtnMsg(RtnMsg rtnMsg) {
		this.rtnMsg = rtnMsg;
	}

	public List<String> getRegionInfo() {
		return regionInfo;
	}

	public void setRegionInfo(List<String> regionInfo) {
		this.regionInfo = regionInfo;
	}

}
