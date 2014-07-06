import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world in which the game is actually played
 * 
 * @author Kaleb Dykema
 * @version 7/6/14
 */
public class Game extends World
{
    //Variables
    int height;
    int width;
    int playerStartX = 300;
    int playerStartY = 200;
    
    //Used in spawning enemies
    int enemies = 20;
    int enemyStartX;
    int enemyStartY;
    int enemyPlayerSpawnDistance = 64;
    boolean validSpawn;
    
    //Constructor for objects of Game
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //Assigning the width and height to variables
        width = getWidth();
        height = getHeight();
        
        //Calls the method addActors
        addActors();
    }
    
    //Adds all actors used in the Game world
    void addActors()
    {
        //Creating the actors
        Player player = new Player();    
        
        //Addings the actors
        addObject(player, playerStartX, playerStartY);
        //For loop to add enemies (based on enemies int)
        for(int i = 1; i <= enemies; i++)
        {
            //Variables
            validSpawn = false;
            enemyStartX = randomNum(width);
            enemyStartY = randomNum(height);
            
            //Do while loop to keep enemies from spawning near the player
            do
            {
                //Checks if the enemy spawns within 30 pixels of the player
                if(enemyStartX >= playerStartX - enemyPlayerSpawnDistance && 
                   enemyStartX <= playerStartX + enemyPlayerSpawnDistance &&
                   enemyStartY >= playerStartY - enemyPlayerSpawnDistance && 
                   enemyStartY <= playerStartY + enemyPlayerSpawnDistance)
                {
                    //Re-randomizes the enemy's coordinates
                    enemyStartX = randomNum(width);
                    enemyStartY = randomNum(height);
                }
                //If the enemy spawned outside of the player's spawning area
                else
                {
                    addObject(new Enemy(), enemyStartX, enemyStartY);
                    validSpawn = true;
                }
            }
            while(!validSpawn);
        }
    }
    
    //Get a random num
    int randomNum(int num)
    {
        return Greenfoot.getRandomNumber(num);
    }
}
