/*Description

Write a recursive function named powerTo that accepts two 
integers representing a base and a power and returns 
the base raised to that power.

For Example:
powerTo(2, 3) -> 8
powerTo(3, 3) -> 27
powerTo(3, 4) -> 81
Do not use loops or auxiliary data structures; solve the problem recursively.

NOTE: You may not use Math.pow() to solve this question

Input = x y, where x and y are positive Integer values.
Sample Input = 2 3
Output = The value of 2 to the power of 3
Sample Output = 8*/

import java.util.Scanner;
public class Exponent 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = scanner.nextInt();
        System.out.println("Enter the power: ");
        int power = scanner.nextInt();
        scanner.close();
        System.out.println(powerTo(base, power));
    }    

    public static int powerTo(int base, int power)
    {
        if(power == 0)
        {
            return 1;
        }
        return base * powerTo(base, power - 1);
    }   
}
