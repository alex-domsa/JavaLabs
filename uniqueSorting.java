/*Description 
 * Write a Java method called uniqueSort which, given an array of integers
 * 1. Removes all duplicate numbers
 * 2. Sorts the array from smallest to largest
 * 3. Returns the new array
 * You should print your final array in the main method.
 * NOTE: The first input value is the "size" of the array. All remaining inputs are values in your array.
 * 
 * Sample input 1 = 4 1 2 4 3 
 * Sample output 1 = 1 2 3 4 
 * 
 * Sample input 2 = 9 1 4 4 4 4 3 2 1 2 
 * Sample output 2 = 1 2 3 4 
 * 
 * Sample input 3 = 7 6 7 6 4 3 2 1 
 * Sample output 3 = 1 2 3 6 7 
 */

import java.util.Scanner; 
public class uniqueSorting 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int [] result = uniqueSort(arr);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
        scanner.close();
    }    

    public static int [] uniqueSort(int [] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] != arr[i + 1])
            {
                count++;
            }
        }
        int [] result = new int[count + 1];
        int index = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] != arr[i + 1])
            {
                result[index] = arr[i];
                index++;
            }
        }
        result[index] = arr[arr.length - 1];
        return result;
    }
}
