import greenfoot.*;
public class Player extends Actor
{
    
    private int speed;
    private int gravity;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        speed = 5;
        getInputs();
        gravity--;
       setLocation(getX(), getY() - gravity);
       checkForJump();
       if (isTouching(Plank.class)){
           gravity = 1;
           setLocation(getX(),getY());
       }
        //gravity();
    }
    public void getInputs()
    {
        
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 20);
           
        }
        
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 3);
       
        }
       
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            setLocation(getX() - 3, getY());

        }
       
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            setLocation(getX() + 3, getY());
        }
    }
    
    private void checkForJump()
    {
        
        Actor a = getOneIntersectingObject(Plank.class);
        if (isTouching(Plank.class) && Greenfoot.isKeyDown("space")){
             gravity = 20; // this will make the character jump
        }
    }
}


