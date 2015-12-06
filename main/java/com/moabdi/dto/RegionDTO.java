package com.moabdi.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Mostapha
 *
 */
public class RegionDTO implements java.io.Serializable {

	private int regionId;
	private String regionName;
	private Set countrieses = new HashSet(0);

	public RegionDTO() {
	}

	/**
	 * @return the regionId
	 */
	public int getRegionId() {
		return regionId;
	}

	/**
	 * @param regionId
	 *            the regionId to set
	 */
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	/**
	 * @return the regionName
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * @param regionName
	 *            the regionName to set
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	/**
	 * @return the countrieses
	 */
	public Set getCountrieses() {
		return countrieses;
	}

	/**
	 * @param countrieses
	 *            the countrieses to set
	 */
	public void setCountrieses(Set countrieses) {
		this.countrieses = countrieses;
	}

}
