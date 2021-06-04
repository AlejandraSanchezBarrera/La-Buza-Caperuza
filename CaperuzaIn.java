import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaperuzaIn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaperuzaIn extends Actor
{
    /**
     * Act - do whatever the CaperuzaIn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;
    private int currentImage;
    
    public CaperuzaIn()
    {
        setImage("caperuza inicio.png");
    }
    
    public void act() 
    {
        move();
    }
    
    public void move(){
        if(counter == 0){
            if(currentImage == 0){
                setImage("caperuza inicio_izq.png");
            } else if (currentImage == 1){
                setImage("caperuza inicio_der.png");
            }

            currentImage = (currentImage + 1) % 2;
        }
        counter = (counter + 1)%10;
    }
    
    
}
