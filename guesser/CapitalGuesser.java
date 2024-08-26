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
    private String saved;
    private String saved2;
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
    
            while (!s.equals("q"))
            {
                stringPrint(2);
                if (scan.nextLine().equals(saved2))
                {
                    System.out.prinln("You got a point!");
                    this.points++;
                }
                else
                {
                    lives--;
                }
            }

        System.out.println("Goodbye :)");

        scan.close();
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
            String p = "";

            if (lives > 0)
            {
                int random = AssignValue.setValue(6, 0);

                p += String.format("%s", countries[random]);
                
                this.saved = countries[random];
                this.saved = capitals[random];
                
                p += "\n What is the capital of this country?";

                return p;
            }
            else
            {
                return "Game over :(\nwant to restart? Y/N";
            } 
        }
        
        return "";
    }

}