/*Description

Write a Java program, called FiveOrMore that takes a String as user 
input. The program should then reverse every word in the String that 
has a length greater than or equal to five.

Sample Input = Just keep swimming
Sample Output = Just keep gnimmiws*/

import java.util.Scanner;
public class FiveOrMore
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = reverseWords(input);
        System.out.println(result);
        scanner.close();
    }
    
    public static String reverseWords(String input)
    {
        String [] words = input.split(" ");
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].length() >= 5)
            {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        String result = String.join(" ", words);
        return result;
    }
}
