package com.reinext.rental.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reinext.rental.service.ifs.RegionService;

@Controller
public class RegionController {

	@Autowired
	private RegionService service;

	@RequestMapping(value = "/{pref}/muni")
	public String muni(@PathVariable("pref") String pref, Model model) {
		// @PathVariable("pref")钡Μhtml肚患把计 -> ノㄓ倒api把计

		// 穓碝常笵┎郡┮Τカ薽
		List<String> res = service.searchMuniFromPref(pref).getRegionInfo();
		List<String> muniList = new ArrayList<String>();

		for (String item : res) {
			// 盢ぃ琌カ薽List
			if (StringUtils.hasText(item)) {
				muniList.add(item);
			}
		}
		
		model.addAttribute("muniData", muniList);
		return "muni";
	}

}
