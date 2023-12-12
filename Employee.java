/********************************************************************
 * Programmer:    Nikita Bazer
 * Class:  CS30S
 *
 * Assignment: Employee Object Assingment
 *
 * Description: using getters and setters for the employee assingment
 ***********************************************************************/

// import libraries as needed here

import java.text.NumberFormat;

public class Employee {
    //*** Class Variables ***

    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    // a dollar sign character to add infront of wage and income
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    private static int nextID = 1000;        // unique id number for each circle
    private final double otMultiplier = 1.5; // multiplier to find overtime pay
    private final int normalHours = 40;      // normal work week hours

    //*** Instance Variables ***

    private int id;
    private int hours;
    private double wage;
    private double regPay;
    private double otPay;
    private double grossPay;

    //*** Constructors ***

    public Employee(){
        this.id = getNextID();
        this.hours = 0;
        this.wage = 0.0;
    }// end no arg

    public Employee(int hours, double wage){
        this.id = getNextID();
        this.hours = hours;
        this.wage = wage;
    }// end employee

    private int getNextID(){
        return nextID++;// get the next id of an employee
    }// end get unique id

    //*** Getters ***
    public int getID(){
        return this.id;// get the id of an employee
    }// end get id

    public int getHours(){
        return this.hours;// get the hours of an employee
    }// end get hours

    public double getWage(){
        return this.wage;// get the wage of an employee
    }// end set regular pay

    //*** Setters ***
    public void setHours(int newHours){
        hours = newHours;// set the number of hours worked
    }// end set hours

    public void setWage(double newWage){
        this.wage = newWage;// set the wage of the employee
    }// end set regular pay

    // *** utility methods ***
    public double getRegPay(){
        regPay = 0;// set regular pay to zero
        if (this.hours > normalHours) {// if for checking if there is more than 40 hours worked
            regPay = this.wage * normalHours;// calculate pay if more than 40 hours are worked
        }// end if 
        else {
            regPay = this.wage * this.hours;// calculate pay if 40 or less hours are worked
        }// end else
        return regPay;
    }// end get regular pay

    public double getOtPay(){
        if (this.hours > normalHours) {// check if more than 40 hours are worked
            this.otPay = (this.hours - normalHours) * (this.wage * otMultiplier);// calculate over time pay if more than 40 hours are worked
        }// end if 
        else {
            this.otPay = 0;// else if no over time pay is needed
        }// end else
        return otPay;
    }// end get overtime pay

    public double getGrossPay(){
        grossPay = getOtPay() + getRegPay();// calculate gross pay of an employee
        return grossPay;
    }// end get gross pay

    //*** Override methods ***
    boolean equals(Employee oc){
        boolean equal;

        equal = this.getGrossPay() == oc.getGrossPay();// method to check if 2 employees are equal in gross pay

        return equal;
    }// end equals

    @Override
    public String toString(){
        String st;

        st = "Employee ID: " + this.getID() + nl;
        st += "Wage: " + currency.format(this.wage) + nl;
        st += "Regular Pay: " + currency.format(getRegPay()) + nl;
        st += "Overtime Pay: " + currency.format(getOtPay()) + nl;
        st += "Gross Pay: " + currency.format(getGrossPay()) + nl;
        return st;
    }// end to string

} // end of public class
