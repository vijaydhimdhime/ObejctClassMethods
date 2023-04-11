package com.vijay.objectmethods;


class StringClass{
	String s1;
	public StringClass(String s1) {
		this.s1 = s1;
	}
}


public class equalsMethodForStringORWrapperClass {
	public static void main(String[] args) {
		StringClass sc1 = new StringClass("vijay");
		StringClass sc2 = new StringClass("vijay");
		if(sc1.equals(sc2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("NOT same");
		}
	}
	
}
