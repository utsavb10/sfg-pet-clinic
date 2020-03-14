package chela.springframework.sfgpetclinic.services.springdatajpa;

import chela.springframework.sfgpetclinic.model.PetType;
import chela.springframework.sfgpetclinic.repository.PetTypeRepository;
import chela.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
	private final PetTypeRepository petTypeRepository;

	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		for(PetType petType : petTypeRepository.findAll()){
			petTypes.add(petType);
		}
		return petTypes;
	}

	@Override
	public PetType findById(Long aLong) {
		return petTypeRepository.findById(aLong).orElse(null);
	}

	@Override
	public PetType save(PetType petType) {
		return petTypeRepository.save(petType);
	}

	@Override
	public void delete(PetType petType) {
		petTypeRepository.delete(petType);
	}

	@Override
	public void deleteById(Long aLong) {
		petTypeRepository.deleteById(aLong);
	}
}
