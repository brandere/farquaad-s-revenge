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
    int pigBarrel = 0;
    int countDown = 10;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {    
        super(700, 800, 1);
        addObject(new Damsel(), 130, 75);
        addObject(new PigBarrel1(), 496, 161);
        //floor code

        addObject(new Platform2(),554,785);
        addObject(new Platform1(), 474,663);
        addObject(new Platform1(), 179,647);
        addObject(new FlatFloor1(), 1, 631);
        addObject(new Platform2(),225,522);
        addObject(new Platform2(),515,507);
        addObject(new FlatFloor2(),705,491);
        addObject(new Platform1(), 368,378);
        addObject(new FlatFloor1(), 172, 368);
        addObject(new FlatFloor1(), 79, 368);
        addObject(new FlatFloor1(), 1, 368);
        addObject(new Platform2(),220,268);
        addObject(new Platform2(),371,265);
        addObject(new FlatFloor1(),564,392);
        addObject(new FlatFloor2(), 565, 247);
        addObject(new FlatFloor2(), 663, 247);
        addObject(new FlatFloor2(), 77, 136);
        addObject(new FlatFloor2(), 175, 136);

        addObject(new Ladder(), 443,340);
        addObject(new TopLadder(), 591,412);
        addObject(new Ladder(), 591,456);
        addObject(new TopLadder(), 286,398);
        addObject(new Ladder(), 286,470);
        
        addObject(new Ladder(), 478,547);
        addObject(new TopLadder(), 478,523);
        addObject(new Ladder(), 478,619);

    }

    public void act(){
        getPig++;
        pigBarrel++;
        if (getPig == 540){
            addObject(new PigBarrel2(),player.getX(), 50);
            getPig = 0;
        }
        if(pigBarrel == 240){
            addObject(new PigBarrel1(),496,161);
            pigBarrel = 0;
        }
    }

}



