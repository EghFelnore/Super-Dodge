import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The menu to the game
 * 
 * @author Kaleb Dykema
 * @version 7/6/14
 */
public class Menu extends World
{
    //Variables
    int height;
    int width;
    //Used for decoration in the background
    int enemies = 20;
    int enemyStartX;
    int enemyStartY;
    
    //Constructor for objects of class Menu.
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //Assigning the width and height to variables
        width = getWidth();
        height = getHeight();
        
        //Calls the method addActors
        addActors();
    }
        
    //Adds all actors used in the Title world
    void addActors()
    {   
        //Creating actors
        Title title = new Title();
        Play play = new Play();
        Version version = new Version();
        
        //Addings enemies with a for loop
        for (int i = 1; i <= enemies; i++)
        {
            enemyStartX = randomNum(width);
            enemyStartY = randomNum(height);
            addObject(new Enemy(), enemyStartX, enemyStartY);
        }
        //Adding other actors
        addObject(title, 300, 100);
        addObject(play, 300, 200);
        addObject(version, 20, height - 10);
    }
    
    //Get a random num
    int randomNum(int num)
    {
        return Greenfoot.getRandomNumber(num);
    }
}
