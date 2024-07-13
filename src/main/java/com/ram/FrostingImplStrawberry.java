package com.ram;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="frosting.type", havingValue="Strawberry")
public class FrostingImplStrawberry implements IFrosting {

	@Override
	public String getFrostingType() {
		return "Frosting type is strawberry";
	}

}
