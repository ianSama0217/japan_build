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
	 * 刪除所有對應build_id的room資料
	 **/
	public void deleteAllByBuildId(int id);

	/**
	 * 找出對應build_id的room資料(複數)
	 **/
	public List<Room> findAllByBuildId(int id);

	/* sql語法 */
	// 刪除所有對應build_id的room資料
	@Query(value = "SELECT * FROM room" + //
			" WHERE BUILD_ID = :id;", //
			nativeQuery = true)
	public void deleteRoom(int id);

	// 找出對應room_id的room資料
	@Query(value = "SELECT * FROM room" + //
			" WHERE ROOM_ID = :id", //
			nativeQuery = true)
	public Room getRoomInfo(@Param("id") int id);

	// 找出對應build_id的room資料(複數)
	@Query(value = "SELECT * FROM room" + //
			" WHERE BUILD_ID = :id" + //
			" ORDER BY ROOM_ID DESC", //
			nativeQuery = true)
	public List<Room> getRoomByBuildId(@Param("id") int id);
}
