import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpScreen extends World
{

    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public HelpScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1); 
 
    
        
    }
    public void act(){
        if (Greenfoot.isKeyDown("backspace")){
            Greenfoot.setWorld(new StartScreen());
        }

    }
}

