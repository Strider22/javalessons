import java.util.Random;

/**
<H1>Overview</h1>
Demonstrates if, else and else if statements.
These are used for decision making and creating variety.
 */
public class ex05ifStatement{
    public static void main(String argv[])
    {
        int roll;
        //Create a random number generator
        Random randomGenerator = new Random();

        System.out.println("Generate 10 random numbers between 1 and 6");
        for(int i = 0;i < 10;i++){
            roll = (randomGenerator.nextInt(6)+1);
            System.out.print("Attack "  + i + " Roll = " + roll);
            if(roll < 3) {
                System.out.println(" - Ouch I'm hit!");
            }
            else if (roll < 5) {
                System.out.print(" - Clash! " );
                System.out.println("It's a tie.");
            }
            else {
                System.out.println(" - I win!");
            }
        }
    }
}