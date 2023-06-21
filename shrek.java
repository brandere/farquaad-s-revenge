import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shrek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shrek extends Actor
{
    int aniCounter;  //To keep track of which image is currently showing
    int aniTimer;
    GreenfootImage s1 = new GreenfootImage("shrek1.png");
    GreenfootImage s2 = new GreenfootImage("shrek2.png");
    GreenfootImage s3 = new GreenfootImage("shrek3.png");
    /**
     * Act - do whatever the shrek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    animate();

    }

    /**
     * animate - Animates the Fireball
     */
    public void animate()
    {
        //To not animate too quickly, only animate every 6 act cycles - alter this if your images are switching too quickly
        if (aniTimer % 55 == 0){
            //Set image based on current aniCounter value
            if (aniCounter == 1){setImage(s1);}
            else if (aniCounter == 2){setImage(s3);}
            else if (aniCounter == 3){setImage(s2);}
            

            //Increment aniCounter - if it is 5, set it back to 1
            aniCounter++;
            if (aniCounter == 10){ aniCounter=1;}
        }

        //Increment aniTimer
        aniTimer++;

       
    }
    }

