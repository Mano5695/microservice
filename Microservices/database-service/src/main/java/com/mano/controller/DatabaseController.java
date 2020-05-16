package com.mano.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@RequestMapping("/api")
public class DatabaseController {
	
	@Value("${message}")
    private String personName;
	
	@GetMapping("/info")
	public String getInfo() {
		return "Woking fine";
	}
	
	@GetMapping("/configInfo")
	public String getConfigInfo(@RequestParam String msg) {
		return "Woking fine " + personName + " " + msg;
	}
}
