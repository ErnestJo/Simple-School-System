package com.ProjectA;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private  static double totalMoneySpend;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpend=0;
    }

    // return the list of the teacher
    public List<Teacher> getTeacher() {
        return teachers;
    }
// add a new teacher in our school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    //return the list of the  student
    public List<Student> getStudent() {
        return students;
    }
//add a new student in our school
    public void addStudent(Student student) {
        students.add(student);
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(double MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public double getTotalMoneySpend() {
        return totalMoneySpend;
    }

    public   static void updateTotalMoneySpend(double moneySpend) {
        totalMoneyEarned -= moneySpend;
    }
}
