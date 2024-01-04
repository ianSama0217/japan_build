package com.reinext.rental.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Tenant;

@Repository
public interface TenantDao extends JpaRepository<Tenant, Integer> {

	/**
	 * �R������room_id��tenant��T
	 **/
	public void deleteAllByRoomId(int id);

	/**
	 * ��ܹ���room_id��tenant��T
	 **/
	public Tenant findByRoomId(int id);
}
