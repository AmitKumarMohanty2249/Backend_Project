package com.example.demo.DTO;
import lombok.*;
import java.util.Set;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	public class userDTO {
	    private Integer id;
	    private String name;
	    private String email;
	    private Set<Integer> courseIds;
	


	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
