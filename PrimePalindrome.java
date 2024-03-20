/*Description

Write a java program that takes in a number N and finds 
the smallest palindrome prime greater than or equal to N. 
This should be done by creating three methods, one to check if 
the number is prime one to check if the number is a palindrome and 
onr to get the next palindrome prime number.

Sample Input 1 = 8
Sample Output 1 = The next prime palindrome is 11*/

import java.util.Scanner;
public class PrimePalindrome 
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int nextPalPrime = getNextPalPrime(num);
        System.out.println("The next prime palindrome is " + nextPalPrime);
    }

    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPal(int num)
    {   
        if(num < 10)
        {
            return false;
        }
        int reversed = 0, original = num;
        //reversing num
        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        //check if back and front are the same
        return original == reversed;
    }

    public static int getNextPalPrime(int num)
    {
        while(true)
        {
            if(isPrime(num) && isPal(num))
            {
                return num;
            }
            num++;
        }
    }
}
//Code solved