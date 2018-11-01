package com.assignment.rnd.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;

/**
 * This class is the service class, which is used to fetch the country name based on ipAddress.
 * 
 * @author ashish.gupta
 */
@Service
public class GeoIpService {

	public String getCountry(String ipAddress) throws FileNotFoundException, IOException {
		return LoadDataService.getService().getCountry(ipAddress).getName();
	}
}
