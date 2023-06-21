import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Character that can only jump when not in air.
 */
public class Player extends Actor
{
    int walkSpeed = 3;
    //vertical speed
    int vSpeed = 0;
    int acceleration = 1;
    int jumpStrength = 16;
    int animationCounter = 0; 

    public void act() {
        checkCommand();
        checkFall();
        if(!isTouching(Ladder.class)){
            checkPlatformAbove();
        }
        endGame();

        
    }
    //call new world if win or lose
    public void endGame(){
        if(isTouching(PigBarrel1.class) || isTouching(PigBarrel2.class)){
            Greenfoot.setWorld(new LoseScreen());
        }
        if(isTouching(Damsel.class)){
            Greenfoot.setWorld(new WinScreen());
        }
    }
    //figure out whic key user is pressing
    public void checkCommand()
    {
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D"))
        {
            moveRight();
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A"))
        {
            moveLeft();
        }
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) {
            moveUp();
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")) {
            moveDown();
        }
        if(Greenfoot.isKeyDown("space")&& onGround())
        {
          jump();
        }
    }
    //player walks right
    public void moveRight()
    {
        setImage("farquaad.png");
        setLocation(getX()+walkSpeed, getY());          
    }
    //player walks left
    public void moveLeft()
    {
        setImage("farquaad.png");
        setLocation(getX()-walkSpeed, getY());
    }
    //player climbs up ladder
    public void moveUp() {
        if (isTouching(Ladder.class)) {
            setImage("Farquaadback.png");
            setLocation(getX(), getY()-walkSpeed);       
        }
    }
    //player climbs down ladder
    public void moveDown() {
         if (isTouching(Ladder.class)) {
             setImage("Farquaadback.png");
            setLocation(getX(), getY()+walkSpeed);       
        }       
    }
    //
    public void jump()
    {
        //jumping
        vSpeed = vSpeed - jumpStrength; 
        //set position of jump
        fall();
    }
    //set position of jump
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }
    }
    //keeps changing jump position until on ground
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            //prevents player from falling down ladder
            if (!isTouching(Ladder.class)){
                fall();
            }
        }
    }
    //fins out if player is hitting head on platform
    public void checkPlatformAbove()
    {
        int farquaadHeight = (getImage().getHeight()/-2);
        Actor ceiling = getOneObjectAtOffset(0, farquaadHeight, FlatFloor.class);
        //if intersecting ceiling set vertical speed so player will start to fall
        if(ceiling != null)
        {
            vSpeed = 1;
            hitHead(ceiling);
        }
    }
    //position player just below platform
    public void hitHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
    //check to see if bottom of player is touching top of platform
    public boolean onGround()
    {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, FlatFloor.class);
        Actor topLadder = getOneObjectAtOffset(0, getImage().getHeight()/2, TopLadder.class);
        if(ground == null)
        {
            return false;
        }
        else
        {
            //check topLadder so player can go down ladder
            if(topLadder == null){
                moveToGround(ground);
                return true;
            }
            
            else {
                return false;
            }
        }
    }
    //position player on top of platform below
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
}


