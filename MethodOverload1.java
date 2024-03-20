/*Description

Write a Java program, called MethodOverload that contains 
5 static methods called area(). Each of these methods will 
calculate the area of a user inputted shape; they will take 
in different parameters as below. They should all return 
a double and calculate the area of the corresponding shape 
(formulas given):

area(int) -> Area of a Square = len^2. len is the length of a side.
area(int, int) -> Area of a Rectangle = w*h. w is the width of a side and h is the height.
area(double, int) -> Area of an Triangle = (1/2)*b*h. b is the base and h is the height.
area(double) -> Area of a Circle = pi*r^2. r is the radius of the circle.
area(double, double) -> Area of an Ellipse = pi*a*b. a is (1/2) the length of the major axis and b is (1/2) the length of the minor axis. The major and minor axis will be given in the question.

The main method should take in user input to determine what 
shape the area needs to be calculated for. 
Depending on the shape given the program should then take 
in the correct parameters from the user (see Example below). 
Each input will be given in the order given in the descriptions 
above. You should also have an output if a non valid shape 
was entered. use "Not a valid shape!" as this message.

NOTE: you can use Math.PI to get the value of pi in Java, and Math.pow(x,y)
can be used for x to the power of y.

Example = "Square 4" would determine that you are required to find the area of a square with a side length of 4.
"Rectangle 4 4" would determine that you are required to find the area of a rectangle with width and height 4.

Input =
  n
  x
  where n is a String representing the shape, x is the number to go with the shape.
Sample Input =
  Square
  4
Output = The area of a square with side of length 4
Sample Output = Area: 16.0*/

import java.util.Scanner;
public class MethodOverload1 
{
    
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        String shape = scanner.nextLine();
        
        if(shape.equals("Square"))
        {
            String str = scanner.nextLine();
            int len = Integer.parseInt(str);
            System.out.println("Area: " + area(len));
        }
        else if(shape.equals("Rectangle"))
        {
            String str1 = scanner.nextLine();
            int w = Integer.parseInt(str1);
            String str2 = scanner.nextLine();
            int h = Integer.parseInt(str2);
            System.out.println("Area: " + area(w, h));
        }
        else if(shape.equals("Triangle"))
        {
            String str1 = scanner.nextLine();
            double b = Double.parseDouble(str1);
            String str2 = scanner.nextLine();
            int h = Integer.parseInt(str2);
            System.out.println("Area: " + area(b, h));
        }
        else if(shape.equals("Circle"))
        {
            String str = scanner.nextLine();
            double r = Double.parseDouble(str);
            System.out.println("Area: " + area(r));
        }
        else if(shape.equals("Ellipse"))
        {
            String str1 = scanner.nextLine();
            double a = Double.parseDouble(str1);
            String str2 = scanner.nextLine();
            double b = Double.parseDouble(str2);
            System.out.println("Area: " + area(a, b));
        }
        else
        {
            System.out.println("Not a valid shape!");  
        }
        scanner.close();
    }

    public static double area(int len)
    {
        double area = len*len;
        return area;
    }

    public static double area(int w, int h)
    {
        double area = w * h;
        return area;
    }   

    public static double area(double b, int h)
    {
        double area = (b * h)/2;
        return area;
    }

    public static double area(double r)
    {
        double area = Math.PI*(r * r);
        return area;
    }

    public static double area(double a, double b)
    {
        a = a/2;
        b = b/2;
        double area = Math.PI * a * b;
        return area;
    }
}
