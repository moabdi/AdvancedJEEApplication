package com.moabdi.dao;

import java.util.List;

import com.moabdi.entities.Location;

/**
 * LocationDAO
 * 
 * @author moabdi
 *
 */
public interface LocationDAO {

	/**
	 * find Location all
	 * 
	 * @return
	 */
	public List<Location> findAll();

	/**
	 * find Location by id
	 * 
	 * @param id
	 * @return
	 */
	public Location findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<Location>
	 */
	public List<Location> findByCriteria(Location locat);

	/**
	 * save Location
	 * 
	 * @param locat
	 */
	public void save(Location locat);

	/**
	 * update Location
	 * 
	 * @param locat
	 */
	public void update(Location locat);

	/**
	 * save or update Location
	 * 
	 * @param locat
	 */
	public void saveOrUpdate(Location locat);

	/**
	 * delete Location
	 * 
	 * @param locat
	 */
	public void delete(Location locat);

}