import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaperuzaG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaperuzaG extends Actor
{
    /**
     * Act - do whatever the CaperuzaG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int OFFSET = 3;
    public CaperuzaG()
    {
        setImage("caperuzaR.png");
    }
    public void act() 
    {
        handleDirection();
    }  
    public void handleDirection(){
        int x = getX();
        int y = getY();

        if(Greenfoot.isKeyDown("right")){
            setLocation(x + OFFSET, y);
            setImage("caperuzaR.png");
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(x - OFFSET, y);
            setImage("caperuzaL.png");
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(x, y + OFFSET);
            setImage("caperuzaF.png");
        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(x, y - OFFSET);
            setImage("caperuzaB.png");
        }
    }
}
