package com.dublin.parkapi.service;

import com.dublin.parkapi.model.DublinCityPlayArea;
import com.dublin.parkapi.model.DunLaoghaire;
import com.dublin.parkapi.model.FingalCountryPlayArea;

import java.util.List;

public interface ParkService {

	List<DublinCityPlayArea> getDublinCityParkDetails();

	List<FingalCountryPlayArea> getFingalCountryCouncilData();

	List<DunLaoghaire> getDunLaoghaireData();
}
