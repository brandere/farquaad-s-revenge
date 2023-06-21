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
        addObject(new Shrek(), 572, 188);
        addObject(new PigBarrel1(), 533, 195);
        addObject(new PigStack(), 652, 203);
        //floor code
        addObject(new FlatFloor2(), 20, 795);
        addObject(new FlatFloor2(), 69, 795);
        addObject(new FlatFloor2(), 165, 795);
        addObject(new FlatFloor2(), 260, 795);
        addObject(new FlatFloor2(), 356, 795);
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
       
        addObject(new TopLadder(), 443,279);
        addObject(new Ladder(), 443,340);
        addObject(new TopLadder(), 591,412);
        addObject(new Ladder(), 591,456);
        addObject(new TopLadder(), 286,398);
        addObject(new Ladder(), 286,470);
       
        addObject(new Ladder(), 478,547);
        addObject(new TopLadder(), 478,523);
        addObject(new Ladder(), 478,619);

        addObject(new TopLadder(), 214,664);
        addObject(new TopLadder(), 231,153);
        addObject(new Ladder(), 231,217);
        addObject(new Ladder(), 214,708);
        addObject(new Ladder(), 214,752);
    
        addObject(player, 44, 747);
       
    }

    public void act(){
        getPig++;
        pigBarrel++;
        //Targetted pig timer
        if (getPig == 480){
            addObject(new PigBarrel2(),player.getX(), 50);
            getPig = 0;
        }
        //Normal pig timer
        if(pigBarrel == 240){
            addObject(new PigBarrel1(),533,195);
            pigBarrel = 0;
            pigBarrel++;
        }
    }

}