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
        super(700, 800, 1);
        addObject(player, 36,746);
        addObject(new PigBarrel1(), 496, 161);
        //floor code
        addObject(new FlatFloor(), 20, 795);
        addObject(new FlatFloor(), 69, 795);
        addObject(new FlatFloor(), 165, 795);
        addObject(new FlatFloor(), 260, 795);
        addObject(new FlatFloor(), 356, 795);

        
        addObject(new Shrek(), 537,187);
        addObject(new pigStack(), 648,205);
        
    


        addObject(new Platform2(),554,785);
        addObject(new Platform1(), 474,663);
        addObject(new Platform1(), 178,642);
        addObject(new FlatFloor2(), 1, 631);
        addObject(new Platform2(),225,522);
        addObject(new Platform2(),514,501);
        addObject(new FlatFloor(),705,491);
        addObject(new Platform1(), 467,386);
        addObject(new Platform1(), 368,378);
        addObject(new FlatFloor2(), 172, 368);
        addObject(new FlatFloor2(), 79, 368);
        addObject(new FlatFloor2(), 1, 368);
        addObject(new Platform2(),220,268);
        addObject(new Platform2(),368,258);
        addObject(new FlatFloor2(), 565, 247);
        addObject(new FlatFloor2(), 663, 247);
        addObject(new FlatFloor2(), 77, 136);
        addObject(new FlatFloor2(), 175, 136);

    }

    public void act(){
        getPig++;
        if (getPig == 420){
            addObject(new PigBarrel2(),player.getX(), 50);
            getPig = 0;
        }

    }

}



