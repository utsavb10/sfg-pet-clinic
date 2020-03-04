package chela.springframework.sfgpetclinic.services.map;

import chela.springframework.sfgpetclinic.model.Pet;
import chela.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet pet) {
		return super.save(pet);
	}

	@Override
	public void delete(Pet t) {
		super.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
