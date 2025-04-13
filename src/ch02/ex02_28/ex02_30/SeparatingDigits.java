/*
(Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print
Assume that the user enters the correct number of digits. What happens when you enter a
number with more than five digits? What happens when you enter a number with fewer than five
digits? [Hint: It’s possible to do this exercise with the techniques you learned in 

Author: Czen
*/

import java.util.Scanner;

public class SeparatingDigits {

        public static void main (String[] args){
                Scanner scanner = new Scanner (System.in);

                System.out.println("Enter 5 digit number: ");
                int fivedigit = scanner.nextInt();
                scanner.close();


                int dig1 = fivedigit % 10;
                fivedigit /= 10;
                int dig2 = fivedigit % 10;
                fivedigit /= 10;                
                int dig3 = fivedigit % 10;
                fivedigit /= 10;
                int dig4 = fivedigit % 10;
                fivedigit /= 10;
                int dig5 = fivedigit % 10;
                fivedigit /= 10;

                System.out.printf("%d   %d   %d   %d   %d%n", dig5, dig4, dig3, dig2, dig1);
        }
}
