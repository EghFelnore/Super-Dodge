import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Same as the play class, except displayed after the player dies in the game
 * 
 * @author Kaleb Dykema
 * @version 7/6/14
 */
public class Replay extends Play
{
    //Act - do whatever the Replay wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
    public void act() 
    {
        //Calls the method from the Play class to check if the button is clicked. If so, calls startGame()
        isButtonClicked();
    }    
}
