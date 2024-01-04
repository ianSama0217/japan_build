package com.reinext.rental.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.reinext.rental.constants.RtnMsg;
import com.reinext.rental.entity.Build;
import com.reinext.rental.entity.Landlord;
import com.reinext.rental.entity.NearStation;
import com.reinext.rental.entity.Room;
import com.reinext.rental.entity.Tenant;
import com.reinext.rental.repository.BuildDao;
import com.reinext.rental.repository.LandlordDao;
import com.reinext.rental.repository.NearStationDao;
import com.reinext.rental.repository.RoomDao;
import com.reinext.rental.repository.TenantDao;
import com.reinext.rental.service.ifs.BuildService;
import com.reinext.rental.vo.BuildAllRes;
import com.reinext.rental.vo.BuildAndRoom;
import com.reinext.rental.vo.BuildRes;
import com.reinext.rental.vo.RoomAllRes;
import com.reinext.rental.vo.SearchAllRes;
import com.reinext.rental.vo.StationAllRes;

import jakarta.transaction.Transactional;

@Service
public class BuildServiceImpl implements BuildService {

	@Autowired
	private BuildDao buildDao;

	@Autowired
	private NearStationDao nStationDao;

	@Autowired
	private RoomDao roomDao;

	@Autowired
	private LandlordDao landlordDao;

	@Autowired
	private TenantDao tenantDao;

	@Override
	public BuildRes save(Build build) {
		// �p�G�S����g��ơA�w�]1
		if (!StringUtils.hasText(build.getHouseHolds())) {
			build.setHouseHolds("1");
		}

		buildDao.save(build);
		return new BuildRes(RtnMsg.SUCCESSFUL, build);
	}

	@Override
	public BuildRes save(NearStation nStation) {
		if (nStation == null) {
			return new BuildRes(RtnMsg.PARAM_ERROR);
		}

		nStationDao.save(nStation);
		return new BuildRes(RtnMsg.SUCCESSFUL, nStation);
	}

	@Override
	public BuildRes save(Room room) {
		roomDao.save(room);
		return new BuildRes(RtnMsg.SUCCESSFUL, room);
	}

	@Override
	public BuildRes save(Landlord landlord) {
		landlordDao.save(landlord);
		return new BuildRes(RtnMsg.SUCCESSFUL, landlord);
	}

	@Override
	public BuildRes save(Tenant tenant) {
		tenantDao.save(tenant);
		return new BuildRes(RtnMsg.SUCCESSFUL, tenant);
	}

	@Transactional
	@Override
	public BuildRes deleteBuild(int id) {
		buildDao.deleteById(id);

		// �R������build_id��room���
		roomDao.deleteAllByBuildId(id);

		// �R������build_id��station���
		nStationDao.deleteAllByBuildId(id);

		return new BuildRes(RtnMsg.SUCCESSFUL);
	}

	@Override
	public BuildRes deleteStation(int id) {
		if (!nStationDao.existsById(id)) {
			return new BuildRes(RtnMsg.STATION_ID_NOT_FOUND);
		}

		Optional<NearStation> op = nStationDao.findById(id);
		if (op.isEmpty()) {
			return new BuildRes(RtnMsg.STATION_IS_EMPTY);
		}

		nStationDao.deleteById(id);

		return new BuildRes(RtnMsg.SUCCESSFUL, op.get());
	}

	@Override
	public BuildRes deleteRoom(int id) {
		if (!roomDao.existsById(id)) {
			return new BuildRes(RtnMsg.Room_ID_NOT_FOUND);
		}

		Optional<Room> op = roomDao.findById(id);
		if (op.isEmpty()) {
			return new BuildRes(RtnMsg.ROOM_IS_EMPTY);
		}

		roomDao.deleteById(id);

		return new BuildRes(RtnMsg.SUCCESSFUL, op.get());
	}

	@Override
	public BuildAllRes getAllBuildInfo() {
		List<Build> buildList = buildDao.findAll();

		// �p�GbuildList�S�����(null)�A���@�Ӫ�List
		buildList = buildList.size() != 0 ? buildList : Collections.emptyList();

		// ����List(��ܥѷs����)
		Collections.reverse(buildList);

		return new BuildAllRes(RtnMsg.SUCCESSFUL, buildList);
	}

