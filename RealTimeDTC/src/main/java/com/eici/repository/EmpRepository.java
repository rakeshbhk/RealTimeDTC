package com.eici.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eici.dto.Emp;

public interface EmpRepository extends CrudRepository<Emp, Integer>  {
	
	List<Emp> findAll();

}
