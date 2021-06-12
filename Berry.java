import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class berry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Berry extends ITEMS
{
    private static final GreenfootImage image = new GreenfootImage("images/baia.png");
    
    public Berry(){
        setImage(image);
        points = 10;
    }    
}
