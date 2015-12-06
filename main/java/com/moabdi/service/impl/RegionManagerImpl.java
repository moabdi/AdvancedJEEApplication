package com.moabdi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moabdi.dao.RegionDAO;
import com.moabdi.dto.RegionDTO;
import com.moabdi.entities.Region;
import com.moabdi.mappers.RegionMapper;

@Service
public class RegionManagerImpl implements com.moabdi.service.RegionManager {

	@Autowired
	RegionDAO dao;

	@Autowired
	RegionMapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.RegionManager#findAll()
	 */
	@Override
	public List<RegionDTO> findAll() {
		List<RegionDTO> list = new ArrayList<RegionDTO>();
		for (Region region : dao.findAll()) {
			list.add(mapper.regionToRegionDTO(region));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.RegionManager#findById(long)
	 */
	@Override
	public RegionDTO findById(long id) {
		return mapper.regionToRegionDTO(dao.findById(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.moabdi.service.RegionManager#findByCriteria(com.moabdi.dto.RegionDTO)
	 */
	@Override
	public List<RegionDTO> findByCriteria(RegionDTO reg) {
		List<RegionDTO> list = new ArrayList<RegionDTO>();
		for (Region region : dao.findByCriteria(mapper.regionDTOToRegion(reg))) {
			list.add(mapper.regionToRegionDTO(region));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.RegionManager#save(com.moabdi.dto.RegionDTO)
	 */
	@Override
	public void save(RegionDTO reg) {
		dao.save(mapper.regionDTOToRegion(reg));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.RegionManager#update(com.moabdi.dto.RegionDTO)
	 */
	@Override
	public void update(RegionDTO reg) {
		dao.save(mapper.regionDTOToRegion(reg));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.moabdi.service.RegionManager#saveOrUpdate(com.moabdi.dto.RegionDTO)
	 */
	@Override
	public void saveOrUpdate(RegionDTO reg) {
		dao.save(mapper.regionDTOToRegion(reg));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.RegionManager#delete(com.moabdi.dto.RegionDTO)
	 */
	@Override
	public void delete(RegionDTO reg) {
		dao.save(mapper.regionDTOToRegion(reg));

	}

}
