package com.reinext.rental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Station;

@Repository
public interface StationDao extends JpaRepository<Station, Integer> {
	/**
	 * 判斷地址是否已經存在DB。
	 * 住所がすでに存在するかどうかを確認する
	 **/
	public boolean existsByAddress(String address);

	/**
	 * 印出對應都道府縣的車站路線(Line_name)。
	 * 都道府県に該当する駅路線(路線名)を印刷します。
	 **/
	@Query(value = "SELECT DISTINCT s.LINE_NAME " //
			+ " FROM station AS s" //
			+ " WHERE s.PREF_NAME = :pref", //
			nativeQuery = true)
	public List<String> findStationLineByPref(@Param("pref") String prefNmae);

	/**
	 * 依照車站路線印出對應的車站(Station_name)。
	 * 路線に該当する駅を印刷
	 **/
	@Query(value = "SELECT s.STATION_NAME" //
			+ " FROM `station` AS s"//
			+ " WHERE s.LINE_NAME = :line", //
			nativeQuery = true)
	public List<String> findStationNameByLine(@Param("line") String lineName);

	/**
	 * 依照市町村顯示車站路線(Line_name)。
	 * 市区町村別に路線を表示
	 **/
	@Query(value = "SELECT DISTINCT s.LINE_NAME" //
			+ " FROM `station` AS s" //
			+ " WHERE ADDRESS LIKE CONCAT('%',:address,'%');", //
			nativeQuery = true)
	public List<String> findStationLineByAddress(@Param("address") String address);
}
