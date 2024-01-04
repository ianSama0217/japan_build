package com.reinext.rental.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.reinext.rental.constants.RtnMsg;
import com.reinext.rental.entity.Station;
import com.reinext.rental.repository.RegionDao;
import com.reinext.rental.repository.StationDao;
import com.reinext.rental.service.ifs.StationService;
import com.reinext.rental.vo.StationCreateRes;
import com.reinext.rental.vo.StationRes;

@Service
public class StationServiceImpl implements StationService {

	@Autowired
	private StationDao stationDao;

	@Autowired
	private RegionDao regionDao;

	@Override
	public StationRes searchLineByPref(String prefNmae) {
		List<String> lineList = stationDao.findStationLineByPref(prefNmae);
		// 資料為空->回傳錯誤
		if (lineList.isEmpty()) {
			return new StationRes(RtnMsg.DATABASE_IS_EMPTY);
		}
		return new StationRes(RtnMsg.SUCCESSFUL, lineList);
	}

	@Override
	public StationRes searchStationByLine(List<String> lineNames) {
		if (lineNames.isEmpty()) {
			return new StationRes(RtnMsg.PARAM_ERROR);
		}

		List<String> stationList = new ArrayList<String>();

		for (String line : lineNames) {
			stationList.addAll(stationDao.findStationNameByLine(line));
		}

		if (stationList.isEmpty()) {
			return new StationRes(RtnMsg.DATABASE_IS_EMPTY);
		}

		return new StationRes(RtnMsg.SUCCESSFUL, stationList);
	}

	@Override
	public StationRes searchLineByAddress(String address) {
		if (!StringUtils.hasText(address)) {
			return new StationRes(RtnMsg.PARAM_ERROR);
		}
		// 市町村有可能沒有路線(不用防路線為空值)

		return new StationRes(RtnMsg.SUCCESSFUL, //
				stationDao.findStationLineByAddress(address));
	}

	@Override
	public StationCreateRes createStation(Station station) {
		if (!StringUtils.hasText(station.getPrefName()) || //
				!StringUtils.hasText(station.getAddress()) || //
				!StringUtils.hasText(station.getLineName()) || //
				!StringUtils.hasText(station.getStationName())) {
			return new StationCreateRes(RtnMsg.PARAM_ERROR, null);
		}

		// 都道府縣不存在
		if (!regionDao.existsByPrefecture(station.getPrefName())) {
			return new StationCreateRes(RtnMsg.PREFECTURE_NOT_FOUND, null);
		}

		// 地址已存在
		if (stationDao.existsByAddress(station.getAddress())) {
			return new StationCreateRes(RtnMsg.ADDRESS_IS_EXIST, null);
		}

		try {
			Station res = stationDao.save(station);
			return new StationCreateRes(RtnMsg.SUCCESSFUL, res);
		} catch (Exception e) {
			return new StationCreateRes(RtnMsg.CREATE_FAIL, null);
		}
	}
}
