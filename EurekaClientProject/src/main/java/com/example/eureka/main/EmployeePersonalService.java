package com.example.eureka.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeePersonalService {
@Autowired
private empRepo emp;

public Optional<EmployeePersonalInfo> getempdetails(Long id) {
	// TODO Auto-generated method stub
	return emp.findById(id);
}

public List<EmployeePersonalInfo> getempAlldetails() {
	// TODO Auto-generated method stub
	List<EmployeePersonalInfo> empList = new ArrayList<EmployeePersonalInfo>();
	Iterable<EmployeePersonalInfo> itr = emp.findAll();
	itr.forEach(e->empList.add(e));
	return empList;
}

public void addempDetails(EmployeePersonalInfo emp2) {
		emp.save(emp2);
}
	
}
