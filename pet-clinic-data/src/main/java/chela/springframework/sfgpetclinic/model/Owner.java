package chela.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {

	@Builder
	public Owner(Long id, String fname, String lname, Set<Pet> pets, String address, String city, String phone) {
		super(id, fname, lname);
		this.pets = pets;
		this.address = address;
		this.city = city;
		this.phone = phone;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "phone")
	private String phone;

}
