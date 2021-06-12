import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaperuzaG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaperuzaG extends Characters
{
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

        public void enemiges(){
        if(isTouching(Enemiges.class)){
            setLocation(50,150);
        }
    }
    public void collisions(){
        int x = getX();
        int y = getY();
        if(isTouching(Obstacle.class)){

            if(Greenfoot.isKeyDown("right")){
                setLocation(x - OFFSET, y);
            }
            else if(Greenfoot.isKeyDown("left")){
                setLocation(x + OFFSET, y);
            }
            else if(Greenfoot.isKeyDown("down")){
                setLocation(x, y - OFFSET);
            }
            else if(Greenfoot.isKeyDown("up")){
                setLocation(x, y + OFFSET);
            }

        }
    }
}
