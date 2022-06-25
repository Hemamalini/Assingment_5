package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName(){System.out.println("studentName");}
	public void studentDept() {System.out.println("studentDept");}
	public void studentId() {System.out.println("studentId");}
	public static void main(String[] args) {
		Student studentObject = new Student();
		studentObject.studentName();
		studentObject.studentDept();
		studentObject.studentId();
		studentObject.deptName();
		studentObject.collegeCode();
		studentObject.collegeName();
		studentObject.collegeRank();
	}
}
//create above 3 class and call all your class methods into the Student using multilevel inheritance.