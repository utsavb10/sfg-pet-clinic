package chela.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class Person extends BaseEntity{

	public Person(Long id, String fname, String lname) {
		super(id);
		this.fname = fname;
		this.lname = lname;
	}

	@Column(name = "first_name")
	private String fname;

	@Column(name= "last_name")
	private String lname;

}
