/**
 * Class: Triangle
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: February 8, 2023
 * @Description: This Code tries to calculate the perimeter of the triangle.
 */
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        //Code that lets you input data
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the First edge: ");
        double edge1 = input.nextDouble();

        System.out.println("Please input the Second edge: ");
        double edge2 = input.nextDouble();

        System.out.println("Please input the Third edge (CANNOT be more than the last 2 edges added together): ");
        double edge3 = input.nextDouble();
        //Formula for perimeter
         double perimeter = edge1 + edge2 + edge3;
        //If the sum of the first two edges is smaller than the third one than it will show up as an error
         if (edge1 + edge2 < edge3 ) {
             System.out.println("Invalid");
         }
         else {
             System.out.println("The perimeter of this triangle is: " + perimeter);
         }
    }
}