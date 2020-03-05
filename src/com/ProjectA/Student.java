package com.ProjectA;

public class Student {
    private  int id;
    private  String name;
    private  int grade;
    private double feesPaid;
    private  double feesTotal;

    /**
     * is to create the object of a new student (constructor )
     */

    public Student(int id, String name,int grade){

        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=1500000;

    }

    // this was created for  student if is promoted in other class
    public void setGrade(int grade){
        this.grade=grade;

    }
    // for incrementing fees that is paid for managment fee
    public void  payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);

    }
 // get the id of the student
    public int getId() {
        return id;
    }
// get the name of the student
    public String getName() {
        return name;
    }
// get the grade of the student
    public int getGrade() {
        return grade;
    }

 //get the feespaid
    public double getFeesPaid() {
        return feesPaid;
    }
// get the feestotal
    public double getFeesTotal() {
        return feesTotal;
    }
// return the remaing fee
    public  double getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+"Total fees Paid $" + feesPaid;
    }
}
