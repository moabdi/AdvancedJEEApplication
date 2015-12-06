package com.moabdi.controller;

import java.util.List;

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
	
	@RequestMapping("")
	public @ResponseBody String  getIndexEmployees(){
		return "Manage employees ";
	}
	
	@RequestMapping("/getAllEmployees")
	public @ResponseBody List<EmployeeDTO>  getAllEmployees(){
		return empManager.findAll();
	}
	
	@RequestMapping("/getEmployeeById")
	public @ResponseBody EmployeeDTO  getEmployeeById(@RequestParam("id") long id){
		return empManager.findById(id); 
	} 
	
	@RequestMapping("/getEmployee/{email}")
	public @ResponseBody EmployeeDTO  getEmployee(@PathVariable String email){
		return  empManager.findByEmail(email);

	} 
	
	
}
