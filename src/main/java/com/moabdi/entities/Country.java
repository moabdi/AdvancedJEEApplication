package com.moabdi.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Column(name="country_id")
	private String countryId;
	
	@ManyToOne
	@JoinColumn(name = "region_id", nullable = false)
	private Region region;
	
	@Column(name="country_name")
	private String countryName;
	
	@OneToMany(targetEntity=Location.class, mappedBy="locationId")
	private Set locations = new HashSet(0);

	/**
	 * 
	 */
	public Country() {
	}

	/**
	 * 
	 * @param countryId
	 * @param regions
	 */
	public Country(String countryId, Region regions) {
		this.countryId = countryId;
		this.region = regions;
	}

	/**
	 * 
	 * @param countryId
	 * @param regions
	 * @param countryName
	 * @param locations
	 */
	public Country(String countryId, Region regions, String countryName, Set locations) {
		this.countryId = countryId;
		this.region = regions;
		this.countryName = countryName;
		this.locations = locations;
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
	 * @return the regions
	 */
	public Region getRegions() {
		return region;
	}

	/**
	 * @param regions the regions to set
	 */
	public void setRegions(Region regions) {
		this.region = regions;
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
	public Set getLocations() {
		return locations;
	}

	/**
	 * @param locationses the locationses to set
	 */
	public void setLocations(Set locations) {
		this.locations = locations;
	}


}
