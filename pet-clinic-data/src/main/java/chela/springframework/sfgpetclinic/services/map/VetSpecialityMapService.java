package chela.springframework.sfgpetclinic.services.map;

import chela.springframework.sfgpetclinic.model.VetSpeciality;
import chela.springframework.sfgpetclinic.services.VetSpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetSpecialityMapService extends AbstractMapService<VetSpeciality, Long> implements VetSpecialityService {

	@Override
	public Set<VetSpeciality> findAll() {
		return super.findAll();
	}

	@Override
	public VetSpeciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public VetSpeciality save(VetSpeciality vetSpeciality) {
		return super.save(vetSpeciality);
	}

	@Override
	public void delete(VetSpeciality vetSpeciality) {
		super.delete(vetSpeciality);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
