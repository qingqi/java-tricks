package com.qingqi.HidingAndOverriding;

import com.qingqi.HidingAndOverriding.packageA.Base;
import com.qingqi.HidingAndOverriding.packageB.Sub;

public class App 
{
    public static void main( String[] args )
    {
        Base base = new Sub();
        base.runTestA(); // output: Sub.test()
        base.runTestB(); // output: Base.test()
        
        /**
         * According to polymorphism, base.runTestA() will run the overridden version
         * of runTestA(). And the overridden version in the Sub execute "this.test()", 
         * where the "this" is a Sub reference, so that it will call Sub.test() which
         * outputs "Sub.test()".
         */
        
        /**
         * However, runTestB() is not overridden, it is inherited. The "this" in statement
         * "this.test()" is a Base reference, however, test() is not overridden, so that
         * it will call Base.test().
         */
        
        /**
         * Conclusions: 
         * 1. "this" is a reference with type the class where it is defined.
         * 2. private methods are implicitly final.
         * 3. Sub class can override the methods which are visible to it.          
         */
    }
}
