package com.generate.link.generate_link.generate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class generate_link_controller {
	
	
	@Autowired
	generate_link_service gls;
	

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homepage(ModelMap model) {
		String ip_lnk="";
		//model.addAttribute("ip_link",ip_lnk);
		return "homepage";
	}
	
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String homepageret(ModelMap model,@RequestParam String ip_link) {
		
		String op_lnk=gls.generateShort(ip_link);
		
		model.addAttribute("op_lnk",op_lnk);
		
		return "homepage";
	}

}
