import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    Player player = new Player();
    int getPig = 0;
    int countDown = 10;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1);
        addObject(new PigBarrel1(), 100, 50);
        //floor code
        addObject(new FlatFloor(), 20, 795);
        addObject(new FlatFloor(), 69, 795);
        addObject(new FlatFloor(), 165, 795);
        addObject(new FlatFloor(), 260, 795);
        addObject(new FlatFloor(), 356, 795);
        addObject(new Platform2(),554,776);
        addObject(new Platform1(), 477,669);
        addObject(new Platform1(), 182,632);
        addObject(new FlatFloor2(), 1, 616);
        addObject(new Platform2(),221,522);
        addObject(new Platform2(),515,485);
        addObject(new FlatFloor(),705,468);
         act();
    }

    public void act(){
        getPig++;
        if (getPig == 420){
            addObject(new PigBarrel2(),player.getX(), 50);
            getPig = 0;
        }

    }

}



