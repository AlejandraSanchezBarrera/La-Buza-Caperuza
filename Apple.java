import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Items
{
    private static final GreenfootImage image = new GreenfootImage("images/manzana.png");
    
    public Apple(){
        setImage(image);
        points = 10;
    }   
}
