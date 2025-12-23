package com.example.demo.DTO;
import lombok.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class adminDTO {
    private Integer id;
    private String name;
    private String email;
    private Set<Integer> courseIds;



	public String getName() {
		// TODO Auto-generated method stub
		return getName();
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
