package com.moabdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moabdi.dto.EmployeeDTO;
import com.moabdi.service.EmployeeManager;

/**
 * 
 * @author moabdi
 *
 */
@RequestMapping("/employees")

@Controller
public class EmployeeController {
	@Autowired
	EmployeeManager empManager;
	
	@RequestMapping("/getAllEmployees")
	public @ResponseBody String  getAllEmployees(){
		
		return "Hello ";
	}
	
	@RequestMapping("/getEmployeeByEmail")
	public @ResponseBody String  getEmployeeById(@RequestParam("petId") String id){
		return id;
	} 
	
	@RequestMapping("/getEmployee/{email}")
	public @ResponseBody EmployeeDTO  getEmployee(@PathVariable String email){
		return  empManager.findByEmail(email);

	} 
	
	
}
