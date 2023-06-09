import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1,false); 
        addObject(new TitleText(), 750,60);
        addObject(new Help(), 31,34);
        addObject(new Enter(), 710,100);
    }
    public void act(){
        if (Greenfoot.isKeyDown("ENTER")){
            Greenfoot.setWorld(new GameWorld());
        }
    }
}
