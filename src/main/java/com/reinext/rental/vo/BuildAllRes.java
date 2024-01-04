package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.constants.RtnMsg;
import com.reinext.rental.entity.Build;

public class BuildAllRes {

	private RtnMsg rtnMsg;

	private List<Build> buildList;

	public BuildAllRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuildAllRes(RtnMsg rtnMsg) {
		super();
		this.rtnMsg = rtnMsg;
	}

	public BuildAllRes(RtnMsg rtnMsg, List<Build> buildList) {
		super();
		this.rtnMsg = rtnMsg;
		this.buildList = buildList;
	}

	public RtnMsg getRtnMsg() {
		return rtnMsg;
	}

	public void setRtnMsg(RtnMsg rtnMsg) {
		this.rtnMsg = rtnMsg;
	}

	public List<Build> getBuildList() {
		return buildList;
	}

	public void setBuildList(List<Build> buildList) {
		this.buildList = buildList;
	}

}
