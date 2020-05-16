package com.mano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mano.feign.DatabaseService;


@RefreshScope
@RestController
@RequestMapping("/api")
public class DatabaseController {
	
	@Autowired
	DatabaseService databaseServiceFeign;
	
	@Value("${message}")
    private String personName;
	
	@GetMapping("/info")
	public String getInfo() {
		return "Woking fine";
	}
	
	@GetMapping("/configInfo")
	public String getConfigInfo() {
		return "Woking fine" + personName;
	}
	
	@GetMapping("/configInfo/feign")
	public String getConfigInfoFeign(@RequestParam String msg) {
		return databaseServiceFeign.getConfigInfo(msg);
	}
	
	
}
