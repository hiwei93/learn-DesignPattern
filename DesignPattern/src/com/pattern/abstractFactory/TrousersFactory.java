package com.pattern.abstractFactory;

public class TrousersFactory implements ClothesFactory{

	@Override
	public DenimMaterial getDenimMaterial() {
		return new TrousersByDenim();
	}

	@Override
	public CottonMaterial getCottonMaterial() {
		return new TrousersByCotton();
	}

}
