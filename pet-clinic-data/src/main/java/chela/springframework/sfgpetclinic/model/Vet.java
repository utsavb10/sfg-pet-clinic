package chela.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {

	private Set<VetSpeciality> vetSpecialities;

	public Set<VetSpeciality> getVetSpecialities() {
		return vetSpecialities;
	}

	public void setVetSpecialities(Set<VetSpeciality> vetSpecialities) {
		this.vetSpecialities = vetSpecialities;
	}
}
