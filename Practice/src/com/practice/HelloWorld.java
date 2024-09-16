package com.practice;

public class HelloWorld {
	
	static boolean bb;
	static int num;	
	static float flo;
	static double d;
	static char c;
	final static String ss;
	
	{
		System.out.println("Hello");
	}
	static {
		ss = "shankar";
		System.out.println(ss);
	}
	
	public static void main(String[] args) {
		System.out.println("world");
//		HelloWorld h = new HelloWorld();
		System.out.println(bb);
		System.out.println(num);
		System.out.println(flo);
		System.out.println(d);
		System.out.println(c);
		System.out.println(ss);
		char ch = 'G';
		String str = "Deepak";
		byte b= 126;
		short s = 1024;
		int i = 123456;
		long l = 1234567890;
		
		float f = 10.4f;
		double d = 1234.2d;
		 
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		System.out.println(str);
		System.out.println("hello Shankar "+ch);
	}
	private void print() {
		// TODO Auto-generated method stub

	}
}
