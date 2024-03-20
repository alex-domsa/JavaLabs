/*Description

Write a Java program, called LinearSearch2, that contains 
a static method called countStrings() that accepts a 2D array 
of Strings and a String as its parameters. The method should 
return an integer value that is the total number of times 
the String being searched for is contained in the 2D String 
array. In the main method you should use user input to take 
the element you wish to search for in the array. There is code 
there for your array, DO NOT CHANGE THIS CODE. You should print 
an appropriate message to the screen if the element is found 
and how many times it exists in the array.

Note: The countStrings() method should work irrespective of case.

Sample Input 1 = Duck
Sample Array 1 =

	cat dog dUck
	
   	rabbit hen duCk

    dUcK DucK goose

Sample Output 1 = Duck is contained 4 times in the array
Sample Input 2 = Opel
Sample Array 2 =

	Volvo Fiat Suzuki Toyota

    fiat Suzuki Volvo Ferrari

    Ferrari Porsche Lamborghini Jag

    Jag Fiat Citroen Toyota

Sample Output 2 = Opel was NOT found in the array*/

import java.util.Scanner;
public class LinearSearch2 
{
    public static void main(String [] args)
    {
        //DO NOT CHANGE THE ARRAY DECLARATION
        String words[][] = {{"cat", "dog", "dUck"}, {"rabbit", "hen", "duCk"}, {"dUcK", "DucK", "goose"}};   

        Scanner scanner = new Scanner(System.in);
        String searchString = scanner.nextLine();
        scanner.close();

        int count = countStrings(words, searchString);
        if(count > 0)
        {
            System.out.println(searchString + " is contained " + count + " times in the array");
        }
        else
        {
            System.out.println(searchString + " was NOT found in the array");  
        }
    }
    
    public static int countStrings(String[][] array, String target)
    {
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j].equalsIgnoreCase(target))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
