package com.example.demo;

import org.springframework.stereotype.Service;

@Service

public class Laptop implements Gadgets {
	public int gadgetPrice() {
		return 60000;
	}

}