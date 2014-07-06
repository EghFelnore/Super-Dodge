import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The user plays this actor
 * 
 * @author Kaleb Dykema
 * @version 7/5/14
 */
public class Player extends Actor
{
    //Variables
    int speed = 4;
    
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
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
        }
        //If S or DOWN is pressed, player moves down
        else if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
        }
        //If A or LEFT is pressed, player moves left
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            move(-speed);
        }
        //If D or RIGHT is pressed, player moves right
        else if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
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
        getWorld().removeObject(this);
    }
}
