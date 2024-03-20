/*Description

Given a String x, a substring m from x and a number n, write a recursive 
method (no loops) to check if at least n copies of the substring m appear 
in the String x. You should call your method checkForSub. checkForSub 
should take in 2 Strings and an Integer value and return a Boolean.

For Example:
checkForSub("catcowcat", "cat", 2) -> true
checkForSub("catcowcat", "cow", 2) -> false
checkForSub("catcowcat", "cow", 1) -> true

Input = x, m, n, where x and m are Strings, n is an Integer
Sample Input = catcowcat cat 2
Output = A Boolean value
Sample Output = true*/

import java.util.Scanner;   
public class FindSubStrings 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        System.out.println("Enter the substring: ");
        String subInput = scanner.nextLine();
        System.out.println("Enter the number of times the substring should appear: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean result = checkForSub(input, subInput, num);
        System.out.println(result);
    }    

    public static boolean checkForSub(String input, String subInput, int num)
    {
        if(num == 0)
        {
            return true;
        }
        if(input.isEmpty())
        {
            return false;
        }
        if(input.startsWith(subInput))
        {
            return checkForSub(input.substring(subInput.length()), subInput, num - 1);
        }
        else
        {
            return checkForSub(input.substring(1), subInput, num);
        }   
    }
}
