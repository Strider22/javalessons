import java.util.Random;

/**
<H1>Overview</h1>
Demonstrates a random number generator. This is very valuable for games.
You can think of it like a dice roll!
 */
public class ex04randomNumbers{
    public static void main(String argv[])
    {
        //Create a random number generator
        Random randomGenerator = new Random();

        System.out.println("Generate 10 random numbers between 1 and 100");
        for(int i = 0;i < 10;i++){
            System.out.println("Roll " + (i + 1) + " - " + (randomGenerator.nextInt(100)+1));
        }
    }
}