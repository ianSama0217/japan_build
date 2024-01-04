package com.reinext.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "near_station")
public class NearStation {

	// ���W���(int)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STATION_ID")
	private int stationId;

	// �u���W��
	@Column(name = "LINE")
	private String line;

	// �����W��
	@Column(name = "STATION")
	private String station;

	// �B��ɶ�
	@Column(name = "WALK_TIME")
	private String walkTime;

	// ����build_id(FK)
	@Column(name = "BUILD_ID")
	private int buildId;

	public NearStation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NearStation(String line, String station, String walkTime) {
		super();
		this.line = line;
		this.station = station;
		this.walkTime = walkTime;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getWalkTime() {
		return walkTime;
	}

	public void setWalkTime(String walkTime) {
		this.walkTime = walkTime;
	}

	public int getBuildId() {
		return buildId;
	}

	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}

}
