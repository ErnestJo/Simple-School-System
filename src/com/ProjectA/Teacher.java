package com.ProjectA;

public class Teacher {
    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    public Teacher (int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public  void setSalary (double salary){
        this.salary=salary;

    }

    public void receiveSalary(double salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpend(salary);
    }

    @Override
    public String toString() {
        return "Student's name :"+name+"Total fees Paid $" + salaryEarned;
    }
}
