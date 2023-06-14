

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1); 
        
        
        addObject(new Plank(), 200, 500);
        addObject(new Plank(), 250, 500);
        addObject(new Plank(), 300, 500);
        addObject(new Plank(), 350, 500);
        addObject(new Plank(), 400, 500);
        addObject(new Plank(), 450, 500);
        addObject(new Plank(), 500, 500);
        addObject(new Plank(), 550, 500);
        addObject(new Plank(), 600, 500);
        addObject(new Plank(), 650, 500);
        addObject(new Ladder(), 300, 350);
        addObject(new Ladder(), 300, 400);
        addObject(new Ladder(), 300, 450);
        
         addObject(new Plank(), 200, 343);
        addObject(new Plank(), 250, 343);
        addObject(new Plank(), 300, 343);
        addObject(new Plank(), 350, 343);
        addObject(new Plank(), 400, 343);
        addObject(new Plank(), 450, 343);
        addObject(new Plank(), 500, 343);
        addObject(new Plank(), 550, 343);
        addObject(new Plank(), 600, 343);
        addObject(new Plank(), 650, 343);
        addObject(new Player(), 209, 453);
    }
}
