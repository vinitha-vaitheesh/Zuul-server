package com.example.eureka.main;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {
	@Autowired
	private EmployeePersonalService empservice;
	
	@RequestMapping(value="/EmployeePersonalInfo/getDetails/{id}",method=RequestMethod.GET)
	public Optional<EmployeePersonalInfo> getempDetails(@PathVariable("id") String paramid) {
		Long id=Long.parseLong(paramid);
	 return	empservice.getempdetails(id);
		
	}
	
	@RequestMapping(value="/EmployeePersonalInfo/getALLDetails",method=RequestMethod.GET)
	public List<EmployeePersonalInfo> getempALLDetails() {
		
	 return	empservice.getempAlldetails();
		
	}
	@RequestMapping(value="/EmployeePersonalInfo/AddDetails",method=RequestMethod.POST)
	public String addempDetails(@RequestBody EmployeePersonalInfo emp) {
		empservice.addempDetails(emp);
		return "added Successfully";
	}
	

}
