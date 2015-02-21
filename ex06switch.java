/**
<H1>Overview</h1>
Same as ex04ifStatement, but uses a switch statement.*/
import java.util.Random;

public class ex06switch{
  public static void main(String argv[])
  {
    int roll;
    //Create a random number generator
    Random randomGenerator = new Random();
    
    System.out.println("Generate 10 random numbers between 1 and 6");
    for(int i = 0;i < 10;i++){
      //Generate the random number (roll the die)
      roll = (randomGenerator.nextInt(6)+1);
      //Print the first part of the response
      System.out.print("Attack "  + (i + 1) + " Roll = " + roll);
      //Print the varying part of the response
      switch(roll){
          case 0: case 1: case 2:
              System.out.println(" - Ouch I'm hit!");
              break;
          case 3: case 4: 
              System.out.print(" - Clash! " );
              System.out.println("It's a tie.");
              break;
          default:
              System.out.println(" - I win!");        
              break;
      }
    }
  }
}