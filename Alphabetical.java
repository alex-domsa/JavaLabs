/*Description
Write a java program that takes in a String. 
Use Bubble sort to sort the letters of the String 
into alphabetical order. Print the alphabetically 
ordered String out.

Sample Input 1 = hello 
Sample Output 1 = ehllo*/

import java.util.Scanner;
public class Alphabetical 
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = bubbleSort(input);  
        System.out.println(result); 
        scanner.close();
    }    

    public static String bubbleSort(String input)
    {
        char [] arr = input.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }
}
