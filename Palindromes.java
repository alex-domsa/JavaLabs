/*Description

In a java program, write a method called isPalindrome() 
that accepts a String parameter and returns a Boolean. 
This method should check if the String is a Palindrome 
and return an appropriate boolean value. Your method 
should work irrespective of case. In the main method, 
you should call the method with a user inputted String 
being passed into isPalindrome().

Sample Input 1 = NaVAn
Sample Output 1 = NAVAN is a Palindrome
Sample Input 2 = Cavan
Sample Output 2 = Cavan is NOT a Palindrome*/
import java.util.Scanner;
public class Palindromes 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = scanner.nextLine();
        if(isPalindrome(userInput))
        {
            System.out.println(userInput.toUpperCase() + " is a Palindrome");
        }
        else
        {
            System.out.println(userInput + " is NOT a Palindrome");
        }
        scanner.close();
    }
    
    public static boolean isPalindrome(String userInput)
    {
        userInput = userInput.toLowerCase();
        userInput = userInput.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = userInput.length() - 1;

        while(left < right)
        {
            if(userInput.charAt(left) != userInput.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }   
}
//code solved