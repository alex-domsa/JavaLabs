/*Description

Write two Java methods which return the minimum value in an 
integer array. You should write:

An iterative method which returns the minimum value in an integer 
array. In this method, you must use either a for or a while loop. 
You should call this method minArrayIter and it should have a definition 
as follows: public static int minArrayIter(int[] a) where a is the input array.
A recursive method which returns the minimum value in an integer array. 
You should call this method minArrayRec. The definition of the method 
should be declared as follows: public static int 
minArrayRec(int[] a, int start) where a is the input array.
You may assume that there will always be at least one element in the array.

Input = n, m, where n is the length of the array, followed by m numbers
Sample Input = 6 19 190 1990 9 90 1
Output = Each method will return the value which is the minimum value 
in the integer array to be printed on the same line separated by a space
Sample Output = 1 1*/

import java.util.Scanner;
public class MinimumValue 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);   
        int n = scanner.nextInt();
        int[] a = new int[n];
    
        for(int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
        int minInter = minArrayIter(a);
        int minRec = minArrayRec(a, 0);
        System.out.println(minInter + " " + minRec);
        scanner.close();
    }


    public static int minArrayIter(int[] a)
    {
        int min = a[0];
        for(int i = 0; i < a.length; i++)
        {
            if(min > a[i])
            {
                min = a[i];
            }   
        }
        return min;
    }

    public static int minArrayRec(int[] a, int start)
    {
        if(start == a.length - 1)
        {
            return a[start];
        }
        int minRest = minArrayRec(a, start + 1);
        return Math.min(a[start], minRest);
    }
}
