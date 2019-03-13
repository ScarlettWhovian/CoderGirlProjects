package com.jetbrains;
import java.util.Scanner;

public class MultiplicationTables
{
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Welcome to Multiplication Tables");

       System.out.println("\nHow large - up to 20 - would you like to see them? ");
       int size = keyboard.nextInt();
       keyboard.skip("\n");
       int x = 0;
       int y = 0;
       System.out.println("\n");

       for (x = 0; x <= size; x++)
       {
           for (y = 0; y <= size; y++)
           {
               System.out.println(x + " * " + y + " = " + x*y);
           }
       }

    }
}
