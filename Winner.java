import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import javax.swing.JOptionPane;

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends World
{
    public int finalPoints;
    public Save save=new Save();
    private String name;
    GreenfootSound  sound = new GreenfootSound("winner.mp3");
    
    public Winner()
    {
        super(1500, 900, 1);
        addObject(new CaperuzaInicio(), 300,620);
        sound.setVolume(60); 
        sound.play();
        Greenfoot.delay(10);
        finalPoints=0;
        finalPoints=finalPoints+Level1.getScore();
        finalPoints=finalPoints+Level2.getScore();
        finalPoints=finalPoints+Level3.getScore();
        finalPoints=finalPoints-3;
        showText("PUNTAJE FINAL = "+finalPoints, 1000, 450);
        addObject(new Regresar(),1400,850);
        addObject(save,1000,550);
    }
    
    public void act(){
        if(save.getFalgStatus() == 1){
            save.guardado(finalPoints);
       }
    }
}
