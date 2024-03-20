/*Description

Given a user inputted String write a recursive method (no loops) to 
"clean" the String. A "cleaned" String is one where only adjacent 
characters that are the same have been reduced to a single char. 
So "yyzzza" yields "yza". You should call your method cleanString.

For Example:
cleanString("yyzzza") -> "yza"
cleanString("ggoonnee") -> "gone"
cleanString("Hello") -> "Helo"

Input = n, where n is a String
Sample Input = yyzzza
Output = A "cleaned" String
Sample Output = yza*/

import java.util.Scanner;
public class CleanString 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = cleanString(input);
        System.out.println(result);
        sc.close();
    }    

    public static String cleanString(String input)
    {
        if(input.length() == 1)
        {
            return input;
        }
        else
        {
            if(input.charAt(0) == input.charAt(1))
            {
                return cleanString(input.substring(1));
            }
            else
            {
                return input.charAt(0) + cleanString(input.substring(1));
            }
        }
    }
}
