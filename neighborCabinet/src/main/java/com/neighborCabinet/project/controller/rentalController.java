package com.neighborCabinet.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class rentalController {
	@RequestMapping("/rental")
	public String rental() {
		return "rental/rental";
	}
}
