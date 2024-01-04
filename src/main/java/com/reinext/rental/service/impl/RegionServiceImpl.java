package com.reinext.rental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reinext.rental.constants.RtnMsg;
import com.reinext.rental.repository.RegionDao;
import com.reinext.rental.service.ifs.RegionService;
import com.reinext.rental.vo.RegionRes;

@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
	private RegionDao regionDao;

	@Override
	public RegionRes findAllPref() {
		List<String> prefList = regionDao.findAllByPref();

		// 資料為空 -> 回傳錯誤訊息
		if (prefList.isEmpty()) {
			return new RegionRes(RtnMsg.DATABASE_IS_EMPTY);
		}
		return new RegionRes(RtnMsg.SUCCESSFUL, prefList);
	}

	@Override
	public RegionRes searchMuniFromPref(String prefecture) {
		List<String> muniList = regionDao.searchFromPref(prefecture);

		// 資料為空 -> 回傳錯誤訊息
		if (muniList.isEmpty()) {
			return new RegionRes(RtnMsg.DATABASE_IS_EMPTY);
		}
		return new RegionRes(RtnMsg.SUCCESSFUL, muniList);
	}

}
