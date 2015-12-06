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
@Table(name = "locations")
public class Location implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="location_id")
	private Integer locationId;
	
    @ManyToOne
    @JoinColumn(name="country_id", nullable=false)
	private Country countries;
	
	@Column(name="street_address")
	private String streetAddress;
	
	@Column(name="postal_code")
	private String postalCode;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state_province")
	private String stateProvince;
	
	@OneToMany(targetEntity=Department.class, mappedBy="departmentId")
	private Set departments = new HashSet(0);

	public Location() {
	}

	public Location(Country countries, String city) {
		this.countries = countries;
		this.city = city;
	}

	public Location(Country countries, String streetAddress, String postalCode, String city, String stateProvince,
			Set departmentses) {
		this.countries = countries;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.departments = departmentses;
	}

	public Integer getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Country getCountries() {
		return this.countries;
	}

	public void setCountries(Country countries) {
		this.countries = countries;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return this.stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public Set getDepartments() {
		return this.departments;
	}

	public void setDepartments(Set departmentses) {
		this.departments = departmentses;
	}

}
