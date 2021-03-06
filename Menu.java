import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private GreenfootSound sound=null;
    
    private Save save;
    /**
    * Constructor for objects of class MyWorld.
    * 
    */
    public Menu()
    {    
        super(1500, 900, 1); 
        prepareMenu();
        save=new Save();
    }
    
    private void prepareMenu(){
        addObject(new CaperuzaInicio(), 300,550);
        addObject(new Tittle(),940,230);
        addObject(new Play(),800,500);
        addObject(new ComoJugar(),1050,650);
        addObject(new Records(),1300,790);
    }
    
    public void act()
    {
        if(sound==null || !sound.isPlaying()){
            sound= new GreenfootSound("waith.mp3");
            sound.setVolume(25);
            sound.playLoop();
        }
    }
}
