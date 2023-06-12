import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Instructions(){
    
        GreenfootImage img = new GreenfootImage (900,100);//creates image
       //img.setColor(new Color(0,0,0));//sets color
       //img.fill();//Fills image
       
       img.setColor(new Color (255,255,255));
       img.setFont(new Font("Times New Roman", true, false, 40)); //Name , bold(T,F),italic(t,f),size
       img.drawString("Farquaad's Revenge",5,50);
       setImage(img);
    }
}
