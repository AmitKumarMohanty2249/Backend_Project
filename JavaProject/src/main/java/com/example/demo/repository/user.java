package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

public interface user extends JpaRepository<Integer, ID> {

	Object builder();

	Object save(user p);

	void setName(Object name);

	void setEmail(Object email);

	Optional<Integer> findOne(Integer id);

	static Optional<Integer> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	Integer getId();

	Object getEmail();

	Object getStatus();

	Object getName();

	

}
