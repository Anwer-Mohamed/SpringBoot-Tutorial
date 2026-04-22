package com.global.tutorial.Officer.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.global.tutorial.Officer.Model.Officer;
import com.global.tutorial.Officer.Service.OfficerService;

@RestController
@RequestMapping("/officer")
public class OfficerController {

	@Autowired
	private OfficerService officerService ;
	
	@GetMapping("/id/{id}")
	Optional<Officer> getByid(@PathVariable Long id){
		return officerService.getByid(id);
	}
	
	@PostMapping("/insert")
	public Officer insert(@RequestBody Officer officer) {
		return  officerService.insert(officer);
	}
	@PutMapping("/update")
	public Officer update(@RequestBody Officer officer) {
		return  officerService.update(officer);
	}
	
	@DeleteMapping("/delete")
	public void deleteById(@RequestParam Long id) {
		officerService.deleteById(id);
	}
	@GetMapping("/all")
	public Iterable<Officer> findAll() {
		  return officerService.findAll();
	}
	
	@GetMapping("/home")
	public Page<Officer> home(@RequestParam int page,
								  @RequestParam int size,
								  @RequestParam String sortedBy,
								  @RequestParam Boolean isAsc){
		
		  return officerService.home(page,size,sortedBy,isAsc);
	}
	
	@GetMapping("/salary/{id}")
	public Optional<?> getSalaryById(@PathVariable Long id) {
		return officerService.getSalaryById(id);
	}
	
	
	
}
