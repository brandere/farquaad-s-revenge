import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PigBarrel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PigBarrel2 extends Actor
{
     private int gravity = 9;
    int speed = 5;

 
    /**
     * Act - do whatever the PigBarrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int xLoc = getX();
        int yLoc = getY();
    setLocation(xLoc, yLoc + gravity);
            if (yLoc > 790){
               getWorld().removeObject(this);
            }
             
}
}