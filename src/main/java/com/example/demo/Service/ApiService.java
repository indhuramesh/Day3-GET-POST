package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service

public class ApiService {
	
	@Autowired
	EmployeeRepo empRepo;
	public Employee saveDetails(Employee e)
	{
		return empRepo.save(e);
	}
	public List<Employee> getDetails()
	{
		return empRepo.findAll();
	}

}
