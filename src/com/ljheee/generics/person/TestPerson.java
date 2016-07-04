package com.ljheee.generics.person;

public class TestPerson {

	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.print();
		
		Person student = new Student();
		if(student instanceof Student){
			Student s = (Student)student;
			s.print();
		}

	}

}
