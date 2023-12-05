import java.text.NumberFormat;
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
    // a dollar sign character to add infront of wage and income
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    private static int nextID = 1000;        // unique id number for each circle
    private final double otMultiplier = 1.5;
    private final int normalHours = 40;
    
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
        hours = newHours;
    }// end set hours
    
    public void setWage(double newWage){
        this.wage = newWage; 
    }// end set regular pay
    
    // *** utility methods ***
    
    private double getRegPay(){
        regPay = 0;
        if (this.hours > normalHours) {
            regPay = this.wage * normalHours;
        } else {
            regPay = this.wage * this.hours;
        }
        return regPay;
    }// end get regular pay
    
    public double getOtPay(){
        if (this.hours > normalHours) {
            this.otPay = (this.hours - normalHours) * (this.wage * otMultiplier);
        } else {
            this.otPay = 0;
        }
        return otPay;
    }// end get overtime pay
    
    public double getGrossPay(){
        grossPay = getOtPay() + getRegPay();
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
       st += "Wage: " + currency.format(this.wage) + nl;
       st += "Regular Pay: " + currency.format(getRegPay()) + nl;
       st += "Overtime Pay: " + currency.format(getOtPay()) + nl;
       st += "Gross Pay: " + currency.format(getGrossPay()) + nl;
       return st;
    }// end to string
    
} // end of public class
