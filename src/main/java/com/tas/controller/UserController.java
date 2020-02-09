/**
 * 
 */
package com.tas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asrivastava
 *
 */
@RestController
public class UserController {
	
	@GetMapping("/")
	public String greeting() {
		return "Hello";
	}

}
