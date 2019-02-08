package com.jetbrains;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Entertainment
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the weather like today? Answer: sunny cloudy or rainy > ");
        String weatherToday = keyboard.next();

        if (!"sunny".equals(weatherToday) && !"cloudy".equals(weatherToday) && !"rainy".equals(weatherToday))
        {
            System.out.println("\nError: Your weather answer wasn't one of the valid options.");
        }

            System.out.print("\nWhat mood are you in for activity today? Answer: exercise party or quiet > ");
            String moodToday = keyboard.next();

            if (!"exercise".equals(moodToday) && !"party".equals(moodToday) && !"quiet".equals(moodToday))
            {
                System.out.println("\nError: Your mood answer wasn't one of the valid options. ");
            }
            if (weatherToday.equals("sunny"))
                if (moodToday.equals("exercise"))
                {
                    System.out.println("\nFor exercise on a sunny day, try a brisk walk in a nature preserve.");
                }
                else if (moodToday.equals("party"))
                {
                    System.out.println("\nFor a fun party on a sunny day, look for a street festival.");
                }
                else if (moodToday.equals("quiet"))
                {
                    System.out.println("\nA sunny day is a beautiful time to sit under a tree and read a book.");
                }
            if (weatherToday.equals("cloudy"))
                if (moodToday.equals("exercise"))
                {
                    System.out.println("\nFor exercise on a cloudy day, the botanical gardens are a lovely walk.");
                }
                else if (moodToday.equals("party"))
                {
                    System.out.println("\nFor a fun party on a cloudy day, ride the paddle boats at the park.");
                }
                else if (moodToday.equals("quiet"))
                {
                    System.out.println("\nOn a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
                }
            if (weatherToday.equals("rainy"))
                if (moodToday.equals("exercise"))
                {
                    System.out.println("\nGiant indoor trampolines are a fun place to exercise on a rainy day.");
                }
                else if (moodToday.equals("party"))
                {
                    System.out.println("\nSee if your friends are playing board games to pass a rainy day.");
                }
                else if (moodToday.equals("quiet"))
                {
                    System.out.println("\nA rainy day is a peaceful time to journal and daydream.");
                }



    }

}

