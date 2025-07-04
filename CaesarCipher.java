import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the message and the shift value
        System.out.println("Enter the message:");
        String message = scanner.nextLine();
        
        System.out.println("Enter the shift value:");
        int shift = scanner.nextInt();

        // Encrypt the message using Caesar Cipher
        String encryptedMessage = encrypt(message, shift);

        // Output the encrypted message
        System.out.println("Encrypted message: " + encryptedMessage);
        
        scanner.close();
    }

    public static String encrypt(String message, int shift) {
        StringBuilder encrypted = new StringBuilder();

        // Traverse each character in the message
        for (char c : message.toCharArray()) {
            // Encrypt alphabetic characters
            if (Character.isLetter(c)) {
                // Determine whether it's uppercase or lowercase
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // Apply the shift
                char encryptedChar = (char) (((c - base + shift) % 26) + base);
                // Append the encrypted character to the result
                encrypted.append(encryptedChar);
            } else {
                // Non-alphabetic characters remain unchanged
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }
}
