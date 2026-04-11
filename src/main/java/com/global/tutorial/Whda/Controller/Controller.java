package com.global.tutorial.Whda.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.global.tutorial.Whda.Model.Whda;
import com.global.tutorial.Whda.Service.WhdaService;


@RestController
@RequestMapping("/whda")
public class Controller {

	@Autowired
	private WhdaService whdaService ;
	
	@GetMapping("/id/{id}")
	Optional<Whda> getByid(@PathVariable Long id){
		return whdaService.getByid(id);
	}
	
	@PostMapping("/insert")
	public Whda insert(@RequestBody Whda whda) {
		return  whdaService.insert(whda);
	}
	@PutMapping("/update")
	public Whda update(@RequestBody Whda whda) {
		return  whdaService.update(whda);
	}
	
	@DeleteMapping("/delete")
	public void deleteById(@RequestParam Long id) {
		whdaService.deleteById(id);
	}
	@GetMapping("/all")
	public Iterable<Whda> findAll() {
		  return whdaService.findAll();
	}
	
	@GetMapping("/name/officer")
	public List<Officer> getOfficerOfWhda(@RequestParam String name){
		return whdaService.getOfficerOfWhda(name);
	}
	
	@GetMapping("/name")
	public Long getWhdaIdByname(@RequestParam String name){
		return whdaService.getWhdaIdByname(name);
	}

}
