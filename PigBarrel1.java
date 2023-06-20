import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PigBarrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PigBarrel1 extends Actor
{
    private int gravity = 9;
    int speed = 1;
   
    
 
    /**
     * Act - do whatever the PigBarrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         int xLoc = getX();
         int yLoc = getY();
             if(!isTouching(Platform1.class)){
                setLocation(xLoc, yLoc + gravity);
            }
            if (xLoc >= 690){
                 setLocation(xLoc - 20, yLoc + gravity);
            }
            if (xLoc <= 10){
                 setLocation(xLoc - 20, yLoc + gravity);
            }
            //Detect Collision
            if (isTouching(Platform1.class)){
                setLocation(xLoc, yLoc);
                move(4);
            }
            if(isTouching(Platform2.class)){
                setLocation(xLoc, yLoc);
                move(-4);
            }
            if(isTouching(FlatFloor2.class)){
                setLocation(xLoc, yLoc);
                move(-4);
            }
            if(isTouching(FlatFloor1.class)){
                setLocation(xLoc, yLoc);
                move(4);
            }

            if (xLoc < 10){
               getWorld().removeObject(this);
            }
            
}
}
