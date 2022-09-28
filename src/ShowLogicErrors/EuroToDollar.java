/*
Name: Felipe Zepeda
Date: 17th Feb 21
Program name: EuroToDollar.java
 */
package ShowLogicErrors;
import java.util.Scanner;
/**
 *
 * @author FRoZeHn
 */
public class EuroToDollar {
    public static void main (String[] args) {
   // System.out.println ("Convert 100 Euro to Dollars");
   // System.out.println (100*1.21);
    Scanner keyboardinput;                    // Create an object of Scanner class
    keyboardinput = new Scanner (System.in);  // Initialise an object by calling a Scanner method
    
    // Message to ask the user for a name
    System.out.println("Can you please provide your name?");
    // Get this  name input
    String name = keyboardinput.nextLine(); // name is a variable of data  type String
            
    System.out.println("Enter the amount in Euro for conversion");
    // Int euros = keyboardinput.nextInt();              // euros is a variable of data type  int
    double euros = keyboardinput.nextDouble();           // euros is a variable of data type  double
    //System.out.println(euros*1.21);
    
    System.out.println(name + " got " + euros * 1.21 + " dollars after conversion");
    }
}    
