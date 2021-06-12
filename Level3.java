import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{
    private static CaperuzaGame caperuza;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        super();
        map();
        caperuza=new CaperuzaGame();
        chacters();
    }

    public void map(){
        for(int x=0; x < 1550; x+=72){
            this.addObject(new Wall(), x, 50);
            this.addObject(new Wall(), x, 900);
        }
        for(int y=0; y < 900; y+=55){
            this.addObject(new Wall(), 0, y);
            this.addObject(new Wall(), 1500, y);
        }
        for(int x=0; x < 1550; x+=72){
            this.addObject(new Scoreboard(), x, 20);
        }
        showText("LEVEL 3", 750, 20);
        addObject(new TeleportLevel3(),1460,830); 
    }

    public void chacters(){
        addObject(caperuza, 1400, 820);
    }
}
