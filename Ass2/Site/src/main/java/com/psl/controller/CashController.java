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

import com.psl.entity.WithDraw;
import com.psl.service.ConService;

@Controller
//@RequestMapping("site")
public class CashController {

	@Autowired
	ConService c;
	@RequestMapping(value = {"/we","/"}, method = RequestMethod.GET)
	public String sayHello() {
//		System.out.println(c.getdetails(12));
		return "Welcome";
	}	
	@RequestMapping(value = "/de/{id}", method = RequestMethod.GET)
	public String Hello(@PathVariable int id,Model model) {	
		WithDraw t=c.getdetails(id);	
	    model.addAttribute("t",t);
		System.out.println(t);		
		return "details";
	}	
	
	@RequestMapping(value = "/take", method = RequestMethod.GET)
	public String filltotake(Model model) {
		model.addAttribute("take", new WithDraw());
		return "withdraw";	
	}	
	
	@RequestMapping(value = "/take", method = RequestMethod.POST)
	public String taking(@ModelAttribute WithDraw e,Model model) {			    	 
		      System.out.println(e);
		      c.takeBalance(e.getAccno(),e.getAmount());	
		      WithDraw t=c.getdetails(e.getAccno());
		      System.out.println(t);
		      model.addAttribute("t",t);
		    //saveEmployee(e);
		return "details";	
	}	
	@RequestMapping(value = "/incre", method = RequestMethod.GET)
	public String filltoinc(Model model) {
		model.addAttribute("incre", new WithDraw());
		return "deposite";	
	}	
	
	@RequestMapping(value = "/incre", method = RequestMethod.POST)
	public String increment(@ModelAttribute WithDraw e,Model model) {			    	 
		      System.out.println(e);
		      c.addBalance(e.getAccno(),e.getAmount());	
		      WithDraw t=c.getdetails(e.getAccno());
		      System.out.println(t);
		      model.addAttribute("t",t);		    //
		return "details";	
	}	
}
