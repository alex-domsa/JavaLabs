/*Description

Write a Java program that will take two numbers and print to the screen the number or numbers 
that is or are common to both numbers the user provided. Then the number of times it appears in 
both numbers should also be printed seperated by a space (System.out.println(" ")). If there is no common number 
you should print "No Common Number" to the screen.

Sample Input 1:
166
636

Sample Output 1:
6 4


Sample Input 2:
4456
7899

Sample Output 2:
No Common Number*/

import java.util.Scanner;

public class CommonStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int[] digitCount1 = new int[10];
        int[] digitCount2 = new int[10];
        countDigits(num1, digitCount1);
        countDigits(num2, digitCount2);
        boolean foundCommonNumber = false;
        for (int i = 0; i < 10; i++) {
            if (digitCount1[i] > 0 && digitCount2[i] > 0) {
                int commonCount = digitCount1[i] + digitCount2[i];
                System.out.print(i + " " + commonCount + " ");
                foundCommonNumber = true;
            }
        }
        if (!foundCommonNumber) {
            System.out.println("No Common Number");
        }
        scanner.close();
    }
    private static void countDigits(int num, int[] digitCount) {
        while (num > 0) {
            int digit = num % 10;
            digitCount[digit]++;
            num /= 10;
        }
    }
}
