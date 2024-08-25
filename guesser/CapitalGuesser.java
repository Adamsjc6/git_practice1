package git_practice1.guesser;

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
    private static final int MAXIMUM = 7;
    private static final int MINIMUM = 0;

    public CapitalGuesser()
    {
        lives = 3;
        countries = new String[]
        {"Germany", "Austria", "Italy", "America", "France",
        "Britain", "Canada"};

        capitals = new String[]
        {"Berlin", "Vienna", "Rome", "Washington DC", "Paris",
        "London", "Ottawa"}; 

        
    }

    public void play(String s)
    {
        while (!s.equals("q"))
        {

        }
    }

    public String print()
    {   
        String s
        for (int i = 0; i > MAXIMUM ;i++)
        {
            s += String.format("%s", capitals)
        }
    }

}