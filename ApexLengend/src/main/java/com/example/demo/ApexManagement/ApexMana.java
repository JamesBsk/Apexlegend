package com.example.demo.ApexManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ApexAgents.ApexClass;
import com.example.demo.ApexService.ServiceApex;

@RestController
@RequestMapping("/abc")
public class ApexMana {
			@Autowired
			ServiceApex apx;
			
			@PostMapping("")
			public String create(@RequestBody ApexClass apex)
			{
				return apx.addApex(apex);
			}
			@GetMapping("")
					
			public List<ApexClass> read()
			{
				return apx.getApex();
			}
			@GetMapping("/{id}")
			public Optional<ApexClass>readById(@PathVariable int id)
			{
				return apx.getApexById(id);
			}
			{
				
			}
}
