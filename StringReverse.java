/*Description

Write a recursive method (no loops) which takes a String and reverses it. 
You should call this method reverseString. The method should take a 
String and return the String reversed.

Input = n, where n is a String
Sample Input = Hello
Output = The String reversed
Sample Output = olleH*/

import java.util.Scanner;
public class StringReverse 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        String reverse = reverseString(input);
        System.out.println(reverse);
        sc.close();
    }    

    public static String reverseString(String input)
    {
        if(input.isEmpty() || input.length() == 1)
        {
            return input;
        }
        else
        {
            return reverseString(input.substring(1)) + input.charAt(0);
        }
    }
}
