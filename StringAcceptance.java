/*Description

Write a method that takes a String as a parameter and returns 
true if the String contains 0's and 1's only and will return false 
otherwise. You must use the .matches(<...>) method with a regular expression.

In your main method call the method with user input and print to the screen the return.

Sample Input 1 = 010110
Sample Output 1 = true
Sample Input 2= 0210
Sample Output 2 = false*/

import java.util.Scanner;
public class StringAcceptance 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String userInputt = sc.nextLine();
        readString(userInputt);
        sc.close();
    }
    
    public static boolean readString(String userInput)
    {
        if(userInput.matches("[01]*"))
        {
            System.out.println("true");
            return true;
        }
        else
        {
            System.out.println("false");
            return false;
        }
    }
}
