/*Description

Given a user inputted non-negative integer write a recursive method 
(no loops) to count the number of occurrences of 8 as a digit, except 
that an 8 with another 8 immediately to its left counts double, 
so 8818 yields 4. You should call your method countEights. Your 
method should take an integer as its parameter and return an integer 
that is the result of counting the eights.

For Example:
countEights(8) -> 1
countEights(8818) -> 4
countEights(888) -> 5

Input = n, where n is an integer value
Sample Input = 8818
Output = 8's in n
Sample Output = Result = 4*/

import java.util.Scanner;
public class CountDigits 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Result = " + countEights(input, 0));
        sc.close();
    }    

    public static int countEights(int input, int count)
    {
        if(input == 0)
        {
            return count;
        }
        else
        {
            if(input % 10 == 8)
            {
                if((input / 10) % 10 == 8)
                {
                    return countEights(input / 10, count + 2);
                }
                else
                {
                    return countEights(input / 10, count + 1);
                }
            }
            else
            {
                return countEights(input / 10, count);
            }
        }
    }
}
