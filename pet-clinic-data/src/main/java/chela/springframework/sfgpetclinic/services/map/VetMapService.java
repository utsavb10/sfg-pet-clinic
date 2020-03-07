package chela.springframework.sfgpetclinic.services.map;

import chela.springframework.sfgpetclinic.model.Vet;
import chela.springframework.sfgpetclinic.services.VetService;
import chela.springframework.sfgpetclinic.services.VetSpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	private final VetSpecialityService vetSpecialityService;

	public VetMapService(VetSpecialityService vetSpecialityService) {
		this.vetSpecialityService = vetSpecialityService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet vet) {
		if(vet != null){
			if(vet.getVetSpecialities() != null) {
				vet.getVetSpecialities().forEach(vetSpeciality -> {
					if (vetSpeciality.getId() == null) {
						vetSpeciality.setId(vetSpecialityService.save(vetSpeciality).getId());
					}
				});
			}
			if( vet.getVetSpecialities() ==null){
				throw new RuntimeException("Vet has to have a speciality");
			}
		}
		return super.save(vet);
	}

	@Override
	public void delete(Vet t) {
		super.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
