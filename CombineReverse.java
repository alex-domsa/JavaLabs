/*Description

Write a Java program, called CombineReverse that contains a static method 
called combine() that accepts a single non-negative integer as its parameter 
and returns the long integer combined with the integer in reverse. The input 
parameter should be read in from the user in the main method and passed to the 
combine() method. The main method should print the combined integer to the
screen. If the input is negative an error message should print to the screen 
stating “Not a valid entry!”

Sample Input = 427
Sample Output = 427724*/

import java.util.Scanner;   
public class CombineReverse 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input < 0)
        {
            System.out.println("Not a valid entry!");
        }
        else
        {
            long result = combine(input);
            System.out.println(result);
        }
        scanner.close();
    }

    public static long combine(int input)
    {
        String inputString = Integer.toString(input);
        String reverseString = new StringBuilder(inputString).reverse().toString();
        String combinedString = inputString + reverseString;
        long result = Long.parseLong(combinedString);
        return result;
    }
}
