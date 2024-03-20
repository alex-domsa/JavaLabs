/*Description

Write a method that behaves like a household security alarm that 
can be switched off with a special sequence of digits (password). 
Write the method so that it takes a String as a parameter. 
It doesn't need to return anything. The method should print out 
"Alarm Deactivated" if the String taken as a parameter contains 
the sequence "1234" anywhere in the input; thus "1234" is the password.

Your method should reject any other sequence and any sequence 
greater than 10 characters. Failure to enter the correct password 
should result in printing "Alarm Activated" to the screen.

The method should use the .matches(<...>) method with a regular expression.

In the main method call the method with user input.

No.	Sample Input:	Sample Output:
1 |	1234	        Alarm Deactivated
2 |	4121234	        Alarm Deactivated
3 |	1235	        Alarm Activated
4 |	12345678901234	Alarm Activated*/

import java.util.Scanner;
public class Alarm 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        alarmCheck(str);    
        scanner.close();
    }
    
    public static void alarmCheck(String str)
    {
        if(str.matches(".*1234.*") && str.length() < 11)
        {
            System.out.println("Alarm Deactivated");
        }
        else
        {
            System.out.println("Alarm Activated");
        }
    }
}
