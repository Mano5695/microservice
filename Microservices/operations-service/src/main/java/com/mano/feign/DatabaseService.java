package com.mano.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="database-service")
@RibbonClient(name="database-service")
public interface DatabaseService {
	
	@GetMapping("/api/info")
	public String getInfo();
	
	@GetMapping("/api/configInfo")
	public String getConfigInfo(@RequestParam String msg);
}
