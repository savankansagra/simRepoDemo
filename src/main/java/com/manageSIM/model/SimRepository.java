package com.manageSIM.model;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SimRepository extends JpaRepository<Sim, Long> {
	
	@Query(value="select * from SIM where EXPIRY_DATE <= CURRENT_TIMESTAMP + 30",nativeQuery = true)
	List<Sim> getSimByLast();
	
}
