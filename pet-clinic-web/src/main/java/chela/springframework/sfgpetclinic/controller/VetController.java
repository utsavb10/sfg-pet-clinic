package chela.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	@RequestMapping({"/vets", "/vets/", "/vets/index"})
	public String getAllVets(){
		return "vets/index";
	}
}
