import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public int finalPoints=0;
    
    public GameOver()
    {    
        super(1500, 900, 1);
        GreenfootSound  sound = new GreenfootSound("gameOver.mp3");
        sound.setVolume(70); 
        sound.play();
        Greenfoot.delay(10);
        finalPoints=0;
        finalPoints=finalPoints+Level1.getScore();
        finalPoints=finalPoints+Level2.getScore();
        finalPoints=finalPoints+Level3.getScore();
        finalPoints=finalPoints-3;
        showText(""+finalPoints, 1450, 450);
    }
    
    public void act(){
        Greenfoot.delay(450);
        Greenfoot.setWorld(new Menu());
    }
}
