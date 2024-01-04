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

	// 測試地圖svg
	@RequestMapping(value = "/test")
	public String test() {
		return "buildClient/test";
	}

	// 顯示所有建物列表(前台)
	@GetMapping(value = "/build/list")
	public String buildList(Model model) {
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);

		return "buildClient/buildList";
	}

	// 顯示所有對應build_id的room列表(前台)
	@GetMapping(value = "/room/list")
	public String roomList(@RequestParam(value = "id") int id, //
			Model model) {
		List<Room> roomList = buildService.getRoomInfoByBuildId(id).getRoomList();
		model.addAttribute("data", roomList);

		return "buildClient/roomList";
	}

	// 顯示所有建物的列表(後台)
	@GetMapping(value = "/buildBackend/list")
	public String buildBackendList(Model model) {
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// 判斷是否顯示roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// 顯示創建build頁面 #後台點擊創建物件按鈕
	@GetMapping(value = "/build/create")
	public String createBuild(Model model) {
		// 取得都道府縣
		List<String> pref = regionService.findAllPref().getRegionInfo();
		model.addAttribute("pref", pref);
		// 取得指定市町村資料
		List<String> res = regionService.searchMuniFromPref("東京都").getRegionInfo();
		List<String> muni = new ArrayList<String>();

		for (String item : res) {
			// 將不是空值的市町村加入List
			if (StringUtils.hasText(item)) {
				muni.add(item);
			}
		}

		model.addAttribute("muni", muni);

		return "buildBackend/create/createBuild";
	}

	// 回到後台首頁 #輸入完build資訊點擊儲存按鈕
	@PostMapping(value = "/build/save")
	public String saveBuild(@ModelAttribute Build build, //
			Model model) {
		buildService.save(build);
		// 顯示後端列表
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// 判斷是否顯示roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// 顯示創建station頁面 #創建完build點擊 電車icon
	@GetMapping(value = "/station/create")
	public String createStation(@RequestParam(value = "muni") String muni, //
			@RequestParam(value = "id") int id, //
			Model model, HttpSession session) {
		// 設定市町村資訊(給定附近車站路線)
		if (StringUtils.hasText(muni)) {
			List<String> lineList = stationService.searchLineByAddress(muni).getStationInfos();
			model.addAttribute("lineList", lineList);
			session.setAttribute("lineList", lineList);

			// 設定build_id
			session.setAttribute("buildId", id);
			return "buildBackend/create/createStation";
		} // 如果沒有輸入muni => 導回首頁
		else {
			// 顯示後端列表
			List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
			model.addAttribute("data", data);
			// 判斷是否顯示roomList
			model.addAttribute("isShow", true);

			return "buildBackend/buildBackendList";
		}
	}

	// 儲存資料在原畫面 #輸入完station資訊點擊儲存按鈕
	@PostMapping(value = "/station/save")
	public String saveStation(@ModelAttribute NearStation nStation, //
			Model model, HttpSession session) {

		List<String> lineList = (List<String>) session.getAttribute("lineList");
		model.addAttribute("lineList", lineList);
		// 設定buildId
		int buildId = (int) session.getAttribute("buildId");
		nStation.setBuildId(buildId);
		buildService.save(nStation);

		return "buildBackend/create/createStation";
	}

	// 顯示創建room頁面 #後台點擊新增房間按鈕
	@GetMapping(value = "/room/create")
	public String createRoom(@RequestParam(value = "id") int id, //
			HttpSession session) {
		session.setAttribute("buildId", id);
		return "buildBackend/create/createRoom";
	}

	// 回到後台首頁 #輸入完room資訊點擊儲存按鈕
	@PostMapping(value = "/room/save")
	public String saveRoom(@ModelAttribute Room room, //
			Model model, HttpSession session) {
		int buildId = (int) session.getAttribute("buildId");
		room.setBuildId(buildId);
		buildService.save(room);

		// 顯示後端列表
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// 判斷是否顯示roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// TODO 還要刪除車站資料
	// 點擊Build頁面的刪除icon
	@PostMapping(value = "/build/delete")
	public String deleteBuild(@RequestParam(value = "id") int id, //
			Model model) {
		buildService.deleteBuild(id);

		// 顯示後端列表
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// 判斷是否顯示roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// 顯示編輯build頁面 #後台點擊編輯物件icon
	@PostMapping(value = "/room/delete")
	public String deleteRoom(@RequestParam(value = "id") int id, //
			Model model) {
		buildService.deleteRoom(id);

		// 顯示後端列表
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// 判斷是否顯示roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	// 顯示編輯build頁面 #後台點擊編輯物件icon
	@GetMapping(value = "/build/edit")
	public String editBuild(@RequestParam(value = "id") int id, //
			Model model, HttpSession session) {

		Build build = buildService.getBuildInfo(id).getBuild();
		model.addAttribute("BuildInfo", build);
		// 儲存build_id
		session.setAttribute("buildId", build.getId());

		// 取得都道府縣
		List<String> pref = regionService.findAllPref().getRegionInfo();
		model.addAttribute("pref", pref);
		// 取得指定市町村資料
		List<String> res = regionService.searchMuniFromPref("東京都").getRegionInfo();
		List<String> muni = new ArrayList<String>();

		for (String item : res) {
			// 將不是空值的市町村加入List
			if (StringUtils.hasText(item)) {
				muni.add(item);
			}
		}

		model.addAttribute("muni", muni);
		return "buildBackend/edit/editBuild";
	}

	// 顯示編輯room頁面 #後台點擊編輯房間按鈕
	@GetMapping(value = "/room/edit")
	public String editRoom(@RequestParam(value = "id") int id, //
			Model model, HttpSession session) {
		Room room = buildService.getRoomInfo(id).getRoom();
		model.addAttribute("roomInfo", room);

		// 設定build_id
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

		// 顯示後端列表
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// 判斷是否顯示roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}

	@PostMapping(value = "/room/update")
	public String updateRoom(@ModelAttribute Room room, //
			Model model, HttpSession session) {
		// 取得session內的build_id,room_id
		int buildId = (int) session.getAttribute("buildId");
		room.setBuildId(buildId);
		int roomId = (int) session.getAttribute("roomId");
		room.setRoomId(roomId);

		buildService.save(room);

		// 顯示後端列表
		List<BuildAndRoom> data = buildService.getAllBuildRoomInfo().getBuildAndRoom();
		model.addAttribute("data", data);
		// 判斷是否顯示roomList
		model.addAttribute("isShow", true);

		return "buildBackend/buildBackendList";
	}
}
