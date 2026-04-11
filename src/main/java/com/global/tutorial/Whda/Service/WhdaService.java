package com.global.tutorial.Whda.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.tutorial.Officer.Model.Officer;
import com.global.tutorial.Whda.Model.Whda;
import com.global.tutorial.Whda.Repository.WhdaJpaRepo;

@Service
public class WhdaService {

	@Autowired
	private WhdaJpaRepo whdaJpaRepo;
	//private WhdaDataJDBCRepo WhdaDataJDBCRepo;
	
	
	public Optional<Whda> getByid(Long id) {
		return  whdaJpaRepo.findById(id);
	}
	
	public Whda insert(Whda whda) {
		return  whdaJpaRepo.save(whda);
	}
	
	public Whda update(Whda whda) {
		return  whdaJpaRepo.save(whda);
	}
	
	public void deleteById( Long id ) {
		whdaJpaRepo.deleteById(id);
	}
	
	public Iterable<Whda> findAll() {
		  return whdaJpaRepo.findAll();
	}
	
	public Long getWhdaIdByname(String name) {
		return whdaJpaRepo.getWhdaIdByname(name);
	}
	public List<Officer> getOfficerOfWhda(String name){
		Long whdaId = getWhdaIdByname(name);
		return whdaJpaRepo.getOfficerOfWhda(whdaId);
	}

}
