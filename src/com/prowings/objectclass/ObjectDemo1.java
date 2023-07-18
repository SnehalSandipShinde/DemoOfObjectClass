package com.prowings.objectclass;
//Add comment
public class ObjectDemo1 {
	public static void main(String[] args) {
		Object o = new Object();
		String pkg = o.getClass().getName();
		
		System.out.println(pkg);
		
		Object o1 = new Object();
		Object o3 = new Object();
//		o1 = o3;
		
		System.out.println(o1.equals(o3));
		System.out.println(o1.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o1 == o3);
		
		Object o4 = "name";
		Object o5 = "Name";
		o4 = o5;

		System.out.println(o4.equals(o5));
		System.out.println(o4.hashCode());
		System.out.println(o5.hashCode());
		System.out.println(o4 == o5);
		System.out.println(o1 == o5);
			
	
	}

}
