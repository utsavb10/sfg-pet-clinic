package chela.springframework.sfgpetclinic.services.springdatajpa;

import chela.springframework.sfgpetclinic.model.VetSpeciality;
import chela.springframework.sfgpetclinic.repository.VetSpecialityRepository;
import chela.springframework.sfgpetclinic.services.VetSpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSpecialitySDJpaService implements VetSpecialityService {

	private final VetSpecialityRepository vetSpecialityRepository;

	public VetSpecialitySDJpaService(VetSpecialityRepository vetSpecialityRepository) {
		this.vetSpecialityRepository = vetSpecialityRepository;
	}

	@Override
	public Set<VetSpeciality> findAll() {
		Set<VetSpeciality> specialities = new HashSet<>();
		for(VetSpeciality speciality : vetSpecialityRepository.findAll()){
			specialities.add(speciality);
		}
		return specialities;
	}

	@Override
	public VetSpeciality findById(Long aLong) {
		return vetSpecialityRepository.findById(aLong).orElse(null);
	}

	@Override
	public VetSpeciality save(VetSpeciality vetSpeciality) {
		return vetSpecialityRepository.save(vetSpeciality);
	}

	@Override
	public void delete(VetSpeciality vetSpeciality) {
		vetSpecialityRepository.delete(vetSpeciality);
	}

	@Override
	public void deleteById(Long aLong) {
		vetSpecialityRepository.deleteById(aLong);
	}
}
