package com.reinext.rental.service.ifs;

import com.reinext.rental.vo.RegionRes;

public interface RegionService {
	/**
	 * 印出所有都道府縣。
	 * すべての都道府県を印刷する
	 **/
	public RegionRes findAllPref();

	/**
	 * 依都道府縣搜尋市町村 #地域から検索 (muni = MUNICIPALITY, pref = PREFECTURE)。
	 * 都道府県から市町村を探す
	 **/
	public RegionRes searchMuniFromPref(String prefecture);
}
