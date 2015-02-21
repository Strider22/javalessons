/**
 * Shows how to use arrays. Additionally, Java 5 introduced a new syntax for
 * arrays. This program uses that extended syntax.
 * 
 * @author misolt
 */
public class ex07ArraysAndExtendedForLoops
{

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Declare an array of 5 strings
        String[] strings = new String[5];

        //Assign values to each array entry
        strings[0] = "Hello";
        strings[1] = "World.";
        strings[2] = "How";
        strings[3] = "are";
        strings[4] = "you?";

        //Use a classic for loop to print out the strings;
        for (int i = 0; i < 5; i++) {
            System.out.println(strings[i]);
        }

        //The following is a more concise way to do the same
        //thing as above.
        String[] list = { "Hello", "World.", "How", "are", "you?" };

        for (String entry : list) {
            System.out.println(entry);
        }

    }

}
