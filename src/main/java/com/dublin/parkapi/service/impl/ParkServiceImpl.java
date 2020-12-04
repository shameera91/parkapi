package com.dublin.parkapi.service.impl;

import com.dublin.parkapi.model.DublinCityPlayArea;
import com.dublin.parkapi.model.DunLaoghaire;
import com.dublin.parkapi.model.FingalCountryPlayArea;
import com.dublin.parkapi.repository.DublinCityPlayAreaRepository;
import com.dublin.parkapi.repository.DunLaoghaireRepository;
import com.dublin.parkapi.repository.FingalCountryPlayAreaRepository;
import com.dublin.parkapi.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkServiceImpl implements ParkService {

	@Autowired
	private DublinCityPlayAreaRepository dublinCityPlayAreaRepository;

	@Autowired
	private FingalCountryPlayAreaRepository fingalCountryPlayAreaRepository;

	@Autowired
	private DunLaoghaireRepository dunLaoghaireRepository;

	@Override
	public List<DublinCityPlayArea> getDublinCityParkDetails() {
		return dublinCityPlayAreaRepository.findAll();
	}

	@Override
	public List<FingalCountryPlayArea> getFingalCountryCouncilData() {
		return fingalCountryPlayAreaRepository.findAll();
	}

	@Override
	public List<DunLaoghaire> getDunLaoghaireData() {
		return dunLaoghaireRepository.findAll();
	}
}
