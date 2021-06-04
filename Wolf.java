import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Wolf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolf extends MovingActor
{
    Direction[] possibleDirections={Direction.UP, Direction.DOWN, Direction.LEFT,Direction.RIGHT};
    Direction currentDirection=Direction.RIGHT;
    int chanceToChangeDirection=1;
    
    public Wolf(){
        doesRotate=false;
        speed=1;
    }
    
    /**
     * Act - do whatever the Wolf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List<Direction> availableDirections=new ArrayList<>();
        for(Direction direction:possibleDirections){
            int xOffset=getXOffset(direction);
            int yOffset=getYOffset(direction);
            if(!isBlocked(xOffset,yOffset)){
                availableDirections.add(direction);
            }
        }
        
        if(!availableDirections.isEmpty()){
            boolean chaneDirection=Greenfoot.getRandomNumber(100)<chanceToChangeDirection;
            if(!availableDirections.contains(currentDirection)){
                currentDirection=availableDirections.get(Greenfoot.getRandomNumber(availableDirections.size()));
            }
            move(currentDirection);
        }
    }  
}