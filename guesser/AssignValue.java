package git_practice1.guesser;

import java.util.Random;

/**
 * Gives abstract method to MazeGuesser 
 * for it to assign a random value
 * 
 * @author Joshua Caden Adams
 * @version 8/20/2024
 */
abstract class AssignValue 
{
    /**
     * Prints depending on what stage of the game
     * @return the String for the other 2 classes
     */
    abstract String stringPrint();

    /**
     * simple use of the abstract class, it's not extremely useful and probably overcomplicates things but i just wanted to use something simple for the 
     * abstract class.
     * @param min minimum value and origin for the rand.nextInt
     * @param max maximum value and greatest possible value for rand.nextInt
     * @return a random number between 1-7
     */
    static int setValue(int max, int min)
    {
        Random rand = new Random();
        return rand.nextInt(min, max);
    }

}
