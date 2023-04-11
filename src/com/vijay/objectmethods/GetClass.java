package com.vijay.objectmethods;

public class GetClass {
	public static void main(String[] args) {
	GetClass g = new GetClass();
	System.out.println(g.getClass());
	System.out.println(g.getClass().toString());
	String str = new String();
	System.out.println(str.getClass());
	//Student s1= new Student("ABC", "pune");
	//System.out.println(s1.getClass());
	HashCode h = new HashCode();
	System.out.println(h.getClass());
	System.out.println(Object.class);
	Object obj = new Object();
	System.out.println(obj.getClass());
	System.out.println(GetClass.class);
	
	
	Student s1= new Student("ABC", "pune");
	Student s2= s1;
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s1));
	System.out.println(s1.toString());
	 String s=50+30+"Sachin"+40+40;
	   System.out.println(s);//80Sachin4040
	
	
	
	}

}
