package com.qingqi.HidingAndOverriding.packageA;

public class Base {
	/**
	 * private methods are implicitly final, so that 
	 * subclass can not override private methods.
	 */
	private void test() {
		System.out.println("Base.test()");
	}
	
	/**
	 * "this" identifier has the type of Base, we can treat
	 * it as a Base reference.
	 */
	public void runTestA() {
		this.test();
	}
	
	public void runTestB() {
		this.test();
	}
}
