/********************************************************************
 * Programmer:    Nikita Bazer
 * Class:  CS30S
 *
 * Assignment: Employee Object Example
 *
 * Description: Employee class to define fields adn behaviours
 *              of a Employee object
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
    
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    private static int nextID = 1000;        // unique id number for each circle
    
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
        return nextID++;
    }// end get unique id
    
    //*** Getters ***
    public int getID(){
        return this.id;
    }// end get id
    
      public int getHours(){
        return this.hours;
    }// end get hours
    
       public double getWage(){
        return this.wage;
    }// end set regular pay
    
    //*** Setters ***
    public void setHours(int newHours){
        hours = newHours-40;
    }// end set hours
    
    public void setWage(double newWage){
        this.wage = newWage; 
    }// end set regular pay
    
    // *** utility methods ***
    
    private double getRegPay(){
        regPay = this.wage * this.hours;
        return regPay;
    }// end get regular pay
    
    public double getOtPay(){
        this.otPay = this.wage * 1.5;
        otPay = this.otPay * hours;
        return otPay;
    }// end get overtime pay
    
    public double getGrossPay(){
        grossPay = otPay + regPay;
        return grossPay;
    }// end get gross pay
    
    //*** Override methods ***
    boolean equals(Employee oc){
        boolean equal;
        
        equal = this.getGrossPay() == oc.getGrossPay();
        
        return equal;
    }// end equals
    
    @Override
    public String toString(){
       String st;
       
       st = "Employee ID: " + this.getID() + nl;
       st += "Wage: " + this.wage + nl;
       st += "Regular Pay: " + getRegPay() + nl;
       st += "Overtime Pay: " + getOtPay() + nl;
       st += "Gross Pay: " + getGrossPay() + nl;
       return st;
    }// end to string
    
} // end of public class
