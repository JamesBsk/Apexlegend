package com.example.demo.ApexService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ApexAgents.ApexClass;
import com.example.demo.ApexRepository.RespoApex;

@Service
public class ServiceApex {
	@Autowired
	RespoApex repository;  
	
	public String addApex(ApexClass apex)
	{
		repository.save(apex);
		return "Added";
	}
	public List<ApexClass> getApex()
	{
		return repository.findAll();
	}
	public Optional<ApexClass> getApexById(int id)
	{
		return repository.findById(id);
	}
	

}
