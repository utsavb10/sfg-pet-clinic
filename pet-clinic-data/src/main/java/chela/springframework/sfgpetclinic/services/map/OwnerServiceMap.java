package chela.springframework.sfgpetclinic.services.map;

import chela.springframework.sfgpetclinic.model.Owner;
import chela.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
	}

	@Override
	public void delete(Owner t) {
		this.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastNme) {
		return null;
	}
}
