package com.psl.controller;

import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.entity.Donner;
import com.psl.service.ConService;

@Controller
//@RequestMapping("site")
public class DonnerController {

	@Autowired
	ConService c;
	@RequestMapping(value = {"/we","/"}, method = RequestMethod.GET)
	public String sayHello() {			
		return "Welcome";
	}	
	@RequestMapping(value = "/e/{id}" , method = RequestMethod.GET)
	public String sayHello(@PathVariable int id,Model model) {
		Donner gave=c.getDonner(id)	;	
		if(gave.equals(null))
			System.out.println("no data exist");
		else {
			model.addAttribute("gave",gave);
			System.out.println(gave);
		}
		return "wel";
	}

	@RequestMapping(value = "/we/{id}" , method = RequestMethod.GET)
	public String say(@PathVariable String id,@RequestParam(required = false) String n,Model model) {
		model.addAttribute("idn1", id);
		model.addAttribute("msg1", "You are in Donner Page");
		model.addAttribute("n", n);
		return "wel";
	}


	@RequestMapping(value = "/give", method = RequestMethod.GET)
	public String showEmpForm(Model model) {
		model.addAttribute("employee", new Donner());
		return "donner";	
	}	

	@RequestMapping(value = "/give", method = RequestMethod.POST)
	public String registration(@ModelAttribute Donner e,Model model) {			
		System.out.println(e);
		c.addDonner(e);			    

		//saveEmployee(e);
		return "redirect:/give";	
	}	
}
