package com.pattern.factoryMethod;

public class ProductFactory {
	
	/**
	 * 静态工厂方法模式
	 */
	public static Product getProductByStatic() {
		return new Car();
	}
	
	/**
	 * 工厂方法模式
	 */
	public Product getProduct(){
		return new Car();
	}
	
}
