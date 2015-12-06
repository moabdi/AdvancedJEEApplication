package com.moabdi.mappers;

import org.mapstruct.Mapper;

import com.moabdi.dto.RegionDTO;
import com.moabdi.entities.Region;

@Mapper
public interface RegionMapper {

	/**
	 * Convert Region to RegionDTO bean
	 * 
	 * @param region
	 * @return RegionDTO
	 */
	public RegionDTO regionToRegionDTO(Region region);

	/**
	 * Convert RegionDTO to Region bean
	 * 
	 * @param region
	 * @return Region
	 */
	public Region regionDTOToRegion(RegionDTO region);

}