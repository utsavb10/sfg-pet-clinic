package chela.springframework.sfgpetclinic.bootstrap;

import chela.springframework.sfgpetclinic.model.*;
import chela.springframework.sfgpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetService petService;
	private final PetTypeService petTypeService;
	private final VisitService visitService;
	private final VetSpecialityService vetSpecialityService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetService petService, PetTypeService petTypeService, VisitService visitService, VetSpecialityService vetSpecialityService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petService = petService;
		this.petTypeService = petTypeService;
		this.visitService = visitService;
		this.vetSpecialityService = vetSpecialityService;
	}

	@Override
	public void run(String... args) throws Exception {

		loadData();
	}

	private void loadData() {
		VetSpeciality vs1 = new VetSpeciality();
		vs1.setDescription("Radiology");
		vetSpecialityService.save(vs1);

		VetSpeciality vs2 = new VetSpeciality();
		vs2.setDescription("Surgery");
		vetSpecialityService.save(vs2);

		VetSpeciality vs3 = new VetSpeciality();
		vs3.setDescription("Dentistry");
		vetSpecialityService.save(vs3);

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
		ownerService.save(o1);

		Pet p1 = new Pet();
		p1.setPetType(dog);
		p1.setPetName("Doggo");
		p1.setBirthDate(LocalDate.now());
		p1.setOwner(o1);
		petService.save(p1);

//		o1.getPets().add(p1);
//		System.out.println("Created" + ownerService.findById(10L));

		Owner o2 = new Owner();
		o2.setFname("Yuvi");
		o2.setLname("Vivi");
		ownerService.save(o2);

		Pet p2 = new Pet();
		p2.setPetType(cat);
		p2.setPetName("Catto");
		p2.setBirthDate(LocalDate.now());
		p2.setOwner(o2);
		petService.save(p2);

//		o2.getPets().add(p2);

//		System.out.println("Created" + ownerService.findById(14L));

		Vet v1= new Vet();
		v1.setFname("Rabish");
		v1.setLname("Chaudhury");
		v1.getVetSpecialities().add(vs1);
		vetService.save(v1);

//		System.out.println("Created" + vetService.findById(7L));

		Vet v2= new Vet();
		v2.setFname("Rubi");
		v2.setLname("Chuby");
		v2.getVetSpecialities().add(vs2);
		vetService.save(v2);

//		System.out.println("Created" + vetService.findById(17L));

		Vet v3= new Vet();
		v3.setFname("Chami");
		v3.setLname("Loko");
		v3.getVetSpecialities().add(vs3);
		vetService.save(v3);

		Visit visit = new Visit();
		visit.setDate(LocalDate.now());
		visit.setDescription("Regular Checkup");
		visit.setPet(p1);
		visitService.save(visit);

		Visit visit2 = new Visit();
		visit2.setDate(LocalDate.now());
		visit2.setDescription("Regular Checkup");
		visit2.setPet(p2);
		visitService.save(visit2);
	}
}
