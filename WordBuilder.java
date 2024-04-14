/*Description

Given an array of letters and an array of positions, use Bubble sort 
to sort the arrays to build the word. To find out where you put the 
letters, you will use the positions contained in the second given array. 
The code for the arrays is given to you, please DO NOT CHANGE THIS.

Sample Arrays 1 = 
    letters[] = {'l', 'o', 'e', 'h', 'l'};
    positions[] = {2, 4, 1, 0, 3};
Sample Output 1 =
    hello*/

public class WordBuilder 
{
    public static void main(String [] args)
    {
        //DO NOT CHANGE THE ARRAYS DEC.
        char letters[] = {'l', 'o', 'e', 'h', 'l'};
        int positions[] = {2, 4, 1, 0, 3};
        String result = build(letters, positions);
        System.out.println(result);
    }

    public static String build(char [] letters, int [] positions)
    {
        for(int i = 0; i < letters.length; i++)
        {
            for(int j = 0; j < letters.length - 1; j++)
            {
                if(positions[j] > positions[j + 1])
                {
                    int temp = positions[j];
                    positions[j] = positions[j + 1];
                    positions[j + 1] = temp;
                    char temp2 = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = temp2;
                }
            }
        }
        String word = "";
        for(int i = 0; i < letters.length; i++)
        {
            word += letters[i];
        }
        return word;
    }
}
