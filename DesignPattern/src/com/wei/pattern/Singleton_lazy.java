package com.wei.pattern;

public class Singleton_lazy {

	private Singleton_lazy() {
		
	}
	
	private static Singleton_lazy singleton_lazy;

	public static Singleton_lazy getSingleton_lazy() {
		if(singleton_lazy == null){
			singleton_lazy = new Singleton_lazy();
		}
		return singleton_lazy;
	}
}
