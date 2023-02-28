package org.client;

public class Test {
	private  Test test;
	
	public Test getTest() {
		
		if(test==null) {
			return test=new Test();
		}else {
			return test;
		}
	}

	public static void main(String[] args) {
		Test tests =new Test();
		System.out.println(System.identityHashCode(tests));
	
		Test test1 =tests.getTest();
		
		System.out.println(System.identityHashCode(test1));
		Test test2 = tests.getTest();
		System.out.println(System.identityHashCode(test2));
		Test t =new Test();
		System.out.println(System.identityHashCode(t));
		Test test3 = t.getTest();
		System.out.println(System.identityHashCode(test3));
		Test test4 = t.getTest();
		System.out.println(System.identityHashCode(test4));
		Test test5 = tests.getTest();
		System.out.println(System.identityHashCode(test5));
		
	}

}
