package com.jetbrains;
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
        public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Please list three items on your grocery list.");

        String itemOne;
        out.print("Item 1? ");
        itemOne = keyboard.nextLine();

        String itemTwo;
        out.print("Item 2? ");
        itemTwo = keyboard.nextLine();

        String itemThree;
        out.print("Item 3? ");
        itemThree = keyboard.nextLine();

        out.println("\nNow, please enter the quantity of each item.");

        int countOne;
        out.print("How many " + itemOne + "? ");
        countOne = keyboard.nextInt();

        int countTwo;
        out.print("How many " + itemTwo + "? ");
        countTwo = keyboard.nextInt();

        int countThree;
        out.print("How many " + itemThree + "? ");
        countThree = keyboard.nextInt();

        out.print("\nNow, please enter the price of each item.\n");

        float costOne;
        out.print("How much does one " + itemOne + " cost? ");
        costOne = keyboard.nextFloat();

        float costTwo;
        out.print("How much does one " + itemTwo + " cost? ");
        costTwo = keyboard.nextFloat();

        float costThree;
        out.print("How much does one " + itemThree + " cost? ");
        costThree = keyboard.nextFloat();

        float listTotal = (costOne * countOne) + (costTwo * countTwo) + (costThree * countThree);
        out.print("\nCalculating your grocery bill.\n");
        out.print("Your total cost is " + listTotal);

    }
}
