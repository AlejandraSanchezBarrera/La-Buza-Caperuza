import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
    * Constructor for objects of class MyWorld.
    * 
    */
    public Menu()
    {    
        super(1500, 900, 1); 
        prepareMenu();
    }
    
    private void prepareMenu(){
        addObject(new CaperuzaIn(), 300,500);
        addObject(new Tittle(),940,230);
        addObject(new Play(),800,500);
        addObject(new ComoJugar(),1050,650);
        addObject(new Records(),1300,790);
    }
    
    
}
