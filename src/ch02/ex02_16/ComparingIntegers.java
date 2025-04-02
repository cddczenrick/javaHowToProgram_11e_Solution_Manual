/*
 *2.16 (Comparing Integers) Write an application that asks the user to enter
 * two integers, obtains them from the user and displays whether the number 
 and its square are greater than, equal to, not equal to, or less than the number 100.
 *
 * Autor: Czenrick Mejia
 */

package ch02.ex02_16;

import java.util.Scanner;

public class ComparingIntegers {

       public static void main (String[] args) {
              Scanner input = new Scanner(System.in);
             
              System.out.println("Enter first integer: ");
              int input1 = input.nextInt();
     
              System.out.println("Enter second integer: ");
              int input2 = input.nextInt();
              input.close();

             //Greater than section
              if ( input1 > 100 ) {
               System.out.printf("%d is greater than 100 %n", input1);
              }
              if ( (input1*input1) > 100) {
               System.out.printf("%d is greater than 100 %n", input1*input1);
              }
              if ( input2 > 100) {
               System.out.printf("%d is greater than 100 %n", input2);
              }
              if ( (input2*input2) > 100) {
               System.out.printf("%d is greater than 100 %n", input2*input2);
              }
              
             //Equal to section
              System.out.println(" ");
              if ( input1 = 100 ) {
               System.out.printf("%d is equal to 100 %n", input1);
              }
              if ( (input1*input1) = 100) {
               System.out.printf("%d is equal to 100 %n", input1*input1);
              }
              if ( input2 = 100) {
               System.out.printf("%d equal to 100 %n", input2);
              }
              if ( (input2*input2) = 100) {
               System.out.printf("%d equal to 100 %n", input2*input2);
              } 

             //Less than section
              System.out.println(" ");
              if ( input1 < 100 ) {
               System.out.printf("%d is less than 100 %n", input1);
              }
              if ( (input1*input1) < 100) {
               System.out.printf("%d is less than 100 %n", input1*input1);
              }
              if ( input2 < 100) {
               System.out.printf("%d is less than 100 %n", input2);
              }
              if ( (input2*input2) < 100) {
               System.out.printf("%d is less than 100 %n", input2*input2);
              }

             //Not equal to than section
              System.out.println(" ");
              if ( input1 < 100 ) {
               System.out.printf("%d is not equal to 100 %n", input1);
              }
              if ( (input1*input1) < 100) {
               System.out.printf("%d is not equal to100 %n", input1*input1);
              }
              if ( input2 < 100) {
               System.out.printf("%d is not equal to 100 %n", input2);
              }
              if ( (input2*input2) < 100) {
               System.out.printf("%d is not equal to 100 %n", input2*input2);
              }  
       }
      

}
