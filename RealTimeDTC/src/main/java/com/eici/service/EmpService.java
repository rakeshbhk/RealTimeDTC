package com.eici.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eici.dto.Emp;
import com.eici.repository.EmpRepository;  


@Service  
public class EmpService {

	@Autowired  
	EmpRepository empRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Emp> getAllEmp()   
	{  
	List<Emp> emp = new ArrayList<Emp>();  
	empRepository.findAll().forEach(emp1 -> emp.add(emp1));  
	return emp;  
}
}
