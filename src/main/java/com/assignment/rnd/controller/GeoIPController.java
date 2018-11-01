package com.assignment.rnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.rnd.service.GeoIpService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/geoapp", produces = { MediaType.TEXT_PLAIN_VALUE })
@Slf4j
public class GeoIPController {

	@Autowired
	GeoIpService goAppService;

	/**
	 * @param ipAddress
	 *                  as {@link String}
	 * @return countryName as {@link String}
	 * @throws Exception
	 */
	@GetMapping(path = "/getcountry")
	public ResponseEntity<String> getCountry(@RequestParam(name = "ipAddress") String ipAddress) throws Exception {
		log.info("inside getCountry: {}");
		if (StringUtils.isEmpty(ipAddress)) {
			return new ResponseEntity<String>("ipAddress is required ", HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(goAppService.getCountry(ipAddress), HttpStatus.CREATED);
	}
}
