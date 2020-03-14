package chela.springframework.sfgpetclinic.services.springdatajpa;

import chela.springframework.sfgpetclinic.model.Pet;
import chela.springframework.sfgpetclinic.repository.PetRepository;
import chela.springframework.sfgpetclinic.repository.PetTypeRepository;
import chela.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public PetSDJpaService(PetRepository petRepository, PetTypeRepository petTypeRepository) {
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		for( Pet pet : petRepository.findAll()){
			pets.add(pet);
		}
		return pets;
	}

	@Override
	public Pet findById(Long aLong) {
		return petRepository.findById(aLong).orElse(null);
	}

	@Override
	public Pet save(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public void delete(Pet pet) {
		petRepository.delete(pet);
	}

	@Override
	public void deleteById(Long aLong) {
		petRepository.deleteById(aLong);
	}
}
