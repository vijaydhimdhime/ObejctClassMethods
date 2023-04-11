package com.vijay.objectmethods;

public class CloneMethod implements Cloneable {
	String name;
	int Id;
	public CloneMethod(String name, int Id) {
		this.name = name;
		this.Id = Id;
	}
	void dispaly(){
		System.out.println("Name : "+name);
		System.out.println("Id   : "+Id);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethod cm1 = new CloneMethod("vijay", 101);
		cm1.dispaly();
		CloneMethod cm2 = (CloneMethod) cm1.clone();
		cm2.dispaly();
		System.out.println(cm1.hashCode());
		System.out.println(cm2.hashCode());
		cm2.name = "kunal";
		cm1.dispaly();
		cm2.dispaly();
	}

}
