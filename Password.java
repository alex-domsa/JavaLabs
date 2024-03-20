/*Description

Write a method that checks the strength of a user inputted password. 
The method should take a String as a parameter and return a score 
for the password in the form of an integer. The method should use the 
.matches(<...>) method with a regular expression. In the main method 
call the method with user input and print to the screen the return.

Passwords can receive a plus one to their score for each of the following:

-length>=8
-length >=12
-At least 1 lowercase letter
-At least 2 or more lowercase letters
-At least 1 uppercase letter
-At least 2 or more uppercase letters
-At least 1 digit
-At least 2 or more digits
-At least 1 special character -> # ! ? @, you only have to consider 
these 4 special characters for this question.
-At least 2 or more special characters -> # ! ? @, you only have to 
consider these 4 special characters for this question.
-When the score is returned from the method an appropriate message should 
print out to the screen giving the password strength. The ranges for the 
passwords are as follows:

0 < score < 4 -> Weak
4 <= score < 6 -> Fair
6 <= score < 8 -> Good
8 <= score <= 10 -> Strong
No.	Sample Input:	Sample Output:
1 |	Hzy23@1S	    Password strength: Strong
2 |	123456	        Password strength: Weak
3 |	fOOtBaLL	    Password strength: Fair
4 |	6@m30ph7r0n35	Password strength: Good*/

import java.util.Scanner;
public class Password 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);   
        String input = scanner.nextLine();
        int score = checkPasswordStrength(input);
        String strength = "";

        if(score < 4)
        {
            strength = "Weak";
        }
        else if(score < 6)
        {
            strength = "Fair";
        }
        else if(score < 8)
        {
            strength = "Good";
        }
        else
        {
            strength = "Strong";
        }

        System.out.println("Password strength: " + strength);
        scanner.close();
    }

    public static int checkPasswordStrength(String input)
    {
        int score = 0;
        if(input.matches(".{8,}"))
        {
            score++;
        }
        if(input.matches(".{12,}"))
        {
            score++;
        }
        if(input.matches(".*[a-z].*"))
        {
            score++;
        }
        if(input.matches(".*[a-z].*[a-z].*"))
        {
            score++;
        }
        if(input.matches(".*[A-Z].*"))
        {
            score++;
        }
        if(input.matches(".*[A-Z].*[A-Z].*"))
        {
            score++;
        }
        if(input.matches(".*\\d.*"))
        {
            score++;
        }
        if(input.matches(".*\\d.*\\d.*"))
        {
            score++;
        }
        if(input.matches(".*[#!?@].*"))
        {
            score++;
        }
        if(input.matches(".*[#!?@].*[#!?@].*"))
        {
            score++;
        }
        return score;
    }
}

