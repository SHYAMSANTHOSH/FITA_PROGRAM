package com.oops;

public class ClassAndObjectProgram {
	String name;
	String rollno;
	String dept;
	String mark;


	public String getName() {
		return name;
	}
	public String getRollno() {
		return rollno;
	}
	public String getDept() {
		return dept;
	}
	public String getMark() {
		return mark;
	}

	public ClassAndObjectProgram(String rollno, String name, String dept, String mark) {
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
		this.mark = mark;
	}
	
	@Override
    public String toString()
    {
		return("Num -> " + this.getRollno() + " Name -> " + this.getName() + "Dept -> " + this.getDept() + "Mark -> " + this.getMark());
    }
	

	public static void main(String[] args) {
		ClassAndObjectProgram St = new ClassAndObjectProgram("100","Scooby", "Mech", "90");
        System.out.println(St.toString());
	}

}
