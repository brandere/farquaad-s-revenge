import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    Player player;
     int getPig;
    boolean win = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1);
        player = new Player();
        addObject(player, 500, 500);
        addObject(new PigBarrel(), 100, 50);
    }
    public void act(){
       while(win = false){
        getPig++;
        if (getPig > 180){
            getPig = 0;
            addObject(new PigBarrel(),player.getX(), 50);
        }
    }
}
}



