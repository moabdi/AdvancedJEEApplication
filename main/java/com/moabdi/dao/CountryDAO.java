package com.moabdi.dao;

import java.util.List;

import com.moabdi.entities.Country;

/**
 * CountrieDAO
 * 
 * @author moabdi
 *
 */
public interface CountryDAO {

	/**
	 * Get all countries
	 * 
	 * @return
	 */
	public List<Country> findAll();

	/**
	 * Get country by ID
	 * 
	 * @param id
	 * @return Country
	 */
	public Country findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<Country>
	 */
	public List<Country> findByCriteria(Country country);

	/**
	 * Save country entity
	 * 
	 * @param country
	 */
	public void save(Country country);

	/**
	 * update country
	 * 
	 * @param country
	 */
	public void update(Country country);

	/**
	 * update country
	 * 
	 * @param country
	 */
	public void saveOrUpdate(Country country);

	/**
	 * delete country
	 * 
	 * @param country
	 */
	public void delete(Country country);

}