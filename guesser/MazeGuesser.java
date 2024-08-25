package git_practice1.guesser;

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

    /**
     * Basic no-arg constructor which sets up the value 
     */
    public MazeGuesser()
    {
       goal = AssignValue.setValue(0, 7);
       lives = 3;
    }

    /**
     * @return A depiction of the map after the 3 lives are up
     */
    public String printMaze()
    {

    }
}
