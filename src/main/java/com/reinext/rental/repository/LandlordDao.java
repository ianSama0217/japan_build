package com.reinext.rental.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinext.rental.entity.Landlord;

@Repository
public interface LandlordDao extends JpaRepository<Landlord, Integer> {

	/**
	 * 刪除對應room_id的landlord資訊 
	 **/
	public void deleteAllByRoomId(int id);
	
	/**
	 * 顯示對應room_id的landlord資訊 
	 **/
	public Landlord findByRoomId(int id);
}
