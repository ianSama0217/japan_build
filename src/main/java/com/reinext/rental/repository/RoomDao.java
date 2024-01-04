package com.reinext.rental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Room;

@Repository
public interface RoomDao extends JpaRepository<Room, Integer> {

	/**
	 * �R���Ҧ�����build_id��room���
	 **/
	public void deleteAllByBuildId(int id);
	
	/**
	 * �R������build_id��room���(�浧)
	 **/
	public void deleteByBuildId(int id);
	
	/**
	 * ��X����build_id��room���(�Ƽ�)
	 **/
	public List<Room> findAllByBuildId(int id);

	/**
	 * ��X����build_id��room���(�浧)
	 **/
	public Room findByBuildId(int id);
}
