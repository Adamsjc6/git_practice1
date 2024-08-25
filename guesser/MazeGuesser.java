package git_practice1.guesser;

import java.util.Scanner;

/**
 * @author Joshua Caden Adams
 * @version 8/20/2024
 * 
 * Extremely basic game, exte
 */
public class MazeGuesser extends AssignValue
{   
    /**
     * 
     */
    private int goal;
    private int lives;
    private int score;

    /**
     * Basic no-arg constructor which sets up the value 
     */
    public MazeGuesser()
    {
       goal = AssignValue.setValue(0, 7);
       lives = 3;
       score = 0;
    }

    /**
     * @return different strings for the various points of the game
     */
    public String stringPrint()
    {
        String p;

        if (lives > 0)
        {

        }
        else
        {
            "Game over :(. Play again?"
        }
    }
}
