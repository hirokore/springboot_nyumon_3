package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "form";
	}
	
	@PostMapping("/confirm")
	public String confirm(@RequestParam String rsv_message, Model model) {
		model.addAttribute("message", rsv_message);
		return "confirm";
	}
}

//model.addAttribute("出力で使うやつ", 受け取りで使うやつっていうか@requestparamで受け取ったやつの変数)