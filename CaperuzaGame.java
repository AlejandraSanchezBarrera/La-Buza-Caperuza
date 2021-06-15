import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaperuzaG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaperuzaGame extends Characters
{
    private static final int OFFSET = 4;
    private int points=0;
    private int direction=0;
    private int lives=3;
    private int skill=0;
    private int counter=800;
    public CaperuzaGame()
    {
        setImage("caperuzaR.png");
        points=0;
        lives=3;
        skill=0;
    }

    public void act() 
    {
        handleDirection();
        collisions();
        enemiges();
        eatItems();
        getlives();
        gameover();
        getulti();
        skillCounter();
    }  

    public void handleDirection(){
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right")){
            setLocation(x + OFFSET, y);
            setImage("caperuzaR.png");
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(x - OFFSET, y);
            setImage("caperuzaL.png");
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(x, y + OFFSET);
            setImage("caperuzaF.png");
        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(x, y - OFFSET);
            setImage("caperuzaB.png");
        }
    }

    public void enemiges(){
        World world;
        world= getWorld();
        Spider spider = null;
        if(isTouching(Enemiges.class)){
            if((isTouching(Spider.class))&& skill==1){

                spider = (Spider)getOneObjectAtOffset(10, 0, Spider.class);
                if(spider != null)
                {
                    world.removeObject(spider);
                    points = points + 50;
                }
            }
            else{
                setLocation(50, 113);
                lives --;
            }
        }
        getWorld().showText(" = " + lives, 1430, 30);
        getWorld().showText(" = " + points, 70, 20);
    }

    public void collisions(){
        int x = getX();
        int y = getY();
        if(isTouching(Obstacle.class)){

            if(Greenfoot.isKeyDown("right")){
                setLocation(x - OFFSET, y);
            }
            else if(Greenfoot.isKeyDown("left")){
                setLocation(x + OFFSET, y);
            }
            else if(Greenfoot.isKeyDown("down")){
                setLocation(x, y - OFFSET);
            }
            else if(Greenfoot.isKeyDown("up")){
                setLocation(x, y + OFFSET);
            }

        }
    }

    void eatItems(){
        if(isTouching(Items.class)){
            Items item = null;

            switch(direction)
            {
                case 3: 
                item = (Items)getOneObjectAtOffset(10, 0, Items.class);
                break;

                case 2: 
                item = (Items)getOneObjectAtOffset(-10, 0, Items.class);
                break;

                case 1: 
                item = (Items)getOneObjectAtOffset(0, 10, Items.class);
                break;

                case 0: 
                item = (Items)getOneObjectAtOffset(0, -10, Items.class);
                break;
            }

            if(item != null)
            {
                points = points + item.getPoints();
                World world;
                world= getWorld();
                world.removeObject(item);
                getWorld().showText(" = " + points, 70, 20);
            }

        }

    }

    public int getlives(){
        return lives;
    }

    public int getpoints(){
        return points;
    }

    public void gameover(){
        if(getlives()==0){
            Greenfoot.setWorld(new GameOver());
        }
    }

    public void reset(){
        points=0;
    }

    public void getulti(){
        if(isTouching(Apple.class)){
            skill=1;
        }
    }

    public void skillCounter(){
        if(skill == 1){
            counter--;
        }
        if(counter == 0){
            skill=0;
            counter=800;
        }
        World world;
        world= getWorld();
        getWorld().showText("Skill Time = " + counter, 1300, 30);
    }
}
