import static java.lang.System.out;
import java.util.Scanner;

public class Apples
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int appleCount;
        out.print("How many apples?");
        appleCount = keyboard.nextInt();

        int appleCostInCents;
        out.print("How many cents each? ");
        appleCostInCents = keyboard.nextInt();

        int princeInCents = appleCount * appleCostInCents;
        float priceInDOllars = princeInCents / 100f;
        out.println("The order price is " + priceInDOllars + " dollars.");
        out.println("The order price is " + princeInCents + " cents.");


    }

}