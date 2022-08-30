import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
	    // Declare variables:
        String name, rarity, energyType, cardClass;
        double price;
        int hitPoints, choice;
        boolean golden;

        // counter for array for allCards
        int count = 0;

        // array [10] of allCards created objects from both Pokemon and Hearthstone
        TradingCard [] allCards = new TradingCard[10];
        // every array in Java is pre-filled w/ elements
        // {null, null, null, null, null, null, null, null, null, null}

        Scanner keyboard = new Scanner(System.in);

        // keep repeating as long as the choice is NOT 3
        do
        {
            System.out.println("\n~~~Welcome to Trading Card Central~~~");
            System.out.println("Enter (1) to enter a Pokemon Card");        // ctrl + d Duplicate
            System.out.println("Enter (2) to enter a Hearthstone Card");    // ctrl + d Duplicate
            System.out.println("Enter (3) to exit");                        // ctrl + d Duplicate

            System.out.print("\nPlease enter choice: ");
            choice = keyboard.nextInt();
            // get rid of "dangling" \n
            keyboard.nextLine();

            // Make a decision on the choice

            switch (choice)
            {
                case 1: // Pokemon
                    System.out.print("What is the card's name? ");
                    name = keyboard.nextLine();
                    System.out.print("What is its price? $ ");
                    price = keyboard.nextDouble();
                    keyboard.nextLine();
                    System.out.print("What is its rarity? ");
                    rarity = keyboard.nextLine();
                    System.out.print("Pokemon energy type? ");
                    energyType = keyboard.nextLine();
                    System.out.print("How many Hit Points? ");
                    hitPoints = keyboard.nextInt();

                    // Let's create (instantiate) a new Pokemon object
                    // Store it in an Array and increment count
                    allCards [count++] = new Pokemon(name, price, rarity, energyType, hitPoints);

                    break;

                case 2: // Hearthstone
                    System.out.print("What is the card's name? ");
                    name = keyboard.nextLine();
                    System.out.print("What is its price? $ ");
                    price = keyboard.nextDouble();
                    keyboard.nextLine();
                    System.out.print("What is its rarity? ");
                    rarity = keyboard.nextLine();
                    System.out.print("Hearthstone Class? ");
                    cardClass = keyboard.nextLine();
                    System.out.print("Is it a golden card? ");
                    golden = keyboard.nextBoolean();

                    // Let's create (instantiate) a new Hearthstone object
                    // Store it in an Array and increment count
                    allCards [count++] = new Hearthstone(name, price, rarity, cardClass, golden);
                    break;

                case 3: // Exit (stats)
                    System.out.println("\n~~~All Trading Cards~~~");
                        // currency formatted for each region
                    NumberFormat currency = NumberFormat.getCurrencyInstance();
                        // calculate total using averagePrice method
                    double totalAverage = Main.averagePrice(allCards, count);

                        // prints average
                    System.out.println("\nAverage card Price = " + currency.format(totalAverage));
                    break;
            }

        } while (choice != 3);

        System.out.println("\nHope we \"trade\" again in a future CS course together soon!");

        // close connection to keyboard
        keyboard.close();


    }

    /**
     *
     * @param arrayCards - array to pull from
     * @param count - count for array size
     * @return average price for total card prices divided by count ( total / count)
     */
    public static double averagePrice (TradingCard[] arrayCards, int count)
    {
        double total = 0.0;
        for (int i = 0; i < count; i++)
        {
            // prints array of all cards info (toString)
            System.out.println(arrayCards[i]);
            // Add the price of card to the total
            total += arrayCards[i].getPrice();
        }
        // total prices added up
        return total / count;
    }

}

/*
                    double total = 0.0;
                    NumberFormat currency = NumberFormat.getCurrencyInstance();
                    for (int i = 0; i < count; i++)
                    {
                        System.out.println(allCards[i]);
                        // Add the price of card to the total
                        total += allCards[i].getPrice();
                    }
                    System.out.println("\nAverage card Price = " + currency.format(total / count));
*/

/*
        double totalAverage = 0;
        return totalAverage;
        int count = 0;
        double total = 0.0;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        for (int i = 0; i < count; i++)
        {
            System.out.println(allCards[i]);
            // Add the price of card to the total
            total += allCards[i].getPrice();
        }

        System.out.println("\nAverage card Price = " + currency.format(total / count));

        System.out.println("\nAverage card Price = " + currency.format(total / count));
        */
