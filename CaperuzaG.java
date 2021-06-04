import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaperuzaG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaperuzaG extends MovingActor
{
    private int counter;
    private int currentImage;
    
    /**
     * Act - do whatever the CaperuzaG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public CaperuzaG(){
        setImage("caperuzaR.png");
    }
    
    public void act() 
    {
        handleDirection();
    } 
    
    public void handleDirection(){
        if(Greenfoot.isKeyDown("right")){
            move(Direction.RIGHT);
            setImage("caperuzaR.png");
        }
        else if(Greenfoot.isKeyDown("left")){
            move(Direction.LEFT);
            setImage("caperuzaL.png");
        }
        else if(Greenfoot.isKeyDown("down")){
            move(Direction.DOWN);
            setImage("caperuzaF.png");
        }
        else if(Greenfoot.isKeyDown("up")){
            move(Direction.UP);
            setImage("caperuzaB.png");
        }
    }
}
