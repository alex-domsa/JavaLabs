/*Description

In Poker, a "full house" occurs when your five cards contain three 
of one card and two of another. For example: "K", "K", "5", "K", "5" would
be a full house as there are 3 Kings and two 5's.

Create a method that determines if a "hand" of 5 cards (which you can take 
in in your main method, stored in an array) is a full house. 
This method should be called fullHouseCheck. It will take an array as 
input and will return nothing. If it is a full house, you should print 
which card is the 3 of a kind, and which card is the two of a kind. 
Otherwise you should print "Not a full house".

Sample Input 1 = 
    A
    A
    A
    K
    K
Sample Output 1 = 
    3 of a kind: A
    2 of a kind: K
Sample Input 2 = 
    3
    J
    3
    J
    3
Sample Output 2 = 
    3 of a kind: 3
    2 of a kind: J
Sample Input 3 = 
    10
    J
    10
    10
    10
Sample Output 3 = Not a full house*/

import java.util.Scanner;
public class poker 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String [] input = new String[5];
        for(int i = 0; i < 5; i++)
        {
            input[i] = scanner.nextLine();
        }
        fullHouseCheck(input);
        scanner.close();
    }
    
    public static void fullHouseCheck(String [] input)
    {
        int [] count = new int[13];
        for(int i = 0; i < 5; i++)
        {
            switch(input[i])
            {
                case "A":
                    count[0]++;
                    break;
                case "2":
                    count[1]++;
                    break;
                case "3":
                    count[2]++;
                    break;
                case "4":
                    count[3]++;
                    break;
                case "5":
                    count[4]++;
                    break;
                case "6":
                    count[5]++;
                    break;
                case "7":
                    count[6]++;
                    break;
                case "8":
                    count[7]++;
                    break;
                case "9":
                    count[8]++;
                    break;
                case "10":
                    count[9]++;
                    break;
                case "J":
                    count[10]++;
                    break;
                case "Q":
                    count[11]++;
                    break;
                case "K":
                    count[12]++;
                    break;
            }
        }
        int threeOfAKind = -1;
        int twoOfAKind = -1;
        for(int i = 0; i < 13; i++)
        {
            if(count[i] == 3)
            {
                threeOfAKind = i;
            }
            else if(count[i] == 2)
            {
                twoOfAKind = i;
            }
        }
        if(threeOfAKind != -1 && twoOfAKind != -1)
        {
            String [] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
            System.out.println("3 of a kind: " + cards[threeOfAKind]);
            System.out.println("2 of a kind: " + cards[twoOfAKind]);
        }
        else
        {
            System.out.println("Not a full house");
        }
    }
}
