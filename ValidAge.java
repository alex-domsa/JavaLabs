/*Description

Write a Java program that requests a user to input their age. 
The program should verify that the value the user enters is considered valid, 
lying in the range between 0 and 150. This program should use the .matches(<...>) 
method with a regular expression. If the user does not enter a valid age, your program 
should continually request that they enter a valid age until a valid age is entered.

NOTE: Your output should exactly match the expected output.

Sample Run of Program 1

    23                   //user input  
    Age is valid         //output based on value of age
Sample Run of Program 2

    167                  //user input  
    Age is NOT valid     //output based on value of age
    -21                  //user input
    Age is NOT valid     //output based on value of age
    73                   //user input
    Age is valid         //output based on value of age*/

import java.util.Scanner;        
public class ValidAge 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while(!isValid)
        {
            String age = scanner.nextLine();
            isValid = verifyAge(age);
        }
        scanner.close();    
    }    

    public static boolean verifyAge(String age)
    {
        if(age.matches("(0|[1-9]|[1-9][0-9]|1[0-4][0-9]|150)"))
        {
            System.out.println(age);
            System.out.println("Age is valid");
            return true;
        }
        else
        {
            System.out.println(age);
            System.out.println("Age is NOT valid");
            return false;
        }
    }
}
