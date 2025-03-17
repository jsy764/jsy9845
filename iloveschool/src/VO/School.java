package VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class School {
	private int id;
	private String diff;
	private String schoolName;
	private String address;
	private int post_Code;
	private String tel;
	private String fax;
	private String education_office;
	private String public_private;
	private String homepage;
}
