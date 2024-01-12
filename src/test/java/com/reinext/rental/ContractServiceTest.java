package com.reinext.rental;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.reinext.rental.entity.Build;
import com.reinext.rental.entity.Landlord;
import com.reinext.rental.entity.Room;
import com.reinext.rental.entity.Tenant;
import com.reinext.rental.repository.LandlordDao;
import com.reinext.rental.repository.RoomDao;
import com.reinext.rental.repository.TenantDao;
import com.reinext.rental.service.ifs.BuildService;

@SpringBootTest
public class ContractServiceTest {

	@Autowired
	private BuildService buildService;

	@Autowired
	private RoomDao roomDao;

	@Autowired
	private LandlordDao landlordDao;

	@Autowired
	private TenantDao tenantDao;

//	String floor, String roomNum, String floorPlan, String floorSpace, String balconySpace,
//	int rentCost, int managementFee, int buildId
	@Test
	public void createRoom() {
		Room room = new Room("3", "307", "1D1K", "87.1", "0", 3500, 2000, 141);
		buildService.save(room);
	}

	@Test
	public void deleteBuild() {
		buildService.deleteBuild(81);
	}

	@Test
	public void getBuildInfo() {
		Build build = buildService.getBuildInfo(97).getBuild();
		System.out.println(build.getBuildName());
	}

	@Test
	public void getAllRoomInfo() {

	}

	@Test
	public void getlandlordInfo() {
		Landlord landlord = landlordDao.findByRoomId(23);
		System.out.println(landlord.getLandlordId());
		System.out.println(landlord.getRoomId());
		System.out.println(landlord.getLessorName());
	}

	@Test
	public void gettenantInfo() {
		Tenant tenant = tenantDao.findByRoomId(23);
		System.out.println(tenant.getTenantId());
		System.out.println(tenant.getRoomId());
		System.out.println(tenant.getTenantName());
	}

	@Test
	public void getRoomInfoTest() {
		List<Room> roomList = roomDao.getRoomByBuildId(140);
		for (Room room : roomList) {
			System.out.println("room id:" + room.getRoomId());
		}
	}
	
	@Test
	public void getRoomTest() {
		Room room = roomDao.getRoomInfo(59);
			System.out.println("room id:" + room.getRoomId());
			System.out.println("備考:" + room.getTerm());
	}

}
