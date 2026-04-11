package com.global.tutorial.Officer.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="officer")
public class Officer {
	
	@Id
	@Column(name="officer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "serial_num")
	private Long serial_num;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "whda_id")
	private Long whda_id;
	
	
	
	
	
	public Long getSerial_num() {
		return serial_num;
	}


	public void setSerial_num(Long serial_num) {
		this.serial_num = serial_num;
	}


	public Long getWhda_id() {
		return whda_id;
	}


	public void setWhda_id(Long whda_id) {
		this.whda_id = whda_id;
	}


	
	
	
	public Officer() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
