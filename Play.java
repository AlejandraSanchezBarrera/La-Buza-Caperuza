import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Boton
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            GreenfootSound  sound = new GreenfootSound("minecraft_click.mp3");
            sound.setVolume(100);
            Greenfoot.delay(10);
            sound.play();
            Greenfoot.delay(40);
            Greenfoot.setWorld(new Level1());
        }
    }     
}
