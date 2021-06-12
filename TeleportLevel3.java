import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeleportLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeleportLevel3 extends Teleport
{
    /**
     * Act - do whatever the TeleportLevel3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(CaperuzaGame.class)){
            Greenfoot.setWorld(new Winner());
        }
    }    
}
