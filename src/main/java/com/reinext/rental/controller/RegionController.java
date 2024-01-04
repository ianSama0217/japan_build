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
		// @PathVariable("pref")����html�ǻ����Ѽ� -> �Ψӵ�api�Ѽ�

		// �j�M���D�����Ҧ����m��
		List<String> res = service.searchMuniFromPref(pref).getRegionInfo();
		List<String> muniList = new ArrayList<String>();

		for (String item : res) {
			// �N���O�ŭȪ����m���[�JList
			if (StringUtils.hasText(item)) {
				muniList.add(item);
			}
		}
		
		model.addAttribute("muniData", muniList);
		return "muni";
	}

}
