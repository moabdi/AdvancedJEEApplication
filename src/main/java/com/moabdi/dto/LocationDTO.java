package com.moabdi.dto;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author Mostapha
 *
 */
public class LocationDTO implements java.io.Serializable {

	private Integer locationId;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private Set departmentses = new HashSet(0);

	public LocationDTO() {
	}

	public Integer getLocationId() {
		return this.locationId;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress
	 *            the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the stateProvince
	 */
	public String getStateProvince() {
		return stateProvince;
	}

	/**
	 * @param stateProvince
	 *            the stateProvince to set
	 */
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	/**
	 * @return the departmentses
	 */
	public Set getDepartmentses() {
		return departmentses;
	}

	/**
	 * @param departmentses
	 *            the departmentses to set
	 */
	public void setDepartmentses(Set departmentses) {
		this.departmentses = departmentses;
	}

	/**
	 * @param locationId
	 *            the locationId to set
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

}
