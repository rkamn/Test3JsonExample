package com.lightbits.test3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/te")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

}
