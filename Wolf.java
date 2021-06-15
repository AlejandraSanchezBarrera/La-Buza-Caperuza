import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Wolf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolf extends Enemiges
{
    private int offset = 3;
    
    public Wolf(){
        setImage("LoboR.png");
        int lives=2;
    }

    public void act() 
    {
        move();
    }

    public void moveImage(int dir){
        switch(dir){
            case 0:

            break;

            case 1:

            break;

            case 2:
            setImage("LoboL.png");
            break;

            case 3:
            setImage("LoboR.png");
            break;

        }
    }
    
    public int getOffset(){
        return offset;
    }
}