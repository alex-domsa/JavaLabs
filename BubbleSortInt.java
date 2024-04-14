/*Description

Given an array of Integers, use Bubble sort to sort the array by 
the number of digits in the Integer (from largest to smallest). 
If there are two Integers with the same number of digits, 
sort the Integers by value from smallest to largest. The array 
will be provided by user input with the first number being how 
many Integers there are in the array.

Sample Array 1 = 5 78 987 2 7632 12398
Sample Output 1 = 12398 7632 987 78 2
Sample Array 2 = 6 77 23 5 1 7 101
Sample Output 2 = 101 23 77 1 5 7*/

import java.util.Scanner;
public class BubbleSortInt 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] array = new int[size];
        for(int i = 0; i < size; i++)
        {
            array[i] = input.nextInt();
        }
        int [] result = sort(array);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }

    public static int [] sort(int [] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if((int)(Math.log10(array[j]) + 1) < (int)(Math.log10(array[j + 1]) + 1))
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                else if((int)(Math.log10(array[j]) + 1) == (int)(Math.log10(array[j + 1]) + 1))
                {
                    if(array[j] > array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }
}