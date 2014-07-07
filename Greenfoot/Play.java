import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The play button that starts the game; in the main menu
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    //Act - do whatever the Play wants to do. This method is called wheneverthe 'Act' or 'Run' button gets pressed in the environment.
    public void act() 
    {
        isButtonClicked();
    }
    
    //Checks if someone clicked Play
    void isButtonClicked()
    {
        if(Greenfoot.mouseClicked(null))
        {
            startGame();
        }
    }
    
    //Opens the world Game
    void startGame()
    {
        Greenfoot.setWorld(new Game());
    }
}
