/*Programmer name:      Myron J Moss II
Project name:           Project 2
Course, Day and time:   CIS1500, Monday 6 pm
Date of completion:     6/15/2020
Purpose:		        This application takes height and weight from user and calculates the Body Mass Index.
*/

import java.util.Scanner;

public class BMI {

    private static Scanner scanner = new Scanner(System.in); //takes in User Input

    public static void main(String[] args) {

        printBMIHeader(); //Prints BMI index

        System.out.println("Enter weight in pounds: ");
        float weight = (float) scanner.nextDouble(); //stores user data for weight
        System.out.println("Enter height in inches: ");
        float height = (float) scanner.nextDouble(); // stores user data for height

        calculateWeight(weight); //stores weight in pounds
        calculateHeight(height); //stores height in inches
        System.out.printf("BMI: " + "%.2f",calculateBMI(weight,height)); // prints final solution of calculated BMI
    }

    public static float calculateWeight(float pounds){
        float weight = pounds * 703;
        return weight;
    }//end of weight calculator

    public static float calculateHeight(float inches){
        float height = (float) Math.pow(inches,2);
        return height;
    }//end of height calculator

    public static float calculateBMI(float weight, float height){
        return calculateWeight(weight) / calculateHeight(height);
    }//end of BMI calculator

    public static void printBMIHeader() {
        System.out.println("BMI VALUES");
        System.out.println("Underweight: \tless than 18.5");
        System.out.println("Normal:\t\t\tbetween 18.5 and 24.9");
        System.out.println("Overweight:\t\tbetween 25 and 29.9");
        System.out.println("Obese:\t\t\t30 or greater");
    }//end of print header method

}// end of class
