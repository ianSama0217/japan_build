package com.reinext.rental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Room;

@Repository
public interface RoomDao extends JpaRepository<Room, Integer> {

	/**
	 * �R���Ҧ�����build_id��room���
	 **/
	public void deleteAllByBuildId(int id);

	/**
	 * ��X����build_id��room���(�Ƽ�)
	 **/
	public List<Room> findAllByBuildId(int id);

	/* sql�y�k */
	// �R���Ҧ�����build_id��room���
	@Query(value = "SELECT * FROM room" + //
			" WHERE BUILD_ID = :id;", //
			nativeQuery = true)
	public void deleteRoom(int id);

	// ��X����room_id��room���
	@Query(value = "SELECT * FROM room" + //
			" WHERE ROOM_ID = :id", //
			nativeQuery = true)
	public Room getRoomInfo(@Param("id") int id);

	// ��X����build_id��room���(�Ƽ�)
	@Query(value = "SELECT * FROM room" + //
			" WHERE BUILD_ID = :id" + //
			" ORDER BY ROOM_ID DESC", //
			nativeQuery = true)
	public List<Room> getRoomByBuildId(@Param("id") int id);
}
