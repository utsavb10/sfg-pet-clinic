package chela.springframework.sfgpetclinic.services.springdatajpa;

import chela.springframework.sfgpetclinic.model.Vet;
import chela.springframework.sfgpetclinic.repository.VetRepository;
import chela.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
	private final VetRepository vetRepository;

	public VetSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		for(Vet vet : vetRepository.findAll()){
			vets.add(vet);
		}
		return vets;
	}

	@Override
	public Vet findById(Long aLong) {
		return vetRepository.findById(aLong).orElse(null);
	}

	@Override
	public Vet save(Vet vet) {
		return vetRepository.save(vet);
	}

	@Override
	public void delete(Vet vet) {
		vetRepository.delete(vet);
	}

	@Override
	public void deleteById(Long aLong) {
		vetRepository.deleteById(aLong);
	}
}
