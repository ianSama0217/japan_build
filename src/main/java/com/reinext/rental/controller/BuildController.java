package com.reinext.rental.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reinext.rental.entity.Build;
import com.reinext.rental.entity.NearStation;
import com.reinext.rental.entity.Room;
import com.reinext.rental.service.ifs.BuildService;
import com.reinext.rental.service.ifs.RegionService;
import com.reinext.rental.service.ifs.StationService;
import com.reinext.rental.vo.BuildAndRoom;

import jakarta.servlet.http.HttpSession;

@CrossOrigin
@Controller
public class BuildController {
	@Autowired
	private BuildService buildService;

	@Autowired
	private RegionService regionService;

	@Autowired
	private StationService stationService;

	// ���զa��svg
	@RequestMapping(value = "/test")
	public String test() {
		return "buildClient/test";
	}

	// ��ܩҦ��ت��C��(�e�x)
	@GetMapping(value = "/build/list")
	public String buildList(Model model) {
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);

		return "buildClient/buildList";
	}

	// ��ܩҦ�����build_id��room�C��(�e�x)
	@GetMapping(value = "/room/list")
	public String roomList(@RequestParam(value = "id") int id, //
			Model model) {
		List<Room> roomList = buildService.getRoomInfoByBuildId(id).getRoomList();
		model.addAttribute("data", roomList);

		return "buildClient/roomList";
	}

	// ��ܩҦ��ت����C��(��x)
	@GetMapping(value = "/buildBackend/list")
	public String buildBackendList(Model model) {
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// �P�_�O�_���roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// ��ܳЫ�build���� #��x�I���Ыت�����s
	@GetMapping(value = "/build/create")
	public String createBuild(Model model) {
		// ���o���D����
		List<String> pref = regionService.findAllPref().getRegionInfo();
		model.addAttribute("pref", pref);
		// ���o���w���m�����
		List<String> res = regionService.searchMuniFromPref("�F�ʳ�").getRegionInfo();
		List<String> muni = new ArrayList<String>();

		for (String item : res) {
			// �N���O�ŭȪ����m���[�JList
			if (StringUtils.hasText(item)) {
				muni.add(item);
			}
		}

		model.addAttribute("muni", muni);

		return "buildBackend/create/createBuild";
	}

	// �^���x���� #��J��build��T�I���x�s���s
	@PostMapping(value = "/build/save")
	public String saveBuild(@ModelAttribute Build build, //
			Model model) {
		buildService.save(build);
		// ��ܫ�ݦC��
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// �P�_�O�_���roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// ��ܳЫ�station���� #�Ыا�build�I�� �q��icon
	@GetMapping(value = "/station/create")
	public String createStation(@RequestParam(value = "muni") String muni, //
			@RequestParam(value = "id") int id, //
			Model model, HttpSession session) {
		// �]�w���m����T(���w���񨮯����u)
		if (StringUtils.hasText(muni)) {
			List<String> lineList = stationService.searchLineByAddress(muni).getStationInfos();
			model.addAttribute("lineList", lineList);
			session.setAttribute("lineList", lineList);

			// �]�wbuild_id
			session.setAttribute("buildId", id);
			return "buildBackend/create/createStation";
		} // �p�G�S����Jmuni => �ɦ^����
		else {
			// ��ܫ�ݦC��
			List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
			model.addAttribute("data", data);
			// �P�_�O�_���roomList
			model.addAttribute("isShow", true);

			return "buildBackend/buildBackendList";
		}
	}

	// �x�s��Ʀb��e�� #��J��station��T�I���x�s���s
	@PostMapping(value = "/station/save")
	public String saveStation(@ModelAttribute NearStation nStation, //
			Model model, HttpSession session) {

		List<String> lineList = (List<String>) session.getAttribute("lineList");
		model.addAttribute("lineList", lineList);
		// �]�wbuildId
		int buildId = (int) session.getAttribute("buildId");
		nStation.setBuildId(buildId);
		buildService.save(nStation);

		return "buildBackend/create/createStation";
	}

	// ��ܳЫ�room���� #��x�I���s�W�ж����s
	@GetMapping(value = "/room/create")
	public String createRoom(@RequestParam(value = "id") int id, //
			HttpSession session) {
		session.setAttribute("buildId", id);
		return "buildBackend/create/createRoom";
	}

	// �^���x���� #��J��room��T�I���x�s���s
	@PostMapping(value = "/room/save")
	public String saveRoom(@ModelAttribute Room room, //
			Model model, HttpSession session) {
		int buildId = (int) session.getAttribute("buildId");
		room.setBuildId(buildId);
		buildService.save(room);

		// ��ܫ�ݦC��
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// �P�_�O�_���roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// TODO �٭n�R���������
	// �I��Build�������R��icon
	@PostMapping(value = "/build/delete")
	public String deleteBuild(@RequestParam(value = "id") int id, //
			Model model) {
		buildService.deleteBuild(id);

		// ��ܫ�ݦC��
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// �P�_�O�_���roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// ��ܽs��build���� #��x�I���s�誫��icon
	@PostMapping(value = "/room/delete")
	public String deleteRoom(@RequestParam(value = "id") int id, //
			Model model) {
		buildService.deleteRoom(id);

		// ��ܫ�ݦC��
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// �P�_�O�_���roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// ��ܽs��build���� #��x�I���s�誫��icon
	@GetMapping(value = "/build/edit")
	public String editBuild(@RequestParam(value = "id") int id, //
			Model model, HttpSession session) {

		Build build = buildService.getBuildInfo(id).getBuild();
		model.addAttribute("BuildInfo", build);
		// �x�sbuild_id
		session.setAttribute("buildId", build.getId());

		// ���o���D����
		List<String> pref = regionService.findAllPref().getRegionInfo();
		model.addAttribute("pref", pref);
		// ���o���w���m�����
		List<String> res = regionService.searchMuniFromPref("�F�ʳ�").getRegionInfo();
		List<String> muni = new ArrayList<String>();

		for (String item : res) {
			// �N���O�ŭȪ����m���[�JList
			if (StringUtils.hasText(item)) {
				muni.add(item);
			}
		}

		model.addAttribute("muni", muni);
		return "buildBackend/edit/editBuild";
	}

	// ��ܽs��room���� #��x�I���s��ж����s
	@GetMapping(value = "/room/edit")
	public String editRoom(@RequestParam(value = "id") int id, //
			Model model, HttpSession session) {
		Room room = buildService.getRoomInfo(id).getRoom();
		model.addAttribute("roomInfo", room);

		// �]�wbuild_id
		session.setAttribute("buildId", room.getBuildId());
		session.setAttribute("roomId", room.getRoomId());

		return "buildBackend/edit/editRoom";
	}

	@PostMapping(value = "/build/update")
	public String updateBuild(@ModelAttribute Build build, //
			Model model, HttpSession session) {
		int id = (int) session.getAttribute("buildId");
		build.setId(id);
		buildService.save(build);

		// ��ܫ�ݦC��
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// �P�_�O�_���roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	@PostMapping(value = "/room/update")
	public String updateRoom(@ModelAttribute Room room, //
			Model model, HttpSession session) {
		// ���osession����build_id,room_id
		int buildId = (int) session.getAttribute("buildId");
		room.setBuildId(buildId);
		int roomId = (int) session.getAttribute("roomId");
		room.setRoomId(roomId);

		buildService.save(room);

		// ��ܫ�ݦC��
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// �P�_�O�_���roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}
}
