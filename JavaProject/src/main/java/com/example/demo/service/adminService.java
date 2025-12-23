package com.example.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.DTO.adminDTO;
import com.example.demo.DTO.userDTO;
import com.example.demo.EntityMapper.EntityMapper;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Exception.ResponseMessage;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Admin.AdminBuilder;
import com.example.demo.repository.user;

import ch.qos.logback.core.status.Status;

public class adminService {

	private Status status;
	private Admin Admin;
    public void UserServices(user user, Admin admin) {
        this.status = status;
        this.Admin = admin;
    }
    public adminDTO addAdmin(adminDTO dto) {
       Admin p = ((AdminBuilder) Admin.builder())
                .name(dto.getName())
                .email(dto.getEmail())
                .build();
        return EntityMapper.toadminDTO(Admin.save(p));
    }
    public adminDTO getAdmin(Integer id) throws ResourceNotFoundException {
        Integer p = user.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" not found with id " + id));
        return EntityMapper.toadminDTO(p);
    }
    public userDTO updateAdmin(Integer id, adminDTO dto) {
       Integer p = null;
	   try {
		p = user.findById(id)
		            .orElseThrow(() -> new ResourceNotFoundException(" not found with id " + id));
	   } catch (ResourceNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
//        p.setName(dto.getName());
//        p.setEmail(dto.getEmail());
        return EntityMapper.touserDTO(Admin.save(p));
    }
    public ResponseMessage deleteuser(ID id) throws Exception {
        try {
			if (!Admin.existsById(id))
			    throw new Exception(" not found with id " + id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Admin admin2 = new Admin(null, null, null);
		admin2.deleteById(id);
        return new ResponseMessage();
    }
	public static @Nullable Object deleteAdmin(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	 public adminDTO Status(Integer AdminId, Set<Integer> Status) throws ResourceNotFoundException {
	       Integer p = Admin.findById(AdminId)
	                .orElseThrow(() -> new ResourceNotFoundException("Professor not found with id " + AdminId));

	        Set<Status> courses = new HashSet<>();
	        for (Integer Status1 : Status) {
	            Integer c =((com.example.demo.entity.Admin) Status).findById(Status)
	                    .orElseThrow(() -> new ResourceNotFoundException("Course not found with id " + Status));
	           
	            Status.add(c);
	        }
	        
	        Admin.save(p);
	        return EntityMapper.toadminDTO(p);
	    }
	 	
	    public void getAlladmin() {
	        return ;
	    }

}
