package com.ram;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrup.type", havingValue="Strawberry")
public class SyrupImplStrawberry implements ISyrup{

	@Override
	public String getSyrupType() {
		return "Syrup type is strawberry";
	}

}
