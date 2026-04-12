package com.global.tutorial.Officer.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	
	public Page<Officer> home(int page, int size, String sortBy , Boolean isAsc) {
		Sort sort = (isAsc ? Sort.by(sortBy).ascending(): Sort.by(sortBy).descending());
		Pageable pageable = PageRequest.of(page,size,sort);
		return dataJPARepo.home(pageable);
	}
	
	
	
	

}
