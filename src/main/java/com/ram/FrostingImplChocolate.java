package com.ram;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="frosting.type", havingValue="Chocolate")
public class FrostingImplChocolate implements IFrosting {

	@Override
	public String getFrostingType() {
		return "Frosting type is chacolate";
	}

}
