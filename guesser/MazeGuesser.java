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

    public void play()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("pick a random number between 0 and 7");
        while (!scan.nextLine().equals("q"))
        {
            int guessInt = scan.nextInt();
            if (goal == guessInt)
            {
                System.out.println();
            }
            else
            {
                System.out.println();
            }
        }
        
        scan.close();
    }

    /**
     * @return different strings for the various points of the game
     */
    public String stringPrint(int t)
    {
        String p;

        if (lives > 0)
        {

        }
        else
        {
            return "Game over :(. Play again?";
        }
    }
}
