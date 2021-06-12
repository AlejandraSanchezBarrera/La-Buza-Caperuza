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

    public Spider(){
        setImage("arañaL.png");
    }

    public void act() 
    {
        move();
    }

    @Override
    public void moveimage(int dir){
        switch(dir){
            case 0:
            setImage("araña.png");
            break;

            case 1:
            setImage("arañaU.png");
            break;

            case 2:
            setImage("arañaL.png");
            break;

            case 3:
            setImage("arañaR.png");
            break;

        }
    }
}
