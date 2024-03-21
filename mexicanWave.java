/*Description

The mexican wave is a famous motion that is often perfomed by 
a crowd at a sporting event. The motion involves an effect 
resembling a moving wave produced by successive sections of the 
crowd in a stadium standing up, raising their arms, lowering them, 
and sitting down again.

Your task for this program is to simulate a "mexican wave" on a String. 
Within your program, create a method called wave which takes one String as an input. 
This method should return an array of stages in the wave.

For example, with the word "hello", your mexican wave will be 
["Hello", "hEllo", "heLlo", helLo", hellO"]. When your array has been 
created, print out its contents one word per line.

NOTE: Spaces are ignored in the mexican wave.

Sample Input 1 = hello
Sample Output 1 = 
    Hello
    hEllo
    heLlo
    helLo
    hellO

Sample Input 2 = hello world
Sample Output 2 = 
    Hello world
    hEllo world
    heLlo world
    helLo world
    hellO world
    hello World
    hello wOrld
    hello woRld
    hello worLd
    hello worlD*/

import java.util.Scanner;
public class mexicanWave 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] result = wave(input);
        for(String s : result)
        {
            System.out.println(s);
        }
        scanner.close();
    }
    
    public static String [] wave(String input)
    {
        String [] result = new String[input.length()];
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) != ' ')
            {
                result[i] = input.substring(0, i) + Character.toUpperCase(input.charAt(i)) + input.substring(i + 1);
            }
        }
        return result;
    }
}
