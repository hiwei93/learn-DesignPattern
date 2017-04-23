package com.pattern.factoryMethod;

public class FactoryMethodClient {

	public static void main(String[] args) {
		
		/**
		 * 静态方法模式
		 */
		Product carStaticProduct = ProductFactory.getProductByStatic();
		carStaticProduct.say();
		
		
		/**
		 * 工厂方法模式
		 */
//		ProductFactory pFactory = new ProductFactory();
//		Product carProduct = pFactory.getProduct();
//		carProduct.say();
	}

}
