/*
(Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
Exercise 1.10. The formulas for calculating BMI are

Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
body mass index. Also, display the BMI categories and their values from the National Heart Lung
and Blood Institute
http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
so the user can evaluate his/her BMI.
[Note: In this chapter, you learned to use the int type to represent whole numbers. The BMI
calculations when done with int values will both produce whole-number results. In Chapter 3
you’ll learn to use the double type to represent numbers with decimal points. When the BMI calculations are performed with doubles, they’ll both produce numbers with decimal points—these
are called “floating-point” numbers.] 

Author: Czen
*/

package ch02.ex02_33;

import java.util.Scanner;


public class Bmi {

        public static void main (String[] args){
               Scanner input = new Scanner(System.in);

               System.out.printf("Enter weight in kilograms%n: ");
               double weight = input.nextDouble();
               System.out.printf("Enter height in meters%n: ");
               double height = input.nextDouble();
               input.close();

               double bmi = weight / (height * height);

          


               System.out.printf (  "BMI Categories: %n" +
                                    "Underweight = <18.5 %n" +
                                    "Normal weight = 18.5–24.9 %n" +
                                    "Overweight = 25–29.9 %n" +
                                    "Obesity = BMI of 30 or greater %n");
             if(bmi < 18.5)
                 System.out.printf("A %f BMI indicates that the subject is underweight", bmi);
             if(bmi >= 18.5 && bmi <= 24.9)
                 System.out.printf("A %f BMI indicates that the subject is Normalweight", bmi);
             if(bmi >= 25 && bmi <= 29.9 )
                 System.out.printf("A %f BMI indicates that the subject is Overweight", bmi);
             if(bmi >= 30)
                 System.out.printf("A %f BMI indicates that the subject is Obesity", bmi);
        }
}
