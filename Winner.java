import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends World
{
    public int finalPoints=0;
    
    public Winner()
    {    
        super(1500, 900, 1);
        addObject(new CaperuzaInicio(), 300,620);
        Greenfoot.delay(10);
        finalPoints=0;
        finalPoints=finalPoints+Level1.getScore();
        finalPoints=finalPoints+Level2.getScore();
        finalPoints=finalPoints+Level3.getScore();
        finalPoints=finalPoints-3;
        showText(""+finalPoints, 750, 20);
    }
    
    public void act(){
        Greenfoot.delay(600);
        Greenfoot.setWorld(new Menu());
    }
}
