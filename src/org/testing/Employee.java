package org.testing;

public class Employee {
	
	public static Employee e;
	
	private Employee() {
		
	}
	public static Employee createObject() {
		if (e==null) {
			e = new Employee();
		}
		return e;
	}
	public void empId() {
		System.out.println("123456");
		
	}
	public void empName() {
		System.out.println("Mathan");
	}
//	public static void main(String[] args) {
//
//		createObject();
//		e.empId();
//		e.empName();
//		System.out.println(System.identityHashCode(e));
//	}
	
                           
}
