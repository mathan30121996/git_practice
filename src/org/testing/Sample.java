package org.testing;

public class Sample {
	public static void main(String[] args) {
		Employee j = Employee.createObject();
		j.empId();
		j.empName();
		System.out.println(System.identityHashCode(j));
		}
}
