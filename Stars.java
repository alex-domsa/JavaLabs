/*Description

In a class, write a method called printStarTriangle() that accepts 
an integer parameter and returns nothing. 
This method should print to the screen rows of asterisk characters 
that form the shape of a triangle. The amount of rows is based on the 
value of the integer parameter. The first row should start with one * and 
increment by one * for each row there after.

For example, if the parameter held the value 3 the method would print:

    *
    **
    ***

In the main method you should call the method with a user 
inputted integer being passed into printStarTriangle().

Sample Input = 3
Sample Output =

    *
    **
    ***    */

import java.util.Scanner;
public class Stars 
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        printStarTriangle(rows);
        scanner.close();
    }
    
    public static void printStarTriangle(int rows)
    {
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
