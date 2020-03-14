package chela.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_speciality",
		joinColumns = @JoinColumn(name = "vet_id"),
		inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<VetSpeciality> vetSpecialities = new HashSet<>();

	public Set<VetSpeciality> getVetSpecialities() {
		return vetSpecialities;
	}

	public void setVetSpecialities(Set<VetSpeciality> vetSpecialities) {
		this.vetSpecialities = vetSpecialities;
	}
}
