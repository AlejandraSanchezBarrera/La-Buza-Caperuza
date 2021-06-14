import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import javax.swing.JOptionPane;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public int finalPoints=0;
    public Save save=new Save();
    private String name;
    
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
        showText("PUNTAJE FINAL = "+finalPoints, 1200, 150);
        addObject(new Regresar(),1400,850);
        addObject(save,1200,250);
    }
    
    public void act(){
        if(save.getFalgStatus() == 1){
            save.guardado(finalPoints);
        }
    }
}
