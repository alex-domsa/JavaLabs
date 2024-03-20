import java.util.Scanner;

public class VowelCounter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        int count = vowelCount(input.toLowerCase()); 
        System.out.println(count);
    }
    
    public static int vowelCount(String str) 
    {
        if(str.isEmpty()) 
        {
            return 0;
        }

        char firstChar = str.charAt(0);
        boolean isVowel = firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
        
        if(isVowel) 
        {
            return 1 + vowelCount(str.substring(1));
        } 
        else 
        {
            return vowelCount(str.substring(1));
        }
    }
}

