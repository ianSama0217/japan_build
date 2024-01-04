package com.reinext.rental;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.reinext.rental.service.ifs.StationService;

@SpringBootTest
public class StationServiceTest {

	@Autowired
	private StationService service;

	@Test
	public void searchLineByPrefTest() {
		List<String> res = service.searchLineByPref("山形県").getStationInfos();
		for (String s : res) {
			System.out.println("路線名稱: " + s);
		}
	}

	@Test
	public void searchStationByLineTest() {
		List<String> req = new ArrayList<String>();
		req.add("東急大井町線");
		req.add("小田急線");
		req.add("東急大井町線");
		List<String> res = service.searchStationByLine(req).getStationInfos();
		for (String s : res) {
			System.out.println("路線名稱: " + s);
		}
	}

	@Test
	public void searchLineByAddressTest() {
		List<String> res = service.searchLineByAddress("由仁町").getStationInfos();
		for (String s : res) {
			System.out.println("路線名稱: " + s);
		}
	}

}
