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
@Table(name = "regions")
public class Region implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int regionId;
	private String regionName;
	private Set countrieses = new HashSet(0);

	public Region() {
	}

	public Region(int regionId) {
		this.regionId = regionId;
	}

	public Region(int regionId, String regionName, Set countrieses) {
		this.regionId = regionId;
		this.regionName = regionName;
		this.countrieses = countrieses;
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

	public Set getCountrieses() {
		return this.countrieses;
	}

	public void setCountrieses(Set countrieses) {
		this.countrieses = countrieses;
	}

}
