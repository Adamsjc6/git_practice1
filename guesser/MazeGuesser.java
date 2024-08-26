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
       goal = AssignValue.setValue(7, 0);
       lives = 3;
       score = 0;
    }

    public void play()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("hit a random key");

        String s = "";
        s = scan.nextLine();
        System.out.println("pick a random number between 0 and 7");
        while (!s.equals("q"))
        {
            int guessInt = scan.nextInt();
            if (goal == guessInt)
            {
                System.out.println("you got a point");
            }
            else
            {
                System.out.println("wrong answer");
            }
        }
        
        scan.close();
    }

}
