package com.wei.test;

import com.wei.pattern.Singleton_hungry;
import com.wei.pattern.Singleton_lazy;

public class test {

	public static void main(String[] args) {

		// 饿汉模式
		Singleton_hungry sh1 = Singleton_hungry.getSingleton_hungry();
		Singleton_hungry sh2 = Singleton_hungry.getSingleton_hungry();
		if(sh1 == sh2){
			System.out.println("sh1与sh2是同一个实例！");
		} else {
			System.out.println("sh1与sh2不是同一个实例！");
		}
		
		// 懒汉模式
		Singleton_lazy sl1 = Singleton_lazy.getSingleton_lazy();
		Singleton_lazy sl2 = Singleton_lazy.getSingleton_lazy();
		if(sl1 == sl2){
			System.out.println("sl1与sl2是同一个实例！");
		} else {
			System.out.println("sl1与sl2不是同一个实例！");
		}
	}

}
