import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Collectable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collectable extends Actor
{
    int scoreValue = 0;
    GreenWorld w;
    
    public void addedToWorld(World w){
        this.w=(GreenWorld)w;
    }
    
    /**
     * Act - do whatever the Collectable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor caperuza=getOneIntersectingObject(CaperuzaG.class);
        if(caperuza!=null){
            w.changeScore(scoreValue);
            w.removeObject(this);
        }
    }    
}
