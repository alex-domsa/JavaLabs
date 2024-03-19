/*Description

Write a static method called determineSize() that accepts two doubles.
The method should print a message to the screen that states 
which number is the smallest, which is the biggest or that they are the same number. 
Test the method by calling it from the main method using user input.

Sample Input 1 = 3.5, 9.8

Sample Output 1 = 
Largest = 9.8
Smallest = 3.5

Sample Input 2 = 3.5, 3.5

Sample Output 2 = Numbers are the same.*/

import java.util.Scanner;
public class DoubleSize 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 decimal numbers: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        determineSize(x, y);
        scanner.close();
    }
    
    public static void determineSize(double x, double y)
    {
        if(x > y)
        {
            System.out.println("Largest = " + x);
            System.out.println("Smallest = " + y);
        }
        else if(x < y)
        {
            System.out.println("Largest = " + y);
            System.out.println("Smallest = " + x);
        }
        else
        {
            System.out.println("Numbers are the same.");
        }
    }
}
