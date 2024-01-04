package com.reinext.rental.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Landlord;

@Repository
public interface LandlordDao extends JpaRepository<Landlord, Integer> {

	/**
	 * �R������room_id��landlord��T 
	 **/
	public void deleteAllByRoomId(int id);
	
	/**
	 * ��ܹ���room_id��landlord��T 
	 **/
	public Landlord findByRoomId(int id);
}
