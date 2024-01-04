package com.reinext.rental.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Tenant;

@Repository
public interface TenantDao extends JpaRepository<Tenant, Integer> {

	/**
	 * 刪除對應room_id的tenant資訊
	 **/
	public void deleteAllByRoomId(int id);

	/**
	 * 顯示對應room_id的tenant資訊
	 **/
	public Tenant findByRoomId(int id);
}
