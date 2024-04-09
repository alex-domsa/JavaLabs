/*Description
Given two Strings, s1 and s2, write a Java program 
that determines if s2 is an anagram of s1 using 
Bubble sort. If it is, print s1 in alphabetical order. 
If it is not, print s1 and s2 in alphabetical order.

Sample Input 1 = 
    anagram
    nagaram 
Sample Output 1 = 
    aaagmnr

Sample Input 2 = 
    cat
    mat
Sample Output 2 = 
    act
    amt*/

import java.util.Scanner;
public class Anagram 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String result = anagram(s1, s2);
        System.out.println(result);
        scanner.close();
    }

    public static String anagram(String s1, String s2)
    {
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr1.length - 1; j++)
            {
                if(arr1[j] > arr1[j + 1])
                {
                    char temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr2.length; i++)
        {
            for(int j = 0; j < arr2.length - 1; j++)
            {
                if(arr2[j] > arr2[j + 1])
                {
                    char temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }
        String sorted1 = new String(arr1);
        String sorted2 = new String(arr2);
        if(sorted1.equals(sorted2))
        {
            return sorted1;
        }
        else
        {
            return sorted1 + "\n" + sorted2;
        }
    }
}
