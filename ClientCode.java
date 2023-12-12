import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Nikita Bazer
 *  Class:          CS30S
 * 
 *  Assignment:     Employee Assingment
 * 
 *  Description:    Assingment 2 calculating wages with OOP
 * 
 *************************************************************/

public class ClientCode {
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    final static String delim = "[ ]+";          // delimiter for splitting input records

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system

        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo();
        //Scanner scanner = new Scanner(System.in);

        // file io buffers for reading and writing to text files

        // ***** print banners *****

        System.out.println(pInfo.getBanner());

        // ***** Using the Employee Class *****
        Employee employee1 = new Employee(48, 22.4);    //create employee one
        Employee employee2 = new Employee(27, 17.6);    //create employee two
        Employee employee3 = new Employee(40, 29.12);   //create employee three
        Employee employee4 = new Employee(51, 19.0);    //create employee four


        // setters
        System.out.println(employee1.toString()); // print employee one
        System.out.println(employee2.toString()); // print employee two
        System.out.println(employee3.toString()); // print employee three
        System.out.println(employee4.toString()); // print employee four
        System.out.println("Employees are equal: " + employee2.equals(employee4)); // check and print if employee 2 is equal to employee 4
        System.out.println("Employees are equal: " + employee1.equals(employee3)); // check and print if employee 1 is equal to employee 2

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate