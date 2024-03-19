/*Description

Write a Java program, called Seasons, which contains a static method called printSeason() 
which takes no input parameters and returns nothing. 
The printSeason() method should get the user to input a single integer value between 1 and 12
representing a month of the year and print a message saying what Season it is. (see table below for Months and Seasons).
To test the printSeason() method you should call it from the main method.

Month	Number Representation	Season
January	           1	        Winter
February	       2	        Winter
March	           3	        Spring
April	           4            Spring
May	               5            Spring
June	           6	        Summer
July	           7	        Summer
August	           8            Summer
September	       9	        Autumn
October	           10	        Autumn
November	       11	        Autumn
December           12	        Winter

Sample Input = 4
Sample Output = April is in Spring*/

import java.util.Scanner;
public class Seasons
{
    public static void main(String[] args)
    {
        printSeason();
    }
    public static void printSeason()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();
        if(month == 1 || month == 2 || month == 12)
        {
            System.out.println("Winter");
        }
        else if(month == 3 || month == 4 || month == 5)
        {
            System.out.println("Spring");
        }
        else if(month == 6 || month == 7 || month == 8)
        {
            System.out.println("Summer");
        }
        else if(month == 9 || month == 10 || month == 11)
        {
            System.out.println("Autumn");
        }
        else
        {
            System.out.println("Invalid month number");
        }
    }
}