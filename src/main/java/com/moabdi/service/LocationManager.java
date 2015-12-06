package com.moabdi.service;

import java.util.List;

import com.moabdi.dto.LocationDTO;

/**
 * LocationManager
 * 
 * @author moabdi
 *
 */
public interface LocationManager {

	/**
	 * find LocationDTO all
	 * 
	 * @return
	 */
	public List<LocationDTO> findAll();

	/**
	 * find LocationDTO by id
	 * 
	 * @param id
	 * @return
	 */
	public LocationDTO findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<LocationDTO>
	 */
	public List<LocationDTO> findByCriteria(LocationDTO locat);

	/**
	 * save LocationDTO
	 * 
	 * @param locat
	 */
	public void save(LocationDTO locat);

	/**
	 * update LocationDTO
	 * 
	 * @param locat
	 */
	public void update(LocationDTO locat);

	/**
	 * save or update LocationDTO
	 * 
	 * @param locat
	 */
	public void saveOrUpdate(LocationDTO locat);

	/**
	 * delete LocationDTO
	 * 
	 * @param locat
	 */
	public void delete(LocationDTO locat);

}