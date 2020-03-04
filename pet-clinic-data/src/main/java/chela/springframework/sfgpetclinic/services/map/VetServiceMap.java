package chela.springframework.sfgpetclinic.services.map;

import chela.springframework.sfgpetclinic.model.Vet;
import chela.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
