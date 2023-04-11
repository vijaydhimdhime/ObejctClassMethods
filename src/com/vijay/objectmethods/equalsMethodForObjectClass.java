package com.vijay.objectmethods;
								/* equals() method for object class */
		/*it compares the references of two objects */
class myClass{
	int x;
	public myClass(int x) {
		this.x = x;
	}
}

public class equalsMethodForObjectClass {
	public static void main(String[] args) {
		myClass obj1 = new myClass(10);
		myClass obj2 = new myClass(10);
	
		System.out.println(obj1.equals(obj2));				
		if(obj1.equals(obj2)){
			System.out.println("references of bjo1 and obj2 are same");
		}
		else
		{
			System.out.println("references of bjo1 and obj2 are NOT same");
		}
	}
}
