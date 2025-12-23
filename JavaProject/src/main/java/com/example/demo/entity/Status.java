package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Builder

public class Status {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private boolean Open;
	private boolean InProgress;
	private boolean Closed;
	
	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	private Set<Admin> admin = new HashSet<>();
	

}
