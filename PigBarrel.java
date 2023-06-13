import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PigBarrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PigBarrel extends Actor
{
    private int gravity = 9;
 
    /**
     * Act - do whatever the PigBarrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int yLoc = getY();
        setLocation(getX(), getY() + gravity);
         if(getY() >= 795){
            getWorld().removeObject(this);
         }
    
     
}
}
