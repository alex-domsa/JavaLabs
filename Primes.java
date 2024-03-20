/*Description

Write a java program called Primes. This program should 
contain a method called isPrime() that accepts an integer 
parameter and returns a boolean value. This method should 
check if the integer is a prime number or not and return an 
appropriate boolean value. The main method should call the 
isPrime() method and print an appropriate messge to the screen.

Sample Input 1 = 12
Sample Output 1 = 12 is NOT a Prime number
Sample Input 2 = 13
Sample Output 2 = 13 is a Prime number*/

import java.util.Scanner;
public class Primes 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's Prime: ");
        int input = scanner.nextInt();
        if(isPrime(input))
        {
            System.out.println(input + " is a Prime number");
        }
        else
        {
            System.out.println(input + " is NOT a Prime number");
        }
        scanner.close();
    }

    public static boolean isPrime(int input)
    {
        if(input <= 1)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(input); i++)
        {
            if(input % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
//Code solved