package com.reinext.rental.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reinext.rental.entity.Station;
import com.reinext.rental.service.ifs.RegionService;
import com.reinext.rental.service.ifs.StationService;

@Controller
public class ViewController {

	@Autowired
	private RegionService regionService;

	@Autowired
	private StationService stationService;

	/* 首頁 */
	@RequestMapping(value = "")
	public String index() {
		return "index";
	}

	// 指向到/region
	@RequestMapping("/region")
	public String region(Model model) {
		// key , value
		model.addAttribute("pref", regionService.findAllPref().getRegionInfo());
		return "region";
	}

	// 指向到/line
	@RequestMapping("/line")
	public String line(Model model) {
		model.addAttribute("pref", regionService.findAllPref().getRegionInfo());
		return "line";
	}

	// 指向到/backend
	@RequestMapping("/backend")
	public String backend(Model model) {
		model.addAttribute("pref", regionService.findAllPref().getRegionInfo());
		return "backend";
	}

	// 後台顯示所有資料位置
	@RequestMapping(value = "/{pref}/data")
	public String backendData(@PathVariable("pref") String pref, Model model) {
		// @PathVariable("pref")接收html傳遞的參數 -> 用來給api參數

		// 搜尋都道府縣所有車站
		List<String> lineList = stationService.searchLineByPref(pref).getStationInfos();
		// 搜尋都道府縣所有市町村
		List<String> res = regionService.searchMuniFromPref(pref).getRegionInfo();
		List<String> muniList = new ArrayList<String>();

		for (String item : res) {
			// 將不是空值的市町村加入List
			if (StringUtils.hasText(item)) {
				muniList.add(item);
			}
		}

		model.addAttribute("lineData", lineList);
		model.addAttribute("muniData", muniList);
		return "backendData";
	}

	/* 點擊市町村a tag觸發 */
	@RequestMapping(value = "/{pref}/{muni}/data")
	public String searchLineByMuni(@PathVariable("pref") String pref, //
			@PathVariable("muni") String muni, Model model) {

		// 搜尋市町村所有車站
		List<String> lineList = stationService.searchLineByAddress(muni).getStationInfos();

		// 搜尋都道府縣所有市町村
		List<String> res = regionService.searchMuniFromPref(pref).getRegionInfo();
		List<String> muniList = new ArrayList<String>();

		for (String item : res) {
			// 將不是空值的市町村加入List
			if (StringUtils.hasText(item)) {
				muniList.add(item);
			}
		}

		model.addAttribute("lineData", lineList);
		model.addAttribute("muniData", muniList);
		return "backendData";
	}

	/* 點擊 #路線を追加# 觸發 */
	@RequestMapping(value = "/create/line")
	public String create() {

		return "createLine";
	}

	@PostMapping(value = "/create")
	public String createStation(@ModelAttribute Station station) {
		stationService.createStation(station);
		return "index";
	}

}
