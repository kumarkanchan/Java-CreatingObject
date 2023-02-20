package com.newInstance;

import java.lang.reflect.Constructor;

public class Mobile {

	// new Operator
	/*
	 * public static void main(String[] args) { Test t = new Test();
	 * System.out.println(t); }
	 */

	// newInstance method - CLASS.newInstance();
	/*
	 * public static void main(String[] args) throws Exception{
	 * 
	 * Mobile t = Mobile.class.newInstance(); System.out.println(t); }
	 */

	// Constructor - newInstance and class.getConstructor()

	public static void main(String[] args) throws Exception {

		Constructor<Mobile> m = Mobile.class.getConstructor();
		Mobile newm = m.newInstance();

		System.out.println(newm);

	}
}
