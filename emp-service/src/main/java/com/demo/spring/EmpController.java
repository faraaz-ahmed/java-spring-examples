package com.demo.spring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring.entity.Emp;

@Controller
public class EmpController {
	
	@Autowired
	EmpRepository repo;
	
	@Autowired
	EmpDataValidator validator;
	
	@RequestMapping(path = "/index", method = RequestMethod.GET)
	public String getMainPage(Model model) {
		return "index";
	}
	
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String getFirstPage(Model model) {
		Emp e = new Emp();
		model.addAttribute("emp", e);
		return "emp";
	}
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("emp")Emp e) {
		ModelAndView mv = new ModelAndView();
//		Validator v = new EmpDataValidator();
//		v.validate(e, errors);
//		if(errors.hasErrors()) {
//			mv.setViewName("emp");
		if(false) {} else {
			if(repo.existsById(e.getEmpId())) {
				mv.setViewName("error");
			}else {
				repo.save(e);
				mv.setViewName("response");
				mv.addObject("name", e.getName());
			}
		}
		return mv;
	}
	
	@RequestMapping(path = "/findEmp", method = RequestMethod.POST)
	public ModelAndView findEmployee(@RequestParam("id")int id) {
		ModelAndView mv = new ModelAndView();
		if(repo.existsById(id)) {
			Optional<Emp> o = repo.findById(id);
			if(o.isPresent()) {
				mv.addObject("result", o.get());
				mv.setViewName("empDetails");
			} else {
				mv.setViewName("error");
			}
//			Emp e = repo.findById(id);
		}
		return mv;
	}
	
	
}
