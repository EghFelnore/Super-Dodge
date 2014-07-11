import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Keeps track of how long the player is alive and displays it
 * 
 * @author Duta (http://www.greenfoot.org/users/3957) (code at http://www.greenfoot.org/scenarios/8157)
 * @version 7/9/14
 */
public class Timer extends Actor
{
    private boolean running = false;
    private int millisElapsed = 0;
    private long lastTime = 0;
  
    public Timer() {
        updateImage();
    }
    
    public void start() {
        millisElapsed = 0;
        lastTime = 0;
    }
    
    public void gamePaused() {
        lastTime = 0;
    }
    
    public void act() {
        long time = System.currentTimeMillis();
        if(lastTime != 0) {
            long diff = time - lastTime;
            millisElapsed += diff;
        }
        lastTime = time;
        
        updateImage();
    }
    
    public void updateImage() {
        // Calculate minutes & seconds elapsed
        int millis = millisElapsed % 1000;
        int secs = (millisElapsed / 1000) % 60;
        int mins = millisElapsed / 60000;
        // Convert these into text
        String millisText = String.format("%03d", millis);
        String secsText = String.format("%02d", secs);
        String minsText = "" + mins;
        String text = minsText + ":" + secsText + "." + millisText;
        // Update the image
        GreenfootImage img = new GreenfootImage(text, 20, Color.white, null);
        setImage(img);
    }
}
