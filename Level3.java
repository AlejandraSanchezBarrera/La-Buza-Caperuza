import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends GreenWorld
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level3()
    {    
        super();
        String[] map={
            "",
            "",
            "",
            "",
        };
        drawMap(map);
        //prepare();
    }
    
    /*private void prepare(){ //cambiar coordenadas donde aparecerán 
        Spider spider1=new Spider();
        addObject(spider1, 65,100);
        Spider spider2=new Spider();
        addObject(spider2, 50,50);
        Spider spider3=new Spider();
        addObject(spider3, 80,200);
    }*/
    
    public Level3(int score){
        super();
        sb.setScore(score);
    }
}