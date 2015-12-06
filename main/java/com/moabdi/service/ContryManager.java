package com.moabdi.service;

import java.util.List;

import com.moabdi.dto.CountryDTO;

/**
 * ContrieManager
 * 
 * @author moabdi
 *
 */
public interface ContryManager {

	/**
	 * Get all countries
	 * 
	 * @return
	 */
	public List<CountryDTO> findAll();

	/**
	 * Get country by ID
	 * 
	 * @param id
	 * @return CountryDTO
	 */
	public CountryDTO findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<CountryDTO>
	 */
	public List<CountryDTO> findByCriteria(CountryDTO country);

	/**
	 * Save country entity
	 * 
	 * @param country
	 */
	public void save(CountryDTO country);

	/**
	 * update country
	 * 
	 * @param country
	 */
	public void update(CountryDTO country);

	/**
	 * update country
	 * 
	 * @param country
	 */
	public void saveOrUpdate(CountryDTO country);

	/**
	 * delete country
	 * 
	 * @param country
	 */
	public void delete(CountryDTO country);

}