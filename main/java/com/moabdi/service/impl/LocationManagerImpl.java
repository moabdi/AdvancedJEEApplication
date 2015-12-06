package com.moabdi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moabdi.dao.LocationDAO;
import com.moabdi.dto.LocationDTO;
import com.moabdi.entities.Location;
import com.moabdi.mappers.LocationMapper;

@Service
public class LocationManagerImpl implements com.moabdi.service.LocationManager {

	@Autowired
	LocationDAO dao;

	@Autowired
	LocationMapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.LocationManager#findAll()
	 */
	@Override
	public List<LocationDTO> findAll() {
		List<LocationDTO> list = new ArrayList<>();
		for (Location location : dao.findAll()) {
			list.add(mapper.locationToLocationDTO(location));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.LocationManager#findById(long)
	 */
	@Override
	public LocationDTO findById(long id) {
		return mapper.locationToLocationDTO(dao.findById(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.LocationManager#findByCriteria(com.moabdi.dto.
	 * LocationDTO)
	 */
	@Override
	public List<LocationDTO> findByCriteria(LocationDTO locat) {
		List<LocationDTO> list = new ArrayList<>();
		for (Location location : dao.findByCriteria(mapper.locationDTOToLocation(locat))) {
			list.add(mapper.locationToLocationDTO(location));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.LocationManager#save(com.moabdi.dto.LocationDTO)
	 */
	@Override
	public void save(LocationDTO locat) {
		dao.save(mapper.locationDTOToLocation(locat));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.moabdi.service.LocationManager#update(com.moabdi.dto.LocationDTO)
	 */
	@Override
	public void update(LocationDTO locat) {
		dao.update(mapper.locationDTOToLocation(locat));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.LocationManager#saveOrUpdate(com.moabdi.dto.
	 * LocationDTO)
	 */
	@Override
	public void saveOrUpdate(LocationDTO locat) {
		dao.saveOrUpdate(mapper.locationDTOToLocation(locat));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.moabdi.service.LocationManager#delete(com.moabdi.dto.LocationDTO)
	 */
	@Override
	public void delete(LocationDTO locat) {
		dao.delete(mapper.locationDTOToLocation(locat));
	}

}
