import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeleportLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeleportLevel2 extends Teleport
{
    /**
     * Act - do whatever the TeleportLevel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(CaperuzaGame.class)){
            Greenfoot.setWorld(new Level3());
        }
    }    
}
