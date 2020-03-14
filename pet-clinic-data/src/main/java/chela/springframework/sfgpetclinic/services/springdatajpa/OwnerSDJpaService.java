package chela.springframework.sfgpetclinic.services.springdatajpa;

import chela.springframework.sfgpetclinic.model.Owner;
import chela.springframework.sfgpetclinic.repository.OwnerRepository;
import chela.springframework.sfgpetclinic.repository.PetRepository;
import chela.springframework.sfgpetclinic.repository.PetTypeRepository;
import chela.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

//@Primary //because there is OwnerMapService available too
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Owner findByLastName(String lastNme) {
		return ownerRepository.findByLname(lastNme);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		for (Owner owner : ownerRepository.findAll()) {
			owners.add(owner);
		}
		return owners;
	}

	@Override
	public Owner findById(Long aLong) {
		Optional<Owner> optionalOwner = ownerRepository.findById(aLong);
		return optionalOwner.orElse(null); //cool code !!
	}

	@Override
	public Owner save(Owner owner) {
		return ownerRepository.save(owner);
	}

	@Override
	public void delete(Owner owner) {
		ownerRepository.delete(owner);
	}

	@Override
	public void deleteById(Long aLong) {
		ownerRepository.deleteById(aLong);
	}
}
