import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bounces around the screen damaging the player
 * 
 * @author Kaleb Dykema 
 * @version 7/6/14
 */
public class Enemy extends Actor
{
    //Variables
    int speed = 2;
    //1 is up, 2 is down, 3 is left, 4 is right. 5 is left and right, 6 is left and down, 7 is right and up, 8 is right and down.
    int direction = Greenfoot.getRandomNumber(7) + 1;
    
    //Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
    public void act() 
    {
        properlyMove();
    }
    
    //Calls all moving involved methods
    void properlyMove()
    {
        randomlyMove();
        isTouchingBorder();
    }
    
    //The enemy moves randomly
    void randomlyMove()
    {
        //Moves up
        if(direction == 1)
        {
            setLocation(getX(), getY() - speed); 
        }
        //Moves down
        else if(direction == 2)
        {
            setLocation(getX(), getY() + speed);
        }
        //Moves left
        else if(direction == 3)
        {
            setLocation(getX() - speed, getY());
        }
        //Moves right
        else if(direction == 4)
        {
            setLocation(getX() + speed, getY());
        }
        else checkForDiagonal();
    }
    
    //Used by randomlyMove() to check if the direction is diagonal
    void checkForDiagonal()
    {
        //Move up and left
        if(direction == 5)
        {
            setLocation(getX() - speed, getY() - speed);
        }
        //Moves down and left
        else if(direction == 6)
        {
            setLocation(getX() - speed, getY() + speed);
        }
        //Move up and right
        else if(direction == 7)
        {
            setLocation(getX() + speed, getY() - speed);
        }
        //Moves down and right
        else if(direction == 8)
        {
            setLocation(getX() + speed, getY() + speed);
        }
    }
    
    //Checks if enemy is touching border
    void isTouchingBorder()
    {
        //If enemy is on the left or right border, bounces them off
        if (getX() <= 1 || getX() >= getWorld().getWidth() - 1)
        {
            randomizeDirection();
        }
        //If enemy is on the top or bottom border, bounces them off
        if (getY() <=1 || getY() >= getWorld().getHeight() - 1)
        {
            randomizeDirection();
        }
    }
    
    //Called by isTouchingBorder() to get a new direction
    void randomizeDirection()
    {
        direction = Greenfoot.getRandomNumber(7) + 1;
    }
}