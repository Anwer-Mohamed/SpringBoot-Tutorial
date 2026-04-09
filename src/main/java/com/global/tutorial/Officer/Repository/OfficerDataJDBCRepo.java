package com.global.tutorial.Officer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.global.tutorial.Officer.Model.Officer;

@Repository
public interface OfficerDataJDBCRepo extends CrudRepository<Officer, Long> {
	

}
