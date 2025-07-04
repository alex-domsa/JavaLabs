/*Description

Write a java program that reverses a string. However upper and lower case positions must stay the same as the orginal string. Spaces must also be kept in the same position.

Sample Input 1 = Computer 
Sample Output 1 = Retupmoc

Sample Input 2 = UPPER lower
Sample Output 2 = REWOL reppu

Sample Input 3 = 1 23 456
Sample Output 3 = 6 54 321*/

import java.util.Scanner;
public class Reverse2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String[] words = str.split(" ");
        String reverse = "";
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for(int j = word.length() - 1; j >= 0; j--)
            {
                reverseWord += word.charAt(j);
            }
            reverse += reverseWord + " ";
        }
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
            reversedString.append(Character.toUpperCase(reverse.charAt(reverse.length() - 1)));
            reverse = reverse.substring(0, reverse.length() - 1);
            } else {
            reversedString.append(reverse.charAt(reverse.length() - 1));
            reverse = reverse.substring(0, reverse.length() - 1);
            }
        }
        System.out.println(reversedString.toString());
    }
}
 