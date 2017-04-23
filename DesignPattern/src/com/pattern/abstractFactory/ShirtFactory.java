package com.pattern.abstractFactory;

public class ShirtFactory implements ClothesFactory {

	@Override
	public DenimMaterial getDenimMaterial() {
		return new ShirtByDenim();
	}

	@Override
	public CottonMaterial getCottonMaterial() {
		return new ShirtByCotton();
	}

}
