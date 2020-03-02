package chela.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	@RequestMapping({"/owners", "/owners/", "/owners/index"})
	public String getAllVets(){
		return "owners/index";
	}
}
