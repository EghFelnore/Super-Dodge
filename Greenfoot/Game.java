import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world in which the game is actually played
 * 
 * @author Kaleb Dykema
 * @version 7/5/14
 */
public class Game extends World
{
    int height;
    int width;
    
    //Constructor for objects of Game
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        height = getHeight();
        width = getWidth();
        
        //Calls the method addActors
        addActors();
    }
    
    //Adds all actors used in the Game world
    void addActors()
    {
        //Creating the actors
        Player player = new Player();
        Enemy enemy1 = new Enemy();
        Enemy enemy2 = new Enemy();
        Enemy enemy3 = new Enemy();
        Enemy enemy4 = new Enemy();
        
        //Addings the actors
        addObject(player, 300, 200);
        addObject(enemy1, 20, 20);
        addObject(enemy2, 20, height - 20);
        addObject(enemy3, width - 20, height - 20);
        addObject(enemy4, width - 20, 20);
    }
    
    //Returns a random variable between
    int random(String heightOrWidth)
    {
        if(heightOrWidth == "height")
        {
            return
        }
    }
}
