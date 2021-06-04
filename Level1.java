import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends GreenWorld
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
       super();
       String[] textMap={
          "/////////////////////",
          "C............+....../",
          "//////.//////./////./",
          "/...././/////./////./",
          "////././/////......./",
          "////././/////.///////",
          "/...././/////.../////",
          "/.////........../////",
          "/./////////./////////",
          "/./////////./////////",
          "/...w......./////.///",
          "////.//////........//",
          "////....../////....//",
          "/////////...s........",
          "/////////////////////",
        };
        drawMap(textMap);
        prepare();
    }
    
    private void prepare(){
        /*Spider spider1=new Spider();
        addObject(spider1, 65,100);
        Spider spider2=new Spider();
        addObject(spider2, 50,50);*/
        Spider spider3=new Spider();
        addObject(spider3, 80,200);
    }
    
    public Level1(int score){
        super();
        sb.setScore(score);
    }
    
    public void act(){
        
    }
}
