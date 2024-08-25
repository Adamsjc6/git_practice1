package git_practice1.guesser;
import java.util.Scanner;

/**
 * @author Joshua Caden Adams
 * @version 8/20/2024
 * 
 * basic trivia game using the assignvalue abstract class
 */
 public class CapitalGuesser extends AssignValue
{
    private String[] capitals;
    private String[] countries;
    private int lives;
    private int score;
    private static final int MAXIMUM = 6;
    private static final int MINIMUM = 0;

    public CapitalGuesser()
    {
        this.score = 0;
        this.lives = 3;
        countries = new String[]
        {"Germany", "Austria", "Italy", "America", "France",
        "Britain", "Canada"};

        capitals = new String[]
        {"Berlin", "Vienna", "Rome", "Washington DC", "Paris",
        "London", "Ottawa"}; 

    }
    /**
     * plays the game
     * @param s stages of the game
     */
    public void play()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(stringPrint(1));
        
        String s = scan.nextLine().toUpperCase();
        
        if (s.equals("Y"))
        {
            while (!s.equals("q"))
            {
                stringPrint(2);
            }
        }
        else if (s.equals())
        {

        }

        System.out.println("Goodbye :)");
    }

    public String stringPrint(int t)
    {   
        
        if (t == 1)
        {
            String stage1 = "Hello, welcome to a basic Capital Guesser game. Do you want to play? Y/N";
            return stage1;
        }
        else if (t == 2)
        {
            String p;

            if (lives > 0)
            {
                int random = AssignValue.setValue(6, 0);
                int random2 = AssignValue.setValue(1,0);

                if (random2 == 0)
                {
                    p += String.format("%s", capitals[random],);
                }
                else
                {
                    p += String.format("%s", capitals[random]);
                }  
            }
            else
            {
                System.out.println("Game over :(\nwant to restart? Y/N");
            }
        }
        else if (t == 3)
        {

        }
        
        
    }

}