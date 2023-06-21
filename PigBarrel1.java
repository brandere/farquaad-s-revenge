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
    //Animation
    int aniTimer;
    int aniCounter;
    GreenfootImage s1 = new GreenfootImage("PigUp.png");
    GreenfootImage s2 = new GreenfootImage("PigLeft.png");
    GreenfootImage s3 = new GreenfootImage("PigRight.png");
    GreenfootImage s4 = new GreenfootImage("PigDown.png");
    
    /**
     * Act - do whatever the PigBarrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //X & Y location
         int xLoc = getX();
         int yLoc = getY();
         //Gravity
             if(!isTouching(Platform1.class)){
                setLocation(xLoc, yLoc + gravity);
             
            }
            //Keep in world
            if (xLoc >= 690){
                 setLocation(xLoc - 20, yLoc + gravity);
            }
            if (xLoc <= 10){
                 setLocation(xLoc - 20, yLoc + gravity);
            }
            //Detect Movement
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
            //Remove Object
            if (xLoc < 10){
               getWorld().removeObject(this);
            }
            //Call method
            animate();
}
 public void animate()
    {
        if (aniTimer % 10 == 0){
            //Set image based on current aniCounter value
            if (aniCounter == 1){setImage(s1);}
            else if (aniCounter == 2){setImage(s2);}
            else if (aniCounter == 3){setImage(s3);}            
            else if (aniCounter == 4){setImage(s4);}

            //Increment aniCounter - if it is 5, set it back to 1
            aniCounter++;
            if (aniCounter == 5){ aniCounter=1;}
        }

        //Increment aniTimer
        aniTimer++;
    }
   
}
