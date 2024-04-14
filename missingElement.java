/*Description

Given an array of numbers, use Bubble sort to sort the array. 
The array contains a group of consecutive numbers, however, 
one number is missing. Once the array is sorted, 
find and print the missing number. You may assume all numbers 
are between the first sorted element and the last sorted element. 
The code for the array is given to you, please DO NOT CHANGE THIS.

Sample Arrays 1 = {1, 4, 7, 9, 3, 6, 8, 5}
Sample Output 1 = 2*/

public class missingElement 
{
    public static void main(String [] args)
    {
        //DO NOT CHANGE THE ARRAY DEC.
        int missing[] = {1, 4, 7, 9, 3, 6, 8, 5};
        int result = element(missing);
        System.out.println(result);
    }    

    public static int element(int [] missing)
    {
        for(int i = 0; i < missing.length; i++)
        {
            for(int j = 0; j < missing.length - 1; j++)
            {
                if(missing[j] > missing[j + 1])
                {
                    int temp = missing[j];
                    missing[j] = missing[j + 1];
                    missing[j + 1] = temp;
                }
            }
        }
        int missingNum = 0;
        for(int i = 0; i < missing.length - 1; i++)
        {
            if(missing[i + 1] - missing[i] != 1)
            {
                missingNum = missing[i] + 1;
            }
        }
        return missingNum;
    }
}
