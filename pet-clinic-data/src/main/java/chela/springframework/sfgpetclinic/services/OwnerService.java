package chela.springframework.sfgpetclinic.services;

import chela.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastNme);

}
