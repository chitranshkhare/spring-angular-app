package com.ck.demo.webapp.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ck.demo.webapp.common.utils.GsonUtils;

@RestController
public class CommonController {
	
	@GetMapping("/go")
	public String go() {
		List<String> cars = List.of("A", "B", "C", "D", "E", "F");
		
		return GsonUtils.toJsonList(cars);
	}

}