	@Override
	public BuildRes getBuildInfo(int id) {
		if (!buildDao.existsById(id)) {
			return new BuildRes(RtnMsg.ID_NOT_FOUND);
		}

		Optional<Build> op = buildDao.findById(id);
		if (op.isEmpty()) {
			return new BuildRes(RtnMsg.BUILD_IS_EMPTY);
		}

		return new BuildRes(RtnMsg.SUCCESSFUL, op.get());
	}

	@Override
	public SearchAllRes getAllBuildRoomInfo() {
		List<Build> buildList = buildDao.findAll();

		// �p�GbuildList�S�����(null)�A���@�Ӫ�List
		buildList = buildList.size() != 0 ? buildList : Collections.emptyList();

		// �Ыؤ@�Ӫ�arr
		List<BuildAndRoom> buildAndRooms = new ArrayList<BuildAndRoom>();

		// �x�s����build��room��T(�G���}�C)
		for (Build build : buildList) {
			List<Room> room = roomDao.findAllByBuildId(build.getId());
			List<NearStation> station = nStationDao.findAllByBuildId(build.getId());
			BuildAndRoom buildAndRoom = new BuildAndRoom(build, room, station);
			buildAndRooms.add(buildAndRoom);
		}

		// �p�GbuildList�S�����(null)�A���@�Ӫ�List
		buildAndRooms = buildAndRooms.size() != 0 ? buildAndRooms : Collections.emptyList();

		// ����List(��ܥѷs����)
		Collections.reverse(buildAndRooms);

		return new SearchAllRes(RtnMsg.SUCCESSFUL, buildAndRooms);
	}

	@Override
	public StationAllRes getStationInfoByBuildId(int id) {
		List<NearStation> stationList = nStationDao.findAllByBuildId(id);

		// �p�G�S���ж���T�n���Ű}�C
		stationList = stationList.size() != 0 ? stationList : Collections.emptyList();
		return new StationAllRes(RtnMsg.SUCCESSFUL, stationList);
	}

	@Override
	public BuildRes getRoomInfo(int id) {
		Optional<Room> op = roomDao.findById(id);
		if (op.isEmpty()) {
			return new BuildRes(RtnMsg.ROOM_IS_EMPTY);
		}
		return new BuildRes(RtnMsg.SUCCESSFUL, op.get());
	}

	@Override
	public RoomAllRes getRoomInfoByBuildId(int id) {
		List<Room> roomList = roomDao.findAllByBuildId(id);

		// �p�G�S���ж���T�n���Ű}�C
		roomList = roomList.size() != 0 ? roomList : Collections.emptyList();
		return new RoomAllRes(RtnMsg.SUCCESSFUL, roomList);
	}

	@Override
	public BuildRes getLandlordInfo(int id) {
		Landlord landlord = landlordDao.findByRoomId(id);
		return new BuildRes(RtnMsg.SUCCESSFUL, landlord);
	}

	@Override
	public BuildRes getTenantInfo(int id) {
		Tenant tenant = tenantDao.findByRoomId(id);
		return new BuildRes(RtnMsg.SUCCESSFUL, tenant);
	}

	@Override
	public BuildRes getContractInfo(int id) {
		// �ˬdid�O�_�s�b
		if (!buildDao.existsById(id)) {
			return new BuildRes(RtnMsg.BUILD_ID_NOT_FOUND);
		}

		Optional<Build> op = buildDao.findById(id);
		if (op.isEmpty()) {
			return new BuildRes(RtnMsg.BUILD_IS_EMPTY);
		}

		Build build = op.get();

		// ��X����build_id��room��T
		Room room = roomDao.findByBuildId(id);
		if (room == null) {
			return new BuildRes(RtnMsg.ROOM_IS_EMPTY);
		}

		// ��X������room_id���ЪF�B���ȸ�T
		Landlord landlord = landlordDao.findByRoomId(room.getRoomId());
		if (landlord == null) {
			return new BuildRes(RtnMsg.LANDLORD_IS_EMPTY);
		}

		Tenant tenant = tenantDao.findByRoomId(room.getRoomId());
		if (tenant == null) {
			return new BuildRes(RtnMsg.TENANT_IS_EMPTY);
		}

		return new BuildRes(RtnMsg.SUCCESSFUL, build, room, landlord, tenant);
	}

}
