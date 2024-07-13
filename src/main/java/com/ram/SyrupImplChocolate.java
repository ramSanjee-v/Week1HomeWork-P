package com.ram;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrup.type", havingValue="Chocolate")
public class SyrupImplChocolate implements ISyrup{

	@Override
	public String getSyrupType() {
		return "Syrup type is chacolate";
	}

}
