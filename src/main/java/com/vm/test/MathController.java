package com.vm.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MathController {
	@PostMapping("/api/add")
	public int add(){
		return 0;
	}
}
