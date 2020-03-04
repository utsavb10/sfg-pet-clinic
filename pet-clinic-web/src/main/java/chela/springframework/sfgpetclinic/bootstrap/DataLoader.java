package chela.springframework.sfgpetclinic.bootstrap;

import chela.springframework.sfgpetclinic.model.Owner;
import chela.springframework.sfgpetclinic.model.Vet;
import chela.springframework.sfgpetclinic.services.OwnerService;
import chela.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner o1 = new Owner();
		o1.setFname("Utsav");
		o1.setLname("Bansal");
		ownerService.save(o1);

//		System.out.println("Created" + ownerService.findById(10L));

		Owner o2 = new Owner();
		o2.setFname("Yuvi");
		o2.setLname("Vivi");
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
