import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titletext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleText extends Actor
{
    /**
     * Act - do whatever the titletext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public TitleText(){
       GreenfootImage img = new GreenfootImage (900,100);//creates image
       //img.setColor(new Color(0,0,0));//sets color
       //img.fill();//Fills image
       
       img.setColor(new Color (255,255,255));
       img.setFont(new Font("Times New Roman", true, false, 40)); //Name , bold(T,F),italic(t,f),size
       img.drawString("Farquaad's Revenge",5,50);
       setImage(img);
    }
}
