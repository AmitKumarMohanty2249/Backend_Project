package com.example.demo.service;

import org.hibernate.validator.internal.metadata.aggregated.AbstractPropertyCascadable.AbstractBuilder;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.DTO.userDTO;
import com.example.demo.EntityMapper.EntityMapper;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Exception.ResponseMessage;
import com.example.demo.entity.Admin;
import com.example.demo.repository.user;

import lombok.Builder;

@Service
public class userService {
	

	private user user;
	private Admin Admin;
    public void UserServices(user user, Admin admin) {
        this.user = user;
        this.Admin = admin;
    }
//    public userDTO adduser(userDTO dto) {
//       user p = ((Object) user.builder())
//                .name(dto.getName())
//                .email(dto.getEmail())
//                .build();
//        return EntityMapper.touserDTO(user.save(p));
//    }
    public static userDTO getuser(Integer id) throws ResourceNotFoundException {
        Integer p = com.example.demo.repository.user.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" not found with id "));
        return EntityMapper.touserDTO(p);
    }
    public userDTO user(Integer id, userDTO dto) throws ResourceNotFoundException {
       Integer p =com.example.demo.repository.user.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" not found with id " + id));
//        p.setName(dto.getName());
//        p.setEmail(dto.getEmail());
        return EntityMapper.touserDTO(user.save(p));
    }
    public ResponseMessage deleteuser(ID id) throws Exception {
        if (!user.existsById(id))
            throw new Exception(" not found with id " + id);
        user.deleteById(id);
        return new ResponseMessage();
    }
	public static @Nullable Object addadmin(Object dto) {
		// TODO Auto-generated method stub
		return null;
	}
	public static @Nullable Object updateadmin(Integer id, userDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	public static @Nullable Object adduser(Object dto) {
		// TODO Auto-generated method stub
		return null;
	}
	public static @Nullable Object updateuser(Integer id, userDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	public static @Nullable Object deleteuser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object user (Integer id) {
		return null;
	}
    

	

}
