package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.yaml.snakeyaml.events.Event.ID;

@Entity
@Data
@AllArgsConstructor
@Builder

public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	@Column(unique = true)
	private String email;

	public Object save(Admin p) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object save(Integer p) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(ID id2) {
		// TODO Auto-generated method stub
		return false;
	}

	public void deleteById(ID id2) {
		// TODO Auto-generated method stub
		
	}

	public Optional<Integer> findById(Set<Integer> status) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Integer> findById(Integer adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getuser() {
		// TODO Auto-generated method stub
		return null;
	}
   

}
