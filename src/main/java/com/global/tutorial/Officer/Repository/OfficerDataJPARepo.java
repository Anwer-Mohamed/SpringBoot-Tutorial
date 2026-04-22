package com.global.tutorial.Officer.Repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.global.tutorial.Officer.Model.Officer;

@Repository
public interface OfficerDataJPARepo extends JpaRepository<Officer, Long>{
	

	 @Query(value = "SELECT * FROM officer",
		       		countQuery = "SELECT COUNT(*) FROM officer",
		       		nativeQuery = true
		    )
	 public Page<Officer> home(Pageable pageable);
	 
	 
	 @Query(value = "SELECT off_salary FROM officer where officer_id =:id",nativeQuery = true)
	 public Optional<?> getSalaryById( @Param("id")Long id);
	
}
