import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Levels
{
    private static CaperuzaGame caperuza= new CaperuzaGame();
    private int lives;
    private static int points=0;
    
    public Level2()
    {
        super();
        map();
        items();
        caperuza=new CaperuzaGame();
        chacters();
        points=0;
        lives=caperuza.getLives();
        showText(" = " + lives, 1430, 30);
    }

    public void map(){
        for(int x=0; x < 1550; x+=72){
            this.addObject(new Wall(), x, 50);
            this.addObject(new Wall(), x, 900);
        }
        for(int y=0; y < 900; y+=56){
            this.addObject(new Wall(), 0, y);
            this.addObject(new Wall(), 1500, y);
        }
        for(int x=150; x<600; x+=72){
            this.addObject(new HorizontalWall(), x, 160);
        }
        for(int y=0;y<150;y+=55){
            this.addObject(new VerticalWall(), 130, y);
        }
        for(int x=0; x<550; x+=72){
            this.addObject(new HorizontalWall(), x, 780);
        }
        for(int y=280;y<900;y+=55){
            this.addObject(new VerticalWall(), 650, y);
        }
        for(int x=800; x<1550; x+=72){
            this.addObject(new HorizontalWall(), x, 550);
        }
        for(int x=800; x<1100; x+=72){
            addObject(new HorizontalWall(), x,160);
            addObject(new HorizontalWall(), x,260);
            addObject(new HorizontalWall(), x,360);
            addObject(new HorizontalWall(), x,780);
        }
        for(int y=180;y<530;y+=55){
            addObject(new VerticalWall(), 1130, y);
            addObject(new VerticalWall(), 1250, y);
            addObject(new VerticalWall(), 1380, y);
            addObject(new VerticalWall(), 1380, y);
        }
        for(int y=680;y<900;y+=55){
            addObject(new VerticalWall(), 1380, y);
        }
        for(int y=300;y<650;y+=55){
            addObject(new VerticalWall(), 250, y);
            addObject(new VerticalWall(), 450, y);
        }
        for(int x=0; x < 1550; x+=72){
            addObject(new Scoreboard(), x, 20);
        }

        showText("LEVEL 2", 750, 20);
    }
    
    public void items(){
        for(int x=180;x<1480;x+=50){
            addObject(new Berry(), x, 110);
        }
        for(int x=50;x<650;x+=50){
            addObject(new Berry(), x, 840);
        }
        for(int x=780;x<1090;x+=50){
            addObject(new Berry(), x, 200);
            addObject(new Berry(), x, 300);
            addObject(new Berry(), x, 400);
            addObject(new Berry(), x, 450);
            addObject(new Berry(), x, 500);
            addObject(new Berry(), x, 600);
            addObject(new Berry(), x, 650);
            addObject(new Berry(), x, 700);
            addObject(new Berry(), x, 750);
            addObject(new Berry(), x, 850);
            
        }
        
        for(int x=200;x<800;x+=50){
            addObject(new Berry(), 50, x);
            addObject(new Berry(), 100, x);
            addObject(new Berry(), 150, x);
            addObject(new Berry(), 200, x);
            addObject(new Berry(), 300, x);
            addObject(new Berry(), 350, x);
            addObject(new Berry(), 400, x);
            addObject(new Berry(), 500, x);
            addObject(new Berry(), 550, x);
            addObject(new Berry(), 600, x);
        }
        for(int x=150;x<900;x+=50){
            addObject(new Berry(), 700, x);
            addObject(new Berry(), 750, x);
        }
        for(int x=150;x<550;x+=50){
            addObject(new Berry(), 1190, x);
            addObject(new Berry(), 1320, x);
            addObject(new Berry(), 1430, x);
        }
        for(int x=600;x<900;x+=50){
            addObject(new Berry(), 1190, x);
            addObject(new Berry(), 1140, x);
            addObject(new Berry(), 1320, x);
            addObject(new Berry(), 1250, x);
        }
        for(int x=600;x<800;x+=50){
            addObject(new Berry(), 1430, x);
        }
        addObject(new Apple(),450,700);
    }

    public void chacters(){
        addObject(caperuza, 50,113);
        addObject(new Lives(), 1400,30);
        addObject(new TeleportLevel2(),1460,830);
        addObject(new Points(), 30, 20);
        addObject(new Spider(), 250,200);
        addObject(new Spider(), 250,830);
        addObject(new Spider(), 1150,800);
        addObject(new Spider(), 1130,100);
        addObject(new Spider(), 750,200);
    }
    
    public static int getScore(){
        points+=caperuza.getPuntuacion();
        return points+1;
    }

    public static void reset(){
        caperuza.reset();
        points=0;
    }
}
