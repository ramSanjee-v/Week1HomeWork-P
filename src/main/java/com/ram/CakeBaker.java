package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CakeBaker {
	@Autowired
	IFrosting ifr;
	@Autowired
	ISyrup isr;
	
	void bakeCake() {
		System.out.println("The baked cake has forsting type: "+ifr.getFrostingType()+
				" and syrup type:: "+ isr.getSyrupType());
		
	}

}
