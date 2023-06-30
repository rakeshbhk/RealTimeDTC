package com.eici.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eici.dto.Emp;
import com.eici.service.EmpService;  

@RestController
@RequestMapping("/resource")
public class EmpController {

	/*
	 * @RequestMapping(method = RequestMethod.GET) String readResource() { return
	 * "Hello World!!"; }
	 */
	
	@Autowired  
	EmpService empService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/emp")
	private List<Emp> getAllEmp()   
	{  
	return empService.getAllEmp();  
	}  
}
