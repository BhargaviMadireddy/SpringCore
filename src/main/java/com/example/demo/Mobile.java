package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Mobile implements Gadgets {
	public int gadgetPrice() {
		return 15000;
	}

}
