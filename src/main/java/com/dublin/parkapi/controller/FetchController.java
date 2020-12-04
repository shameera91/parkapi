package com.dublin.parkapi.controller;

import com.dublin.parkapi.service.FetchParkDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fetch")
public class FetchController {

	@Autowired
	private FetchParkDataService fetchParkDataService;

	@GetMapping("/fingal-country-council")
	public ResponseEntity getFingalCountryCouncilData(){
		fetchParkDataService.getFingalCountryCouncilData();
		return ResponseEntity.ok().build();
	}

	@GetMapping("/dublin-city")
	public ResponseEntity<Void> getDublinCityData(){
		fetchParkDataService.getDublinCityData();
		return ResponseEntity.ok().build();
	}

	@GetMapping("/dun-laoghaire")
	public ResponseEntity<Void> getDunLaoghaireData(){
		fetchParkDataService.getDunLaoghaireData();
		return ResponseEntity.ok().build();
	}
}
