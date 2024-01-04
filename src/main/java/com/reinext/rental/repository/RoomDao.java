package com.reinext.rental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Room;

@Repository
public interface RoomDao extends JpaRepository<Room, Integer> {

	/**
	 * 刪除所有對應build_id的room資料
	 **/
	public void deleteAllByBuildId(int id);
	
	/**
	 * 刪除對應build_id的room資料(單筆)
	 **/
	public void deleteByBuildId(int id);
	
	/**
	 * 找出對應build_id的room資料(複數)
	 **/
	public List<Room> findAllByBuildId(int id);

	/**
	 * 找出對應build_id的room資料(單筆)
	 **/
	public Room findByBuildId(int id);
}
