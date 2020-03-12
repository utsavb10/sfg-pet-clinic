package chela.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

	@Column(name = "pet_name")
	private String petName;

	@Column(name = "birth_date")
	private LocalDate birthDate;

	@ManyToOne
	@JoinColumn(name = "type_id")
	private PetType petType;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
