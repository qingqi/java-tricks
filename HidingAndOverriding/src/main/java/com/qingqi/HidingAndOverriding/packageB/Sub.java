package com.qingqi.HidingAndOverriding.packageB;

import com.qingqi.HidingAndOverriding.packageA.Base;

public class Sub extends Base{
	
	/**
	 * This method doesn't override the method Base.test(), 
	 * since Base.test() is private and implicitly final. 
	 * Conceptually, we can think it hides the Base.test() method.
	 * However, the Sub class should not even be aware of the private
	 * Base.test() method.
	 */
	public void test() {
		System.out.println("Sub.test()");
	}

	/**
	 * This method override the method Base.runTestA(), since
	 * Base.test() is public.
	 */
	public void runTestA() {
		this.test();
	}
	
	/**
	 * We do not define runTestB() in Sub, so that Sub will inherit
	 * from Base the method Base.runTestB().
	 */
}
