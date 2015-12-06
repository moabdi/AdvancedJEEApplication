package com.moabdi.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Mostapha
 *
 */
@Entity
@Table(name = "regions")
public class Region implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int regionId;
	
	private String regionName;
	
	@OneToMany(targetEntity=Country.class, mappedBy="countryId")
	private Set countries = new HashSet(0);

	public Region() {
	}

	public Region(int regionId) {
		this.regionId = regionId;
	}

	public Region(int regionId, String regionName, Set countrieses) {
		this.regionId = regionId;
		this.regionName = regionName;
		this.countries = countrieses;
	}

	public int getRegionId() {
		return this.regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Set getCountries() {
		return this.countries;
	}

	public void setCountries(Set countries) {
		this.countries = countries;
	}

}
