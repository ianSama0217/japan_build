package com.reinext.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reinext.rental.entity.Build;
import com.reinext.rental.service.ifs.BuildService;

@Controller
public class ContractController {

	@Autowired
	private BuildService buildService;

	// 顯示所有建物的列表
	@RequestMapping(value = "/build")
	public String buildInfo(Model model) {
//		model.addAttribute("buildList", service.getBuildInfo());
		return "build";
	}

	// 顯示對應建物的合約資訊 #點擊build的建物名稱進入對應的合約資訊
	@GetMapping(value = "/{build}/contract/info")
	public String contractInfo(@PathVariable("build") String buildName, //
			@RequestParam(value = "id") int id, Model model) {
//		model.addAttribute("contractInfo", service.getContractInfo(id));
		return "contractInfo";
	}

	// 顯示所有建物的列表(後台)
	@RequestMapping(value = "/buildBackend")
	public String buildBackendInfo(Model model) {
		model.addAttribute("buildList", buildService.getAllBuildInfo().getBuildList());
		return "buildBackend";
	}

	// 顯示對應建物的合約資訊 #點擊build的編輯icon進入對應的合約資訊
	@GetMapping(value = "/{build}/contract/edit")
	public String editContract(@PathVariable("build") String buildName, //
			@RequestParam(value = "id") int id, Model model) {
//		model.addAttribute("contractInfo", service.getContractInfo(id));
		return "editContract";
	}

	// 更新合約資訊
	@PostMapping(value = "/contract/edit")
	public String testEdit(@ModelAttribute Build build, //

			@RequestParam(name = "mainId") int id) {

		// 取得buildID覆蓋資料(更新)
		build.setId(id);
		System.out.println("id:" + id);

//		service.save(build, facility, pFacility, cp, rent, landlord, tenant, maxA, //
//				rFee, sTerm);
		return "index";
	}

	// 儲存合約資訊
	@PostMapping(value = "/contract/create")
	public String testSave(@ModelAttribute Build build//
	) {
//		service.save(build, facility, pFacility, cp, rent, landlord, tenant, maxA, //
//				rFee, sTerm);
		return "index";
	}

	@RequestMapping(value = "/contract/create")
	public String create() {
		return "createContract";
	}
}
