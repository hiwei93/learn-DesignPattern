package com.pattern.abstractFactory;

public class ShirtByDenim implements DenimMaterial {

	@Override
	public void sayDenim() {
		System.out.println("I'm a shirt made by Denim");
	}

}
