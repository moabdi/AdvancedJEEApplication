package com.moabdi.mappers;

import org.mapstruct.Mapper;

import com.moabdi.dto.LocationDTO;
import com.moabdi.entities.Location;

@Mapper
public interface LocationMapper {

	/**
	 * Convert Location to LocationDTO bean
	 * 
	 * @param location
	 * @return LocationDTO
	 */
	public LocationDTO locationToLocationDTO(Location location);

	/**
	 * Convert LocationDTO to Location bean
	 * 
	 * @param location
	 * @return Location
	 */
	public Location locationDTOToLocation(LocationDTO location);

}