package com.moabdi.mappers;

import org.mapstruct.Mapper;

import com.moabdi.dto.JobDTO;
import com.moabdi.entities.Job;

@Mapper
public interface JobMapper {

	/**
	 * Convert Job to JobDTO bean
	 * 
	 * @param job
	 * @return JobDTO
	 */
	public JobDTO jobToJobDTO(Job job);

	/**
	 * Convert JobDTO to Job bean
	 * 
	 * @param job
	 * @return Job
	 */
	public Job jobDTOToJob(JobDTO job);

}