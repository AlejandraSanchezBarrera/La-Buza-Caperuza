import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.io.File;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends World
{
    public Save save=new Save();
    
     public Score()
    {    
        super(1500, 900, 1);        
        addObject(new Regresar(),1400,850);
    }
    
    public void act() 
    {
       muestraPuntos();
       muestraNombres();
    }
    
    public void muestraPuntos() 
    {
        int x=1000;
        int y=250;
        try{
            FileReader fr=new FileReader("Puntajes de scores.txt");
            BufferedReader br=new BufferedReader(fr);
            String cadena;
            while((cadena=br.readLine())!=null)
            {
                y+=50;
                showText(""+cadena,x,y);
            }
        }catch(Exception e){System.out.println(e.getMessage());}
        
    }
    
    public void muestraNombres() 
    {
        int x=700;
        int y=250;
        int i=1;
        try{
            FileReader fr=new FileReader("Nombre de Scores.txt");
            BufferedReader br=new BufferedReader(fr);
            String cadena;
            while((cadena=br.readLine())!=null)
            {
                y+=50;
                showText(""+cadena,x,y);
                showText(""+i + ".-",400,y);
                i++;
            }
        }catch(Exception e){System.out.println(e.getMessage());}
        
    }
}
