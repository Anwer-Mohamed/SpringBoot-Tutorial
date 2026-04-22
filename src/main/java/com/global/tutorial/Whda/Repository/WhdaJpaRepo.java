package com.global.tutorial.Whda.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.global.tutorial.Officer.Model.Officer;
import com.global.tutorial.Whda.Model.Whda;

@Repository
public interface WhdaJpaRepo extends JpaRepository<Whda,Long> {
	
	@Query(value = "select * from officer where whda_id = :id " 
			, nativeQuery = true)
	public List<Officer> getOfficerOfWhda(@Param("id") Long id);
	
	
	@Query(value = "select whda_id from whda where name = :name" , nativeQuery = true)
	public Long getWhdaIdByname(@Param("name") String name);
	
}
