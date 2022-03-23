package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	@Autowired
	//@Qualifier("tablet")
	private Gadgets gadgets;

	/**
	 * @param gadgets
	 */
	
	
	 @Autowired
    /*
	public UserController(Gadgets gadgets) {
	   this.gadgets = gadgets;
	}
	
	*/
	public void setUser(@Qualifier("laptop")Gadgets gadgets) {
		this.gadgets=gadgets;
	}
	
	
	@GetMapping("/users")
	public int display() {
		return gadgets.gadgetPrice();
		
	}
	

}
