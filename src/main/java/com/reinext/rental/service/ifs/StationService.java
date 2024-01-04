package com.reinext.rental.service.ifs;

import java.util.List;

import com.reinext.rental.entity.Station;
import com.reinext.rental.vo.StationCreateRes;
import com.reinext.rental.vo.StationRes;

public interface StationService {

	/**
	 * 印出所有的都道府縣對應路線 #路線から検索。
	 * 都道府県の対応路線を印刷します
	 **/
	public StationRes searchLineByPref(String prefNmae);

	/**
	 * 印出路線對應的所有車站 #選択すると路線の駅が表示される 複数の路線が選択できる。
	 * 路線に対応するすべての駅を印刷します
	 **/
	public StationRes searchStationByLine(List<String> lineNames);

	/**
	 * 印出市町村對應的路線 #市町村の別で路線が表示される。
	 * 市町村に対応したルートを印刷する
	 **/
	public StationRes searchLineByAddress(String address);

	/**
	 * 新增車站和線路 #路線や駅が増える。
	 * 駅と路線を追加する
	 **/
	public StationCreateRes createStation(Station station);
}
