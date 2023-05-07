package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class demoController {

	@GetMapping("/hello/{name}")
    public String login(@PathVariable("name") String name,@RequestParam("name2") String name2,Model model){
	
		model.addAttribute("message", "Hello,"+name+" "+name2);
        return "index";
    }
	
}

