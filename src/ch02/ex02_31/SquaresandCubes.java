/*
(Table of Squares and Cubes) Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in table format, as shown below. 

number square cube
0 0 0
1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
6 36 216
7 49 343
8 64 512
9 81 729
10 100 1000

Author: Czen

*/

public class SquaresAndCubes {

        public static void main (String[] args){

          int number = 0;
          int square = number * number;
          int cube = number * number * number;

          System.out.printf("%-10s %-10s %-10s%n", "Number","Square", "Cube");
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
          number += 1;
          System.out.printf("%-10d %-10d %-10d%n", number, number * number, number * number * number);
        }
  
}
