package com.example.demo.EntityMapper;


import java.util.stream.Collectors;

import com.example.demo.DTO.adminDTO;
import com.example.demo.DTO.userDTO;
import com.example.demo.entity.Admin;
import com.example.demo.repository.user;

import ch.qos.logback.core.status.Status;

public class EntityMapper {

    public static adminDTO toadminDTO(Admin s) {
        if (s == null) return null;
        return adminDTO.builder()
                .id(s.getId())
                .name(s.getName())
                .email(s.getEmail())
                
//                .AdminIds(s.getuser() != null ?
//                        ((Object) s.getuser()).stream().map(user::getId).collect(Collectors.toSet()) : null)
                .build();
    }

   
    public static userDTO touserDTO(user p) {
        if (p == null) return null;
        return userDTO.builder()
                .id(p.getId())
                .name((String) p.getName())
                .email((String) p.getEmail())
//                .userIds(p.getStatus() != null ?
//                        ((Object) p.getStatus()).stream().map(Status::getId).collect(Collectors.toSet()) : null)
                .build();
    }
    public static userDTO touserDTO(Object save) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	public static adminDTO toadminDTO(Object save) {
		// TODO Auto-generated method stub
		return null;
	}

  
}
