package chela.springframework.sfgpetclinic.services.map;

import chela.springframework.sfgpetclinic.model.Owner;
import chela.springframework.sfgpetclinic.model.Pet;
import chela.springframework.sfgpetclinic.services.OwnerService;
import chela.springframework.sfgpetclinic.services.PetService;
import chela.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetService petService;
	private final PetTypeService petTypeService;

	public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
		this.petService = petService;
		this.petTypeService = petTypeService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner owner) {
		if(owner!=null){
			if(owner.getPets()!=null){
				owner.getPets().forEach( pet -> {
					// checking if petType exists and if it doesn't have an Id, give it an Id.
					if(pet.getPetType()!=null){
						if(pet.getPetType().getId() == null){
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}
					else { throw new RuntimeException("PetType is required");}
					// first pet's petType wa taken care of, now if pet's id doesn't exist, it'll be taken care of.
					if(pet.getId()==null){
						Pet newPet = petService.save(pet);
						pet.setId(newPet.getId());  //seems unnecessary
					}
				});
			}
		}

		return super.save(owner);
	}

	@Override
	public void delete(Owner t) {
		super.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
}
