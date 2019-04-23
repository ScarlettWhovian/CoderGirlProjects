package com.jetbrains;

public class TemperatureCalculator
{
    public static void main(String[] args)
    {
        int[][] grid = {{68, 70, 76, 70, 68, 71, 75},
                        {76, 76, 87, 84, 82, 75, 83},
                        {73, 72, 81, 78, 70, 73, 77},
                        {64, 65, 69, 68, 70, 74, 72}};
        String[] times = {"7 AM: ", "3 pm: ", "7 PM: ", "3 AM: "};
        String[] dowk = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thu: ", "Fri: ", "Sat: "};

        System.out.println("Temperature Calculator");
        System.out.println("\nThe data provided are: \n");

        for (int row = 0; row < grid.length; row++)
        {
        System.out.print(times[row]);

        for (int column = 0; column < grid[row].length; column++)
        {
            System.out.print(grid[row][column] + ", ");
        }
        System.out.println();
        }
        System.out.println("\nBased on that data, the following are the average temperatures for the week.\n");

        for (int d = 0; d < dowk.length; d++)
        {
            System.out.println(dowk[d] + dailyavg(grid,d));
        }
        System.out.println();
        for (int t = 0; t < times.length; t++)
        {
            System.out.println(times[t] + hourlyavg(t,grid));
        }

        System.out.println("\n");
        System.out.println("The final average temperature for the week was: \n\nOverall: " + totalavg(grid));
    }

    public static int totalavg(int[][] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];

            }
        }  return ((sum/arr.length)/7);
    }

    public static int dailyavg(int[][] arr, int j)
    {
        int total = 0;
        for (int i= 0; i < arr.length; i++)
        {
           total += arr[i][j];
        }
        return total/arr.length;
    }

    public static int hourlyavg(int i, int[][] arr)
    {
        int total = 0;
        for (int j= 0; j < arr.length; j++)
        {
            total += arr[i][j];
        }
        return total/arr.length;
    }
}


