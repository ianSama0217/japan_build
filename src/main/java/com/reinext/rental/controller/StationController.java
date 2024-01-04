package com.reinext.rental.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reinext.rental.service.ifs.StationService;

@Controller
public class StationController {

	@Autowired
	private StationService service;

	// 點擊都道府縣顯示對應線路
	@RequestMapping(value = "/{pref}/line")
	public String station(@PathVariable("pref") String pref, Model model) {
		// @PathVariable("pref")接收html傳遞的參數 -> 用來給api參數

		List<String> lineList = service.searchLineByPref(pref).getStationInfos();
		// 傳遞給muni.html的值
		model.addAttribute("lineData", lineList);
		return "station";
	}

	/* 處理表單發送的Arr資料 (點擊 #駅を検索# 觸發) */
	@GetMapping(value = "/station/info")
	public String stationData(//
			@RequestParam(value = "line", required = false) String line, //
			Model model) {
		// line 接收JS傳遞的路線(String)

		// 將line轉換為Array
		String[] lineArr = line.split(";");
		// 將lineArr轉換為List
		List<String> lineList = Arrays.asList(lineArr);

		List<String> stationList = service.searchStationByLine(lineList).getStationInfos();

		// 陣列為null -> 定義為空陣列
		stationList = (stationList == null) ? Collections.emptyList() : stationList;

		// 將搜尋結果傳遞給stationdata.html
		model.addAttribute("stationName", stationList);
		return "stationData";
	}
}
