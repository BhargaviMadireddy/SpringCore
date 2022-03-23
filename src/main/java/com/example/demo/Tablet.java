package com.example.demo;
import org.springframework.stereotype.Service;
@Service

public class Tablet implements Gadgets {
	public int gadgetPrice() {
		return 30000;
	}

}