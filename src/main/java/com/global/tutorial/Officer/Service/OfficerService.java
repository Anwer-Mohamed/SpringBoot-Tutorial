package com.global.tutorial.Officer.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.tutorial.Officer.Model.Officer;
import com.global.tutorial.Officer.Repository.OfficerDataJPARepo;

@Service
public class OfficerService {

	@Autowired
	private OfficerDataJPARepo dataJPARepo;
	//private OfficerDataJDBCRepo officerDataJDBCRepo;
	
	
	public Optional<Officer> getByid(Long id) {
		return  dataJPARepo.findById(id);
	}
	
	public Officer insert(Officer officer) {
		return  dataJPARepo.save(officer);
	}
	
	public Officer update(Officer officer) {
		return  dataJPARepo.save(officer);
	}
	
	public void deleteById( Long  id) {
		dataJPARepo.deleteById(id);
	}
	
	public Iterable<Officer> findAll() {
		  return dataJPARepo.findAll();
	}
	
	
	
	

}
