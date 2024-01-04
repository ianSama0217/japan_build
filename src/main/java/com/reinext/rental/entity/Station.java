package com.reinext.rental.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "station")
public class Station {

	// 都道府縣
	@Column(name = "PREF_NAME")
	@JsonProperty("PREF_NAME")
	private String prefName;

	// 車站id(無意義遞增int)
	// ステーション ID (無意味な増分 int)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STATION_ID")
	@JsonProperty("STATION_ID")
	private int stationId;

	// 車站
	// 駅の名前
	@Column(name = "STATION_NAME")
	@JsonProperty("STATION_NAME")
	private String stationName;

	// 車站地址
	// 住所
	@Column(name = "ADDRESS")
	@JsonProperty("ADDRESS")
	private String address;

	// 線路名稱
	// 路線の名前
	@Column(name = "LINE_NAME")
	@JsonProperty("LINE_NAME")
	private String lineName;

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Station(String prefName, int stationId, String stationName, String address, String lineName) {
		super();
		this.prefName = prefName;
		this.stationId = stationId;
		this.stationName = stationName;
		this.address = address;
		this.lineName = lineName;
	}

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

}
