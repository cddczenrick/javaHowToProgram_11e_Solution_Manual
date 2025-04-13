/*
*2.26 (Multiples) Write an application that reads two integers, determines whether the first
*number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
*remainder operator.]

Author: Czen
*/


package ch02.ex02_26;


/*
*2.26 (Multiples) Write an application that reads two integers, determines whether the first
*number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
*remainder operator.]

Author: Czen
*/


package ch02.ex02_26;


import.java.util.Scanner;


public class Multiples {

        public static void main (String[] args) {
               Scanner input = new Scanner(System.in);

               int int1;
               int int2;
               int thripled;
               int doubled;

               System.out.println("Please enter first number: ");
               int1 = input.nextInt();
               System.out.println("Please enter second number: ");
               int2 = input.nextInt();
               input.close();

               thripled = int1 * 3;
               doubled = int2 * 2;

               if(thripled % doubled == 0){
                 System.out.println("The first number tripled is a multiple of the second number doubled");

               }
               else() {
                 System.out.println("The first number tripled is NOT a multiple of the second number doubled");
               }
        }
        
}
