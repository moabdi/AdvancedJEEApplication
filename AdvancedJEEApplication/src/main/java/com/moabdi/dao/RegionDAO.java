package com.moabdi.dao;

import java.util.List;

import com.moabdi.entities.Region;

/**
 * RegionDAO
 * 
 * @author moabdi
 *
 */
public interface RegionDAO {

	/**
	 * find Region all
	 * 
	 * @return
	 */
	public List<Region> findAll();

	/**
	 * find Region by id
	 * 
	 * @param id
	 * @return
	 */
	public Region findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<Region>
	 */
	public List<Region> findByCriteria(Region reg);

	/**
	 * save Region
	 * 
	 * @param reg
	 */
	public void save(Region reg);

	/**
	 * update Region
	 * 
	 * @param reg
	 */
	public void update(Region reg);

	/**
	 * save or update Region
	 * 
	 * @param reg
	 */
	public void saveOrUpdate(Region reg);

	/**
	 * delete Region
	 * 
	 * @param reg
	 */
	public void delete(Region reg);

}