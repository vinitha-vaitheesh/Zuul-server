package com.example.eureka.main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface empRepo extends JpaRepository<EmployeePersonalInfo, Long> {
  
}
