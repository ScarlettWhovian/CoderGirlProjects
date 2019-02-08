import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Treasure_Chest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int boardsPerChest = 9;

        out.print("Pirate Lady Ching wants to build some locking treasure chests.\n");
        out.print("The chests are a standard size to fit in the ship's cargo area.\n");
        out.println("Every chest requires " + boardsPerChest + " boards.\n");

        int silverPiecesPerBoard;
        out.print("What is today's price for boards, in silver pieces? ");
        silverPiecesPerBoard = keyboard.nextInt();

        int costForBoards;
        costForBoards = boardsPerChest * silverPiecesPerBoard;
        out.println("The cost per chest is " + costForBoards + " silver pieces for boards.\n");

        out.print("Each Chest also requires lock hardware.\n");

        int costPerLock;
        out.print("What is today's price for locks, in silver pieces? ");
        costPerLock = keyboard.nextInt();

        int investment;
        out.print("How many silver pieces does Lady Ching wish to invest in building chests? ");
        investment = keyboard.nextInt();

        int totalChestCost = costForBoards + costPerLock;
        int numChests = investment / totalChestCost;
        int leftOverSilver = investment - (numChests * totalChestCost);
        out.print("\nThat will pay for the creation of " + numChests + " chests.\n");
        out.print("Left over sliver pieces: " + leftOverSilver);



    }

}