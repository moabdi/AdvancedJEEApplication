package com.moabdi.service;

import java.util.List;

import com.moabdi.dto.RegionDTO;

/**
 * RegionManager
 * 
 * @author moabdi
 *
 */
public interface RegionManager {

	/**
	 * find RegionDTO all
	 * 
	 * @return
	 */
	public List<RegionDTO> findAll();

	/**
	 * find RegionDTO by id
	 * 
	 * @param id
	 * @return
	 */
	public RegionDTO findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<RegionDTO>
	 */
	public List<RegionDTO> findByCriteria(RegionDTO reg);

	/**
	 * save RegionDTO
	 * 
	 * @param reg
	 */
	public void save(RegionDTO reg);

	/**
	 * update RegionDTO
	 * 
	 * @param reg
	 */
	public void update(RegionDTO reg);

	/**
	 * save or update RegionDTO
	 * 
	 * @param reg
	 */
	public void saveOrUpdate(RegionDTO reg);

	/**
	 * delete RegionDTO
	 * 
	 * @param reg
	 */
	public void delete(RegionDTO reg);

}