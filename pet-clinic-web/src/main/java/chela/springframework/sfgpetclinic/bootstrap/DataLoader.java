package chela.springframework.sfgpetclinic.bootstrap;

import chela.springframework.sfgpetclinic.model.Owner;
import chela.springframework.sfgpetclinic.model.Pet;
import chela.springframework.sfgpetclinic.model.PetType;
import chela.springframework.sfgpetclinic.model.Vet;
import chela.springframework.sfgpetclinic.services.OwnerService;
import chela.springframework.sfgpetclinic.services.PetTypeService;
import chela.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("Dog");
		petTypeService.save(dog);

		PetType cat = new PetType();
		dog.setName("Cat");
		petTypeService.save(cat);

		PetType hamster = new PetType();
		dog.setName("Hamster");
		petTypeService.save(hamster);

		Owner o1 = new Owner();
		o1.setFname("Utsav");
		o1.setLname("Bansal");
		o1.setAddress("adr1");
		o1.setCity("Rohtak");
		o1.setPhone("423432423");

		Pet p1 = new Pet();
		p1.setPetType(dog);
		p1.setPetName("Doggo");
		p1.setBirthDate(LocalDate.now());
		p1.setOwner(o1);

		o1.getPets().add(p1);
		ownerService.save(o1);
//		System.out.println("Created" + ownerService.findById(10L));

		Owner o2 = new Owner();
		o2.setFname("Yuvi");
		o2.setLname("Vivi");

		Pet p2 = new Pet();
		p2.setPetType(cat);
		p2.setPetName("Catto");
		p2.setBirthDate(LocalDate.now());
		p2.setOwner(o2);

		o2.getPets().add(p2);
		ownerService.save(o2);

//		System.out.println("Created" + ownerService.findById(14L));

		Vet v1= new Vet();
		v1.setFname("Rabish");
		v1.setLname("Chaudhury");
		vetService.save(v1);

//		System.out.println("Created" + vetService.findById(7L));

		Vet v2= new Vet();
		v2.setFname("Rubi");
		v2.setLname("Chuby");
		vetService.save(v2);

//		System.out.println("Created" + vetService.findById(17L));
	}
}
