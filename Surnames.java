/*Description

Given an array of names, use Bubble sort to sort the array on the surnames. Once the array is sorted, you should print it to the screen. The code for the array is given to you, please DO NOT CHANGE THIS.

Sample Arrays 1

   {"Vicky Violet", "Uppy Umbrella", "Dippy Duck", "Annie Apple", "Oscar Orange", "Eddie Elephant"}
Sample Output 1

    Annie Apple, Dippy Duck, Eddie Elephant, Oscar Orange, Uppy Umbrella, Vicky Violet*/


public class Surnames 
{
    public static void main(String [] args)
    {
        //DO NOT CHANGE THE ARRAY DECLARATION
        String names[] = {"Annie Apple", "Dippy Duck", "Eddie Elephant", "Oscar Orange", "Uppy Umbrella", "Vicky Violet"};
               // Bubble sort
               for (int i = 0; i < names.length - 1; i++) {
                for (int j = 0; j < names.length - i - 1; j++) {
                    // Extract surnames
                    String[] name1 = names[j].split(" ");
                    String[] name2 = names[j + 1].split(" ");
    
                    // Compare surnames and swap if necessary
                    if (name1[1].compareTo(name2[1]) > 0) {
                        String temp = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = temp;
                    }
                }
            }
    
            // Print sorted array
        for (String name : names) 
        {
                System.out.print(name + ", ");
        }    
    }
}
