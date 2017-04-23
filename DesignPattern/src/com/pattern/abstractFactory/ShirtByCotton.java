package com.pattern.abstractFactory;

public class ShirtByCotton implements CottonMaterial {

	@Override
	public void sayCotton() {
		System.out.println("I'm a shirt made by Cotton");
	}

}
