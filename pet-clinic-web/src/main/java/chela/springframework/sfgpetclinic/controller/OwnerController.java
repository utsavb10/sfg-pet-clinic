package chela.springframework.sfgpetclinic.controller;

import chela.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({"/owners", "/owners/", "/owners/index"})
	public String getAllOwners(Model model){
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

	@RequestMapping({"owners/find"})
	public String findVet(){
		return "notimplemented";
	}
}
