package com.reinext.rental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Region;

@Repository
public interface RegionDao extends JpaRepository<Region, String> {

	/**
	 * 判斷都道府縣是否存在(#創建路線&車站，判斷條件)。
	 * 都道府県が存在するかどうかを調べる（#路線・駅の作成と条件の決定）
	 **/
	public boolean existsByPrefecture(String pref);

	/**
	 * 印出所有的都道府縣。
	 * すべての都道府県を印刷する
	 **/
	@Query(value = "select DISTINCT region.PREFECTURE from region", //
			nativeQuery = true)
	public List<String> findAllByPref();

	/**
	 * 找出都道府縣對應的市町村 (Pref = prefecture)。
	 * 県内の該当する市町村を探す
	 **/
	@Query(value = " select MUNICIPALITY from region" //
			+ " where PREFECTURE = :pref", //
			nativeQuery = true)
	public List<String> searchFromPref(@Param("pref") String prefecture);
}
