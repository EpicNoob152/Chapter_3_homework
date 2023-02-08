/**
 * Class: BMI
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: February 8, 2023
 * @Description: This Code tries to calculate the BMI and then categorize into groups
 */

import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    //This code wants you to input both the weight and height.
        System.out.println("Please input your weight(in pounds): ");
        double weight = input.nextDouble();
        System.out.println("Please input your height(in inches): ");
        double inches =  input.nextDouble();
    //This code tries to calculate BMI using the following formulas.
       double kilograms = weight * 0.4536;
       double meters = inches * 0.0254;
       double bmi = (kilograms) / (meters * meters);
    //This code tries to put the BMI into different groups.
       if (bmi < 18.5){
           System.out.println("Your BMI is: " + bmi + " ,therefore you are underweight.");
        }
       if (18.5 <=bmi && bmi < 25.0){
           System.out.println("Your BMI is: " + bmi + " ,therefore you are normal weight.");
        }
       if (25.0 <=bmi && bmi < 30.0){
           System.out.println("Your BMI is: " + bmi + " ,therefore you are over weight.");
        }
       if (bmi >= 30.0){
           System.out.println("Your BMI is: " + bmi + " ,therefore you are obese.");
        }
    }

}
