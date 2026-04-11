package com.global.tutorial.Officer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.global.tutorial.Officer.Model.Officer;

@Repository
public interface OfficerDataJPARepo extends JpaRepository<Officer, Long>{
	

}
