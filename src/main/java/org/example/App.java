
package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 22 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used
        int firstN;
        int secondN;
        int thirdN;


        System.out.print("Enter the first number: ");
        firstN = userInput.nextInt();
        System.out.print("Enter the second number: ");
        secondN = userInput.nextInt();
        System.out.print("Enter the third number: ");
        thirdN = userInput.nextInt();

        //repeated values
        if(firstN == secondN || secondN == thirdN || thirdN == firstN){
            System.out.print("All numbers need to be different.");
        }
        //first value is biggest
        else if (firstN < secondN && secondN > thirdN){
            System.out.print("The largest number is " + secondN + ".");
        }
        //second value is biggest
        else if (secondN < firstN && firstN > thirdN){
            System.out.print("The largest number is " + firstN + ".");
        }
        //third value is biggest
        else if (secondN < thirdN && thirdN > firstN){
            System.out.print("The largest number is " + thirdN + ".");
        }
    }
}