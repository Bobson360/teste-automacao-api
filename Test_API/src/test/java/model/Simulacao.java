package model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Simulacao {
	
	@JsonIgnore
	private long id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
}
