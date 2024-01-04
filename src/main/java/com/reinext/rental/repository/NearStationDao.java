package com.reinext.rental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.NearStation;

@Repository
public interface NearStationDao extends JpaRepository<NearStation, Integer> {

	public List<NearStation> findAllByBuildId(int id);
	
	public void deleteAllByBuildId(int id);
}
