package chela.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"index", "/"})
	public String getIndex(){
		return "index";
	}

	@RequestMapping({"/oups"})
	public String errorPage(){
		return "notimplemented";
	}
}
