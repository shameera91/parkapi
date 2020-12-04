package com.dublin.parkapi.controller;

import com.dublin.parkapi.model.DublinCityPlayArea;
import com.dublin.parkapi.model.DunLaoghaire;
import com.dublin.parkapi.model.FingalCountryPlayArea;
import com.dublin.parkapi.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parks")
public class ParkController {
	@Autowired
	private ParkService parkService;

	@GetMapping("/get-dublin-city-council")
	public ResponseEntity<List<DublinCityPlayArea>> getDublinCityCouncilData(){
		return ResponseEntity.ok(parkService.getDublinCityParkDetails());
	}

	@GetMapping("/get-fingal-country-council")
	public ResponseEntity<List<FingalCountryPlayArea>> getFingalCountryCouncilData(){
		return ResponseEntity.ok(parkService.getFingalCountryCouncilData());
	}

	@GetMapping("/get-dun-laoghaire")
	public ResponseEntity<List<DunLaoghaire>> getDunLaoghaireData(){
		return ResponseEntity.ok(parkService.getDunLaoghaireData());
	}


}
