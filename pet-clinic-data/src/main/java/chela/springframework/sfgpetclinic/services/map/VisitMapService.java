package chela.springframework.sfgpetclinic.services.map;

import chela.springframework.sfgpetclinic.model.Visit;
import chela.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visit save(Visit t) {
		if(t.getPet()==null ||
			t.getPet().getId()==null ||
			t.getPet().getPetType() ==null ||
			t.getPet().getPetType().getId() ==null ||
			t.getPet().getOwner() == null ||
			t.getPet().getOwner().getId() == null){
			throw new RuntimeException("Something wrong with Pet Object");
		}
		return super.save(t);
	}

	@Override
	public void delete(Visit t) {
		super.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
