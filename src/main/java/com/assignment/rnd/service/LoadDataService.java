package com.assignment.rnd.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.util.ResourceUtils;

import com.maxmind.geoip.LookupService;

/**
 * This class is to load the data once.
 * 
 * @author ashish.gupta
 */
public class LoadDataService {

	private static final String FILE_NAME = "classpath:GeoIP.dat";
	private static LookupService instance;

	private LoadDataService() {}

	/**
	 * This method is used to load the data using lookup service.
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @return instance as {@link LookupService}
	 */
	public static synchronized LookupService getService() throws FileNotFoundException, IOException {
		if (instance == null) {
			instance = new LookupService(ResourceUtils.getFile(FILE_NAME));
		}
		return instance;
	}
}
