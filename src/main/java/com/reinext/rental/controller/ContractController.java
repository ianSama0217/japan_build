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

	// ��ܩҦ��ت����C��
	@RequestMapping(value = "/build")
	public String buildInfo(Model model) {
//		model.addAttribute("buildList", service.getBuildInfo());
		return "build";
	}

	// ��ܹ����ت����X����T #�I��build���ت��W�ٶi�J�������X����T
	@GetMapping(value = "/{build}/contract/info")
	public String contractInfo(@PathVariable("build") String buildName, //
			@RequestParam(value = "id") int id, Model model) {
//		model.addAttribute("contractInfo", service.getContractInfo(id));
		return "contractInfo";
	}

	// ��ܩҦ��ت����C��(��x)
	@RequestMapping(value = "/buildBackend")
	public String buildBackendInfo(Model model) {
		model.addAttribute("buildList", buildService.getAllBuildInfo().getBuildList());
		return "buildBackend";
	}

	// ��ܹ����ت����X����T #�I��build���s��icon�i�J�������X����T
	@GetMapping(value = "/{build}/contract/edit")
	public String editContract(@PathVariable("build") String buildName, //
			@RequestParam(value = "id") int id, Model model) {
//		model.addAttribute("contractInfo", service.getContractInfo(id));
		return "editContract";
	}

	// ��s�X����T
	@PostMapping(value = "/contract/edit")
	public String testEdit(@ModelAttribute Build build, //

			@RequestParam(name = "mainId") int id) {

		// ���obuildID�л\���(��s)
		build.setId(id);
		System.out.println("id:" + id);

//		service.save(build, facility, pFacility, cp, rent, landlord, tenant, maxA, //
//				rFee, sTerm);
		return "index";
	}

	// �x�s�X����T
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
