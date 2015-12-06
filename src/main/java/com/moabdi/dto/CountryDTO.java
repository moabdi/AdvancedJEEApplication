package com.moabdi.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Mostapha
 *
 */
public class CountryDTO implements java.io.Serializable {

	private String countryId;
	private String countryName;
	private Set locationses = new HashSet(0);

	public CountryDTO() {
	}

	/**
	 * @return the countryId
	 */
	public String getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the locationses
	 */
	public Set getLocationses() {
		return locationses;
	}

	/**
	 * @param locationses the locationses to set
	 */
	public void setLocationses(Set locationses) {
		this.locationses = locationses;
	}

}
