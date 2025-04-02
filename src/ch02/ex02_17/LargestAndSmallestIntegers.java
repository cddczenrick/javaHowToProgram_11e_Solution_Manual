/*
 *2.17Write an application that inputs three integers from the
 *user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
 *shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
 *representation of the average. So, if the sum of the values is 7, the average should be 2, not
 *2.3333….]
 *
 * Author: Czenrick Mejia
 */

package ch02.ex02_17;

import java.util.Scanner;

public class LargestAndSmallestIntegers {

       public static void main (String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter first integer: ");
       int int1 = input.nextInt();

       System.out.println("Enter second integer: ");
       int int2 = input.nextInt();         
      
       System.out.println("Enter third integer: ");
       int int3 = input.nextInt();      
       input.close();    
                 
       int sum = int1 + int2 + int3;
       int average = (int1 + int2 + int3)/3;
       int product = int1 * int2 * int3;
         
       //Largest logic flow section  
       int largest = int1; //set int1 to largest by default to setup a logic
       if (int2 > largest) {
       largest = int2;
       }
       if (int3 > largest) {
       largest = int3;
       }
         
       //Smallest logic flow section  
       int smallest = int1; //set int1 to largest by default to setup a logic
       if (int2 < smallest) {
       smallest = int2;
       }
       if (int3 < smallest) {
       smallest = int3;
       }

       System.out.printf("The sum of the integers is %d%n", sum);
       System.out.printf("The average of the integers is %d%n", average);         
       System.out.printf("The product of the integers is %d%n", product);
       System.out.printf("The Smallest of the integers is %d%n", smallest);
       System.out.printf("The Largest of the integers is %d%n", largest);         
    }     
}
