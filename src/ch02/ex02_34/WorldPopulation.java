/*
(World Population Growth Calculator) Search the Internet to determine the current world
population and the annual world population growth rate. Write an application that inputs these values, 
then displays the estimated world population after one, two, three, four and five years. 

Author: Czen
*/

package ch02.ex02_34;

import java.util.Scanner;

public class WorldPopulation {

        public static void main (String[] args){
                Scanner input = new Scanner(System.in);


                int population; //8_216_643_283 Current World population April 13, 2025
                double growth; //0.92 is the current growth rate
                System.out.println("Current world population: %d", population);
                int currentyear = 2025;

                System.out.printf("Enter current world population: %n");
                population = input.nextInt();
                System.out.printf("Enter annual world growth rate: %n");
                growth = input.nextdouble();
                input.close();

                growth /= 100;
                //Currentyear
                System.out.printf("%d population - %d%n", currentyear, population);
               //after one year
                curentyear++;
                population = population + (population * growth);
                System.out.printf("%d population - %d%n", currentyear, population);
               //after two years
                curentyear++;
                population = population + (population * growth);
                System.out.printf("%d population - %d%n", currentyear, population);
               //after three years
                curentyear++;
                population = population + (population * growth);
                System.out.printf("%d population - %d%n", currentyear, population);
               //after four years
                curentyear++;
                population = population + (population * growth);
                System.out.printf("%d population - %d%n", currentyear, population);
               //after 5 years
                curentyear++;
                population = population + (population * growth);
                System.out.printf("%d population - %d%n", currentyear, population);
        }
}

