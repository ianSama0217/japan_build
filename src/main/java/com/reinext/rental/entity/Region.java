package com.reinext.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "region")
public class Region {
	// 地區id
	// リージョン ID
	@Id
	@Column(name = "REGION_ID")
	private String regionId;

	// 都道府縣
	@Column(name = "PREFECTURE")
	private String prefecture;

	// 道級行政區域(比市町村高階)
	// 道路レベルの行政区域
	@Column(name = "CITY")
	private String city;

	// 道級行政區域(平假名)
	// 道路レベルの行政区域(ひらがな)
	@Column(name = "CITY_FURI")
	private String cityFuri;

	// 市町村
	@Column(name = "MUNICIPALITY")
	private String municipality;

	// 市町村(ひらがな)
	@Column(name = "MUNICIPALITY_FURI")
	private String municipalityFuri;

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Region(String prefecture, String city, String cityFuri, String municipality, String municipalityFuri) {
		super();
		this.prefecture = prefecture;
		this.city = city;
		this.cityFuri = cityFuri;
		this.municipality = municipality;
		this.municipalityFuri = municipalityFuri;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getPrefecture() {
		return prefecture;
	}

	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityFuri() {
		return cityFuri;
	}

	public void setCityFuri(String cityFuri) {
		this.cityFuri = cityFuri;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getMunicipalityFuri() {
		return municipalityFuri;
	}

	public void setMunicipalityFuri(String municipalityFuri) {
		this.municipalityFuri = municipalityFuri;
	}

}