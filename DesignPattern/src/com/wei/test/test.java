package com.wei.test;

import com.wei.pattern.Singleton_hungry;
import com.wei.pattern.Singleton_lazy;

public class test {

	public static void main(String[] args) {

		// ����ģʽ
		Singleton_hungry sh1 = Singleton_hungry.getSingleton_hungry();
		Singleton_hungry sh2 = Singleton_hungry.getSingleton_hungry();
		if(sh1 == sh2){
			System.out.println("sh1��sh2��ͬһ��ʵ����");
		} else {
			System.out.println("sh1��sh2����ͬһ��ʵ����");
		}
		
		// ����ģʽ
		Singleton_lazy sl1 = Singleton_lazy.getSingleton_lazy();
		Singleton_lazy sl2 = Singleton_lazy.getSingleton_lazy();
		if(sl1 == sl2){
			System.out.println("sl1��sl2��ͬһ��ʵ����");
		} else {
			System.out.println("sl1��sl2����ͬһ��ʵ����");
		}
	}

}
