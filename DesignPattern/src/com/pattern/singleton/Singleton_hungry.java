package com.pattern.singleton;

/**
 *  单例模式：饿汉模式
 */
public class Singleton_hungry {

	private Singleton_hungry(){
		
	}
	
	private static Singleton_hungry singleton_hungry = new Singleton_hungry();

	public static Singleton_hungry getSingleton_hungry() {
		return singleton_hungry;
	}
}
