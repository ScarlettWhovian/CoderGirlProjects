package com.jetbrains;

public class LeapYear
{

    public static boolean isLeapYear(int y)
    {
        if(y/4==0)
        {
            return true;
        }
        else if((y/100==0)&&(y/400==0))
        {
            return true;
        }
        else
        {
            return ((y/4==0)&&(y/100==0));
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Is it a leap year?");
        int testFailures = 0;

        if (isLeapYear(1600))
        {
            System.out.println("Error: 1600 is a leap year");
            testFailures++;
        }
        if (isLeapYear(2000))
        {
            System.out.println("Error: 2000 is a leap year.");
            testFailures++;
        }
        if (isLeapYear(2400))
        {
            System.out.println("Error: 2400 is a leap year.");
            testFailures++;
        }
        if (isLeapYear(1988))
        {
            System.out.println("Error: 1988 is a leap year");
            testFailures++;
        }
        if (isLeapYear(1996))
        {
            System.out.println("Error: 1996 is a leap year.");
            testFailures++;
        }
        if (isLeapYear(2004))
        {
            System.out.println("Error: 2004 is a leap year.");
            testFailures++;
        }
        if (isLeapYear(4000))
        {
            System.out.println("Error: 4000 is a leap year.");
            testFailures++;
        }
        if (isLeapYear(1800))
        {
            System.out.println("Error: 1800 is not a leap year");
            testFailures++;
        }
        if (isLeapYear(1900))
        {
            System.out.println("Error: 1900 is not a leap year");
            testFailures++;
        }
        if (isLeapYear(2200))
        {
            System.out.println("Error: 2200 is not a leap year.");
            testFailures++;
        }
        if (isLeapYear(1987))
        {
            System.out.println("Error: 1987 is not a leap year");
            testFailures++;
        }
        if (isLeapYear(1999))
        {
            System.out.println("Error: 1999 is not a leap year.");
            testFailures++;
        }
        if (isLeapYear(2006))
        {
            System.out.println("Error: 2006 is not a leap year.");
        }
        if (testFailures == 0)
        {
            System.out.println("Success!  All test cases passed.");
        }
        else
        {
            System.out.println(testFailures + " tests failed.  Keep trying!");
        }

    }

}
