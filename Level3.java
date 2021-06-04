import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends GreenWorld
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level3()
    {    
        super();
        String[] map={
            "",
            "",
            "",
            "",
        };
        drawMap(map);
    }
    
    public Level3(int score){
        super();
        sb.setScore(score);
    }
}