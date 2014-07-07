import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The user plays this actor
 * 
 * @author Kaleb Dykema
 * @version 7/6/14
 */
public class Player extends Actor
{
    //Variables
    int speed = 4;
    //Keys that are pressed to move the character
    public String[] moveForwardKeys = {"w", "up"};
    public String[] moveBackwardKeys = {"s", "down"};
    public String[] moveLeftKeys = {"a", "left"};
    public String[] moveRightKeys = {"d", "right"};
    
    //Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment
    public void act() 
    {
        movePlayer();
        isEnemyTouching();
    }    
    
    //Allows user to move the player
    void movePlayer()
    {
        //If W or UP is pressed, player moves up
        if(Greenfoot.isKeyDown(moveForwardKeys[0]) || Greenfoot.isKeyDown(moveForwardKeys[1]))
        {
            setLocation(getX(), getY() - speed);
        }
        //If S or DOWN is pressed, player moves down
        else if(Greenfoot.isKeyDown(moveBackwardKeys[0]) || Greenfoot.isKeyDown(moveBackwardKeys[1]))
        {
            setLocation(getX(), getY() + speed);
        }
        //If A or LEFT is pressed, player moves left
        if(Greenfoot.isKeyDown(moveLeftKeys[0]) || Greenfoot.isKeyDown(moveLeftKeys[1]))
        {
            move(-speed);
        }
        //If D or RIGHT is pressed, player moves right
        else if(Greenfoot.isKeyDown(moveRightKeys[0]) || Greenfoot.isKeyDown(moveRightKeys[1]))
        {
            move(speed);
        }
    }
    
    //If an enemy touches the player, the player dies
    void isEnemyTouching()
    {
        if(this.isTouching(Enemy.class))
        {
            die();
        }
    }
    
    //Called by isEnemyTouching() if an enemy touches the player
    void die()
    {
        getWorld().addObject(new GameOver(), 300, 100);
        getWorld().removeObject(this);
    }
}
