/** CMIS141 Homework1
 * Author: Autumn Capasso
 * Date: Jan 18, 2018
 * Prompts user to enter student EMPLID, average 3 test scores,
 * give age in months and temperature in F and C.
 */

// a simple way to handle errors
import java.io.IOException;


// Import scanner class
 import java.util.Scanner;

 public class Homework1 {

     public static void main (String[] args)

   {

         // Declare variables
         int emplid = 0;
         float quiz1 = 0.0f;
         float quiz2 = 0.0f;
         float quiz3 = 0.0f;
         int ageMonths = 0;
         float temp = 0.0f;


         // Use the Scanner class
         Scanner scannerIn = new Scanner(System.in);


         // Use the Scanner class to store variables
         System.out.println("Enter your Student EMPLID (0 - 999999): ");
         emplid = scannerIn.nextInt();
         System.out.println("Enter your quiz1 percentage score (0.0 - 100.0): ");
         quiz1 = scannerIn.nextFloat();
         System.out.println("Enter your quiz2 percentage score (0.0 - 100.0): ");
         quiz2 = scannerIn.nextFloat();
         System.out.println("Enter your quiz3 percentage score (0.0 - 100.0): ");
         quiz3 = scannerIn.nextFloat();
         System.out.println("Enter your age in months (0-1440): ");
         ageMonths = scannerIn.nextInt();
         System.out.println("Enter the current Temperature in degrees Celsius: ");
         temp = scannerIn.nextFloat();



         // Print computed results
         System.out.println("\n*** Thank You ***");
         System.out.println("Student EMPLID: "+emplid);
         System.out.println("Quiz 1 Score: "+quiz1);
         System.out.println("Quiz 2 Score: "+quiz2);
         System.out.println("Quiz 3 Score: "+quiz3);
         System.out.println("Average quiz score: "+(quiz1+quiz2+quiz3)/3);
         System.out.println("Age in months: "+ageMonths);
         System.out.println("Age in years: "+(ageMonths/12));
         System.out.println("Temperature in Celsius: "+temp+"°");
         System.out.println("Temperature in Fahrenheit: "+(temp*1.8+32)+"°");


         // close scanner class
         scannerIn.close();
     }
 }
