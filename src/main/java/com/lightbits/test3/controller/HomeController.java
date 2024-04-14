package com.lightbits.test3.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.boot.configurationprocessor.json.JSONObject;

@Controller
public class HomeController {

	//@ResponseBody
	@RequestMapping("/index")
	//public JSONObject greeting(@RequestParam("a") String abd) {
	public String greeting(@RequestParam("a") String abd,Model model) {	
		System.out.println("param1 is "+abd);
		
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		
		
		model.addAttribute("message",jo);
		//return new ResponseEntity<JSONObject>("intex");
		//return jo.toString();
		return "index";
	}

}
