import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Enemiges
{
    private int offset = 1;
    
    public Spider(){
        setImage("araña.png");
        lives=1;
    }
    
    public void act() 
    {
        move();
    }
    
    @Override
    public void moveImage(int dir){
        switch(dir){
            case 0://up
            setImage("araña.png");
            break;

            case 1://down
            setImage("arañaU.png");
            break;

            case 2://r
            setImage("arañaL.png");
            break;

            case 3://l
            setImage("arañaR.png");
            break;

        }
    }
    @Override
    public int getOffset(){
        return offset;
    }
}
