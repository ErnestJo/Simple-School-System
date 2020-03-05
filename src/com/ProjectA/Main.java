package com.ProjectA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Teacher Ernest = new Teacher(1,"Ernest",800000);
	Teacher Namang = new Teacher(2,"Namang",800000);
	Teacher Kitori = new Teacher(3,"Kitori",800000);

	List<Teacher> teacherList = new ArrayList<>();
	    teacherList.add(Ernest);
	    teacherList.add(Namang);
	    teacherList.add(Kitori);

	Student Anorld = new Student(1,"Anorld mwashely",5);
	Student Maquiz = new Student(2,"Maquiz",7);
	Student Mchina = new Student(3,"chizon Hang",4);

	List<Student> studentList = new ArrayList<>();
	    studentList.add(Anorld);
	    studentList.add(Maquiz);
	    studentList.add(Mchina);


	    School Nzallawahe = new School(teacherList,studentList);



	    Anorld.payFees(900000);
	    Maquiz.payFees(1500000);
	    Mchina.payFees(1000000);
        System.out.println("Nzallawhe has Earned: $" + Nzallawahe.getTotalMoneyEarned());

        System.out.println("*------* MAKING NZALLAWAHE SALARY *-------*");

        Ernest.receiveSalary(Ernest.getSalary());
        Namang.receiveSalary(Namang.getSalary());
        Kitori.receiveSalary(Kitori.getSalary());
        System.out.println("Nzallawahe has spend for Salary  and now have " + Nzallawahe.getTotalMoneyEarned());

		System.out.println(Maquiz);

    }
}
