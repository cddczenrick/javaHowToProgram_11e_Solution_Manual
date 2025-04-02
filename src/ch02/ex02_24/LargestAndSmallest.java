/*
*2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
 *and prints the largest and smallest integers in the group. Use only the programming techniques you
 *learned in this chapter.
 */

package ch02.ex02_24;

import java.util.Scanner;

public class LargestAndSmallest {

       public static void main (String[] args) {
      
       Scanner scanner  = new Scanner(System.in);

       int largest, smallest;
         
       System.out.println("Enter first integer: ");
       int int1 = scanner.nextInt();

       System.out.println("Enter second integer: ");
       int int2 = scanner.nextInt();

       System.out.println("Enter third integer: ");
       int int3 = scanner.nextInt();

       System.out.println("Enter fourh integer: ");
       int int4 = scanner.nextInt();

       System.out.println("Enter fifth integer: ");
       int int5 = scanner.nextInt();

      //Largest
      largest = int1;
      if (int2 > largest){
          largest = int2;
      }
      if (int3 > largest){
          largest = int3;
      }
      if (int4 > largest){
          largest = int4;
      }
      if (int5 > largest){
          largest = int5;
      }

      //Smallest
      smallest = int1;
      if (int2 < smallest){
          largest = int2;
      }
      if (int3 < smallest){
          largest = int3;
      }
      if (int4 < smallest){
          largest = int4;
      }
      if (int5 < smallest){
          largest = int5;
      }

      System.out.printf("%d is the Largest integer %n", largest);
      System.out.printf("%d is the Smallest integer %n", smallest);            
       }

}
