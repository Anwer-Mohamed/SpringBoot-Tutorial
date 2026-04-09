package com.global.tutorial.Officer.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("officer")
public class Officer {
	
	@Id
	@Column("officer_id")
	private Long id;
	
	private Long serial_num;
	
	private String name;
	
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
