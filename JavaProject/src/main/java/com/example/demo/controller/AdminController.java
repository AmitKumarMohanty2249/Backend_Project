package com.example.demo.controller;

import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.userDTO;
import com.example.demo.service.adminService;
import com.example.demo.service.userService;

@RestController
@RequestMapping("/Admin")

public class AdminController {
	private final adminService adminservice ;
	public AdminController(adminService adminservice) {
		this.adminservice=adminservice;
	}
	@PostMapping
	public ResponseEntity<@Nullable Object> addAdmin(RequestBody adminDTO ){
		Object dto = null;
		return ResponseEntity.ok(userService.addadmin(dto));
	}
	 @GetMapping("/{id}")
	    public ResponseEntity<@Nullable Object> getAdmin(@PathVariable Integer id) {
	        return ResponseEntity.ok(userService.addadmin(id));
	    }
	 @PutMapping("/update/{id}")
	    public ResponseEntity<@Nullable Object> updateAdmin(@PathVariable Integer id, @RequestBody userDTO dto) {
	        return ResponseEntity.ok(userService.updateadmin(id, dto));
	    }
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Object> deleteAdmin(@PathVariable Integer id) {
	        return ResponseEntity.ok(adminService.deleteAdmin(id));
	    }
	 
}
