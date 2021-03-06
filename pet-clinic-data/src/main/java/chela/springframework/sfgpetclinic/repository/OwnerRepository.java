package chela.springframework.sfgpetclinic.repository;

import chela.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

	public Owner findByLname(String lname);
}
