import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private static final int GRAVITY = 1;
    private int vSpeed;
    private int hSpeed;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getInputs();
        //gravity();
    }
    public void getInputs()
    {
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 3);
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX() + 3, getY());
        }
    }
    public void gravity()
    {
        vSpeed += GRAVITY;
        hSpeed += GRAVITY;
        setLocation(getX(), getY()+vSpeed);
        setLocation(getX(), getY()+hSpeed);
    }
}
