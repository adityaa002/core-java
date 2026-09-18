package com.rays.junit;

import junit.framework.TestSuite;

public class TestAllSuite {

	public static void main(String[] args) {
		
		TestSuite suite = new TestSuite("Test Suite");

		suite.addTestSuite(TestAssertNotNull.class);
		suite.addTestSuite(TestAsseertNull.class);
		junit.textui.TestRunner.run(suite);
		
		
	}

}
