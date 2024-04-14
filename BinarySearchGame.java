/*Description

In this Binary Search Guessing Game, The computer must check for the 
presence of an integer number in a provided range from start to end (inclusive). 
At the end of the game, the number is revealed along with the number of tries 
it took the computer to get the correct number. You should take the number being 
searched for from user input. The computer should use the binary search algorithm to solve this question.

NOTE: You are provided a range in which the number will be contained. DO NOT CHANGE THE PROVIDED start and end VARIABLES.

Input = n, where n is the number you will search for in the integer range provided.
Sample Input = 7
Output = The number being searched for and the number of tries to find it
Sample Output = 
The number is: 7
It took 4 tries!*/

import java.util.Scanner;
public class BinarySearchGame 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int start = 1;
        int end = 10;
        int result = search(n, start, end);
        System.out.println("The number is: " + n);
        System.out.println("It took " + result + " tries!");
    }

    public static int search(int n, int start, int end)
    {
        int tries = 0;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            tries++;
            if(mid == n)
            {
                return tries;
            }
            else if(mid < n)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return tries;
    }
}
