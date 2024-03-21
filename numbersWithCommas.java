/*Description

Write a program which contains a method called commaNumbers. 
This method takes one input to represent a number (an integer). 
The method should return a String to represent the same number 
with appropriate commas in place.

Sample Input 1 = 1000
Sample Output 1 = 1,000
Sample Input 2 = 100000
Sample Output 2 = 100,000
Sample Input 3 = 20
Sample Output 3 = 20*/

import java.util.Scanner;
public class numbersWithCommas 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String result = commaNumbers(input);
        System.out.println(result);
        scanner.close();
    }    

    public static String commaNumbers(int input)
    {
        String inputString = Integer.toString(input);
        String result = "";
        int count = 0;
        for(int i = inputString.length() - 1; i >= 0; i--)
        {
            result = inputString.charAt(i) + result;
            count++;
            if(count % 3 == 0 && i != 0)
            {
                result = "," + result;
            }
        }
        return result;
    }
}
