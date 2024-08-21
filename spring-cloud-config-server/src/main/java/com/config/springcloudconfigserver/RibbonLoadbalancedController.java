package com.config.springcloudconfigserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Car")
public class RibbonLoadbalancedController {

@Autowired
private Environment environment;

@GetMapping("/RibbonLoadbalancedController")		//where {from} and {to} are path variable
public String RibbonLoadbalancedController()   //from map to USD and to map to INR
{		
return environment.getProperty("local.server.port");
}

}
