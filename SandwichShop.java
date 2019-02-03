package com.jetbrains;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args)
    {
	    Scanner keyboard = new Scanner(System.in);
	    int goalForVeggies = 50;
	    int goalForBurgers =250;
	    int goalForSubs =180;
	    int goalForSoup = 70;

        int veggieSadwichesSold;
        System.out.println("Checking sales goals.");
        System.out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        System.out.println("How many veggie sandwiches were sold today?");
        veggieSadwichesSold = keyboard.nextInt();

		if (veggieSadwichesSold >= goalForVeggies)
        {
            System.out.println("\nMade goal for veggies.");
        }

		else
        {

			System.out.println("\nFell short.");
		}

        int burgersSold;
        System.out.println("The sales goal for burgers is " + goalForBurgers);
        System.out.println("How many burgers were sold today?");
        burgersSold = keyboard.nextInt();

        if (burgersSold >= goalForBurgers)
        {
            System.out.println("\nMade goal for burgers.");
        }

        else
        {

            System.out.println("\nFell short.");
        }

        int subsSold;
        System.out.println("The sales goal for subs is " + goalForSubs);
        System.out.println("How many subs were sold today?");
        subsSold = keyboard.nextInt();

        if (subsSold >= goalForSubs)
        {
            System.out.println("\nMade goal for subs.");
        }

        else
        {

            System.out.println("\nFell short.");
        }

        int soupSold;
        System.out.println("The sales goal for soup is " + goalForSoup);
        System.out.println("How many soups were sold today?");
        soupSold = keyboard.nextInt();

        if (soupSold >= goalForSoup)
        {
            System.out.println("\nMade goal for soup.");
        }

        else
        {

            System.out.println("\nFell short.");
        }

        if (veggieSadwichesSold >= goalForVeggies && burgersSold >= goalForBurgers && subsSold >= goalForSubs && soupSold >= goalForSoup)
        {
            System.out.println("\nMade goal for everything!");
        }
    }

}
