package com.reinext.rental.vo;

import java.util.List;

import com.reinext.rental.entity.Build;
import com.reinext.rental.entity.NearStation;

public class BuildAndStation {
	private Build build;

	private List<NearStation> nStations;

	public BuildAndStation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuildAndStation(Build build, List<NearStation> nStations) {
		super();
		this.build = build;
		this.nStations = nStations;
	}

	public Build getBuild() {
		return build;
	}

	public void setBuild(Build build) {
		this.build = build;
	}

	public List<NearStation> getnStations() {
		return nStations;
	}

	public void setnStations(List<NearStation> nStations) {
		this.nStations = nStations;
	}

}
