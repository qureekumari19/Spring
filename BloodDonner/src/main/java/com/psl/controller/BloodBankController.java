package com.psl.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.validation.Valid;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.entity.BloodDonnerDetails;
import com.psl.entity.BloodDonnerFetch;
import com.psl.service.DonnerService;

@Controller
public class BloodBankController {
	@Autowired
	DonnerService ser;

	@RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
	public String requestparameter(@PathVariable String name,@RequestParam(required = false) String bloodgroup,Model model) {
		BloodDonnerDetails donerdetails=ser.getdonerByName(name);
		model.addAttribute("donerdetails", donerdetails);
		model.addAttribute("bloodgroup", bloodgroup);
		return "req_name";
	}	
	@RequestMapping(value = "/donner", method = RequestMethod.GET)
	public String sayHello(Model model) {
		model.addAttribute("donner",new BloodDonnerDetails());
		return "BloodBankWelcomePage";
	}	
	@RequestMapping(value = "/donner", method = RequestMethod.POST)
	public String register(@ModelAttribute BloodDonnerDetails b,Model model) {
		System.out.println(b);		
		return "redirect:/donner";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String getHello(Model model) {
		model.addAttribute("detail",new BloodDonnerFetch());	
		return "Fetch";
	}	
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public String fetching(@ModelAttribute BloodDonnerFetch b,Model model) {	
		BloodDonnerDetails donerdetails=ser.getdonerByName(b.getName());
		System.out.println(donerdetails);
		return "redirect:/welcome";
	}
}
