package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        //String name = InputReader.getString("Enter your name > ");
        //System.out.println("Hello " + name);

        int num1 = InputReader.getInt("Enter number 1 > ");
        int num2 = InputReader.getInt("Enter number 2 > ");
        int total = num1 + num2;
        int average = total / 2;
        System.out.println("the average is " + average);
    } 
}
