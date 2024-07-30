package org.test;

public class EmpDetails {
public EmpDetails() {
	System.out.println("Default constructor");
}
public EmpDetails(int id) {
	System.out.println("int parametarized constructor"+id);
}
public EmpDetails(int age,String name) {
	System.out.println("int and name parametarized constructor"  +age+"\n"+name);
	}
public EmpDetails(String role,int id) {
	System.out.println("int and string parametarized constructor"  +role+"\t"+id);
	}

	public static void main(String[] args) {
		EmpDetails e=new EmpDetails();
		EmpDetails e1=new EmpDetails(888);
		EmpDetails e2=new EmpDetails(33,"laasiya");
		EmpDetails e3=new EmpDetails("tester",897);
		
		
		
	}

}
