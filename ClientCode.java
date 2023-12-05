import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Nikita Bazer
 *  Class:          CS30S
 * 
 *  Assignment:     Employee Object Example
 * 
 *  Description:    Example of a simple Employee class 
 *                  and using it to instantiate Employee objects
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
        ProgramInfo pInfo = new ProgramInfo("Employee Object Example");
        //Scanner scanner = new Scanner(System.in);

        // file io buffers for reading and writing to text files
        
        // ***** print banners *****

        System.out.println(pInfo.getBanner());

        // ***** Using the Employee Class *****
        Employee employee1 = new Employee(40, 21.5);
        Employee employee2 = new Employee(20, 17.6);
        Employee employee3 = new Employee(40, 21.5);
        Employee employee4 = new Employee(50, 19.0);

        
        // setters
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println("Employees are equal: " + employee2.equals(employee4));
        System.out.println("Employees are equal: " + employee1.equals(employee3));
        
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
