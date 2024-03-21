/*Description

Write a Java program, called AsciiDifference that contains a static method 
called difference() that accepts two Strings as the input parameters 
and returns the difference in the sum of ASCII values of the two Strings 
as an integer value. The input parameters should be read in from the user 
in the main method and passed to the difference() method. The main 
method should print returned integer to the screen.

Sample Input = 
    ireland
    IRELAND
Sample Output = 224
Explanation = String s1 = "ireland"; String s2 = "IRELAND"; 
The sum of ASCII Values for s1 = 735 The sum of ASCII Values for s2 = 511 
The difference between s1 and s2 = 224*/

import java.util.Scanner;
public class AsciiDifference 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int result = difference(input1, input2);
        System.out.println(result);
        scanner.close();
    }
    
    public static int difference(String input1, String input2)
    {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < input1.length(); i++)
        {
            sum1 += (int)input1.charAt(i);
        }
        for(int i = 0; i < input2.length(); i++)
        {
            sum2 += (int)input2.charAt(i);
        }
        return Math.abs(sum1 - sum2);
    }   
}
