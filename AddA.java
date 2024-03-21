/*Write a recursive method (no loops) called moreAs, 
which takes a String.The method should add in 2 more a’s 
every time an ‘a’ is found in the String.

Sample Input 1 = catalogue
Sample Output 1 = caaataaalogue
Sample Input 2 = anagram
Sample Output 2 = aaanaaagraaam*/

import java.util.Scanner;
public class AddA 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = moreAs(input);
        System.out.println(result);
        scanner.close();
    }
    
    public static String moreAs(String input)
    {
        if(input.length() == 0)
        {
            return "";
        }
        else
        {
            if(input.charAt(0) == 'a')
            {
                return "aaa" + moreAs(input.substring(1));
            }
            else
            {
                return input.charAt(0) + moreAs(input.substring(1));
            }
        }
    }
}
