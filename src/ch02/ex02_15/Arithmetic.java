/**
 * 2.15 (Arithmetic) Write an application that asks the user to enter two
 * integers, obtains them from the user and prints the square of each, the sum of their squares,
 * and the difference between the squares. Use the techniques shown in Fig. 2.7.
 * 
 * Author: Czenrick Mejia
 */

package ch02.ex02_15;

import java.util.Scanner;

public class Arithmetic {
       public static void main (String[] args) {
           Scanner input = new Scanner(System.in);

           int input1;
           int input2;
         
           System.out.println("Enter the first integer: ");
           input1 = input.nextInt();

           System.out.println("Enter the second integer: ");
           input2 = input.nextInt();
           input.close();
          
           int square1 = input1 * input1;
           int square2 = input2 * input2;
           int squaresum = square1 + square2;
           int squaredif = square1 - square2;

           System.out.printf("Square of the first input: %d%n", square1);
           System.out.printf("Square of the second input: %d%n", square2);
           System.out.println("Sum is: " + squaresum);
           System.out.println("Difference is: " + squaredif);
           
       }  
}


