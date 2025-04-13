/*
(Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.
Author: Czen
*/

package ch02.ex02_32;

import java.util.Scanner;

public class negativePositiveZero {

        public static void main(String[] args){
               Scanner input = new Scanner(System.in);

               System.out.printf("Enter first digit: %n");
               int num1 = input.nextInt();
               System.out.printf("Enter first digit: %n");
               int num2 = input.nextInt();
               System.out.printf("Enter first digit: %n");
               int num3 = input.nextInt();
               System.out.printf("Enter first digit: %n");
               int num4 = input.nextInt();
               System.out.printf("Enter first digit: %n");
               int num5 = input.nextInt();
               input.close();

               int negative = 0, positive = 0, zeroes = 0;
          
               if(num1 > 0)
               positive++;
               if(num2 > 0)
               positive++;
               if(num3 > 0)
               positive++;
               if(num4 > 0)
               positive++;
               if(num5 > 0)
               positive++;

               if(num1 == 0)
               zeroes++;
               if(num2 == 0)
               zeroes++;
               if(num3 == 0)
               zeroes++;
               if(num4 == 0)
               zeroes++;
               if(num5 == 0)
               zeroes++;

               if(num1 < 0)
               negative++;
               if(num2 < 0)
               negative++;
               if(num3 < 0)
               negative++;
               if(num4 < 0)
               negative++;
               if(num5 < 0)
               negative++;
          
              System.out.printf("The number of zero numbers is/are: %d%n", zeroes);
              System.out.printf("The number of negative numbers is/are: %d%n", negative);
              System.out.printf("The number of negative numbers is/are: %d%n", positive);
        }
}
