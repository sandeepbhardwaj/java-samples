package com.koko.java8;

public class DefaultInterfaceExample implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface1.log("abc");
	}

	public static void main(String[] args) {
		//new DefaultInterfaceExample().log("xyz");
	}
}