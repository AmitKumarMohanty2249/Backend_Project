package com.example.demo.controller;

import org.apache.catalina.connector.Response;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.DTO.userDTO;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.service.adminService;
import com.example.demo.service.userService;

@RestController
@RequestMapping("/user")
public class UserController{
	private final userService userservice ;
	public UserController(userService userservice) {
		this.userservice=userservice;
	}
	@PostMapping
	public ResponseEntity<@Nullable Object> adduser(RequestBody userDTO ){
		Object dto = null;
		return ResponseEntity.ok(userService.adduser(dto));
	}
	 @GetMapping("/{id}")
	    public ResponseEntity<@Nullable Object> getuser(@PathVariable Integer id) {
	        try {
				return ResponseEntity.ok(userService.getuser(id));
			} catch (ResourceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	    }
	 
	 @PutMapping("/update/{id}")
	    public ResponseEntity<@Nullable Object> updateuser(@PathVariable Integer id, @RequestBody userDTO dto) {
	        return ResponseEntity.ok(userService.updateuser(id, dto));
	    }
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Object> deleteuser(@PathVariable Integer id) {
	        return ResponseEntity.ok(userService.deleteuser(id));
	    }
}