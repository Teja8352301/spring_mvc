package com.teja;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/")
	public String welcomePageRoot() {
		return "welcome";
	}
	
	@RequestMapping("welcome")
	public String welcomePage() {
		return "welcome";
	}
	
	@RequestMapping("newStudent")
	public String newStudentPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "new-student";
	}
	
	@RequestMapping("processForm")
	public String studentProcessForm(@Valid @ModelAttribute Student student,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "new-student";
		}
		else {
			return "student-process-form";			
		}
	}

}
