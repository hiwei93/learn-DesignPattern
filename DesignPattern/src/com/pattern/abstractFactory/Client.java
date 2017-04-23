package com.pattern.abstractFactory;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		client.produceShirt("Cotton");
		client.produceTrousers("Denim");
	}
	
	public void produceShirt(String material) {
		ClothesFactory clothesFactory = new ShirtFactory();
		if ("Cotton".equals(material)) {
			clothesFactory.getCottonMaterial().sayCotton(); 
		} else if ("Denim".equals(material)){
			clothesFactory.getDenimMaterial().sayDenim();
		} else {
			System.out.println("请选择材质！");
		}
	}
	
	public void produceTrousers(String material) {
		ClothesFactory clothesFactory = new TrousersFactory();
		if ("Cotton".equals(material)) {
			clothesFactory.getCottonMaterial().sayCotton(); 
		} else if ("Denim".equals(material)){
			clothesFactory.getDenimMaterial().sayDenim();
		} else {
			System.out.println("请选择材质！");
		}
	}
}
