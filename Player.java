import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Character that can only jump when not in air.
 */
public class Player extends Actor
{
    int deltaX;
    int deltaY;
    final int speedX = 4;
    final int speedY = 4;
    final int jumpSpeed = 15;
    final int gravity = 1;
    
    /**
     * Boolean (True/False) variable used to remember whether character is in air or not.
     */
    boolean isInAir;
    

    
    
    
    /**
     * Act - do whatever the OneJumpPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int xLoc = getX();
        int yLoc = getY();
        movementControls();
        applyGravity();
        if(isTouching(PigBarrel1.class) || isTouching(PigBarrel2.class)){
            Greenfoot.setWorld(new LoseScreen());
        }
        if(isTouching(Damsel.class)){
            Greenfoot.setWorld(new WinScreen());
        }
    }
    
    /**
     * Checks movement keys and updates position.
     */
    public void movementControls()
    {
        deltaX = 0;
        
        if (Greenfoot.isKeyDown("left"))
        {
            deltaX = deltaX - speedX;
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            deltaX = deltaX + speedX;
        }
        
        if (isInAir == false && Greenfoot.isKeyDown("space"))
        {
            deltaY = -jumpSpeed;
        }
        
        if (Greenfoot.isKeyDown("up") && isTouching(Ladder.class))
        {
             new GreenfootImage("FarquaadBack.png");
            deltaY = deltaY - speedY;
        }
        if (Greenfoot.isKeyDown("down") && isTouching(Ladder.class))
        {
             new GreenfootImage("FarquaadBack.png");
            deltaY = deltaY + speedY;
        }
        
        
        
        setLocation(getX() + deltaX, getY() + deltaY);
    }
    
    /**
     * Checks whether standing on platform, and applies gravity if not.
     */
    public void applyGravity()
    {
      
           
        
        if (isTouching(Platform.class) || isTouching(FlatFloor.class) || isTouching(FlatFloor2.class))
        {
            new GreenfootImage("farquaad.png");
            deltaY = -1;     // Don't apply gravity.
            isInAir = false;
        }
        else    
        {
            deltaY = deltaY + gravity;// Apply gravity.
            isInAir = true;
        }
    }
}
