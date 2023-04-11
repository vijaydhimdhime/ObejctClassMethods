package com.vijay.objectmethods;

public class Student {
	String name;
	String address;
	public Student(String name, String address){
		this.name = name;
		this.address = address;
	}
	public static void main(String[] args) {
		Student s= new Student("vijay", "pune, Indai");
		System.out.println(s.getClass().getName());
		System.out.println(s.getClass());
		System.out.println();
	}
}
