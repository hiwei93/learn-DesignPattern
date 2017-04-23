package com.pattern.abstractFactory;

public class TrousersByDenim implements DenimMaterial {

	@Override
	public void sayDenim() {
		System.out.println("I'm an pair of trousers made by Denim!");
	}

}
