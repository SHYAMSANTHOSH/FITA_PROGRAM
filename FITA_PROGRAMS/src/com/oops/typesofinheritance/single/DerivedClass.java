package com.oops.typesofinheritance.single;

public class DerivedClass extends ParentClass{
	int x1 =x;
	String n1 = name;
	
	public void displayDerived(int n1) {
		this.x1 = n1;
		System.out.println("Completed");
	}
	public static void main(String[] args) {
		DerivedClass de = new DerivedClass();
		de.displayall(111234, "MAPPIN", 100);
		de.displayDerived(100);
		de.display(10, "Success");
		
		ParentClass d1 = new ParentClass();
		d1.display(10, "XYZ");
		d1.displayall(1000, "XYZWER", 99);
		
	}

}
