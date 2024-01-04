package com.reinext.rental;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.reinext.rental.repository.RegionDao;
import com.reinext.rental.service.ifs.RegionService;
import com.reinext.rental.vo.RegionRes;

@SpringBootTest
public class RegionServiceTest {
	@Autowired
	private RegionService service;

	@Autowired
	private RegionDao regionDao;

	@Test
	public void searchAllPref() {
		List<String> res = regionDao.findAllByPref();
		for (String r : res) {
			System.out.println("���D����: " + r);
		}
	}

	@Test
	public void searchFromPrefTest() {
		RegionRes res = service.searchMuniFromPref("�_���D");
		for (String r : res.getRegionInfo()) {
			System.out.println("���m��: " + r);
		}
	}
}
