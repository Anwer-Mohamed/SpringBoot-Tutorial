package com.global.tutorial.Officer.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.tutorial.Officer.Model.Officer;
import com.global.tutorial.Officer.Repository.OfficerDataJDBCRepo;

@Service
public class OfficerService {

	@Autowired
	private OfficerDataJDBCRepo officerDataJDBCRepo;
	
	
	public Optional<Officer> getByid(Long id) {
		return  officerDataJDBCRepo.findById(id);
	}
	
	public Officer insert(Officer officer) {
		return  officerDataJDBCRepo.save(officer);
	}
	
	public Officer update(Officer officer) {
		return  officerDataJDBCRepo.save(officer);
	}
	
	public void delete( Officer officer) {
		  officerDataJDBCRepo.delete(officer);
	}
	
	public Iterable<Officer> findAll() {
		  return officerDataJDBCRepo.findAll();
	}
	
	
	
	

}
