package git_practice1.main;
import java.util.Scanner;

import git_practice1.guesser.CapitalGuesser;
import git_practice1.guesser.MazeGuesser;
/**
 * Runs either game
 */
public class Demo 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, type either 1 (for game 1), 2 (for game 2), or q for quit");
        
        String q = scan.nextLine();
        
        if (q.equals(1))
        {
            CapitalGuesser cg = new CapitalGuesser();
            cg.play();
        }
        else if(q.equals(2))
        {
            MazeGuesser mg = new MazeGuesser();
            mg.play();
        }
        else
        {
            System.out.println("Goodbye :)");
        }

        scan.close();
    }
}
