package com.moabdi.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Mostapha
 *
 */
 @Entity
 @Table(name = "countries")
public class Country implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String countryId;
	private Region regions;
	private String countryName;
//	private Set locationses = new HashSet(0);

	public Country() {
	}

	public Country(String countryId, Region regions) {
		this.countryId = countryId;
		this.regions = regions;
	}

	public Country(String countryId, Region regions, String countryName, Set locationses) {
		this.countryId = countryId;
		this.regions = regions;
		this.countryName = countryName;
//		this.locationses = locationses;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Region getRegions() {
		return this.regions;
	}

	public void setRegions(Region regions) {
		this.regions = regions;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

//	public Set getLocationses() {
//		return this.locationses;
//	}
//
//	public void setLocationses(Set locationses) {
//		this.locationses = locationses;
//	}

}
