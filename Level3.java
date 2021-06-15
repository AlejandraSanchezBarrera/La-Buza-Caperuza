import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{
    private static CaperuzaGame caperuza;
    private int lives;
    private static int points=0;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        super();
        map();
        caperuza=new CaperuzaGame();
        chacters();
        items();
        points=0;
        lives=caperuza.getlives();
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
        for(int x=0, z=1200; x<300; x+=72,z+=72){
            this.addObject(new HorizontalWall(), x, 170);
            this.addObject(new HorizontalWall(), x, 480);
            this.addObject(new HorizontalWall(), x, 780);
            this.addObject(new HorizontalWall(), z, 170);
            this.addObject(new HorizontalWall(), z, 480);
            this.addObject(new HorizontalWall(), z, 780);
        }
        for(int x=200, z=985; x<500; x+=72,z+=72){
            this.addObject(new HorizontalWall(), x, 325);
            this.addObject(new HorizontalWall(), x, 630);
            this.addObject(new HorizontalWall(), z, 325);
            this.addObject(new HorizontalWall(), z, 630);
        }
        for(int x=0; x<300; x+=55){
            this.addObject(new VerticalWall(), 600, x);
            this.addObject(new VerticalWall(),900, x);
        }
        for(int x=700; x<900; x+=55){
            this.addObject(new VerticalWall(), 600, x);
            this.addObject(new VerticalWall(),900, x);
        }
        for(int x=430; x<550; x+=55){
            this.addObject(new VerticalWall(), 600, x);
            this.addObject(new VerticalWall(),900, x);
        }
        
        for(int x=180; x < 780; x+=55){
            this.addObject(new VerticalWall(), 750, x);
        }

        for(int x=0; x < 1550; x+=72){
            this.addObject(new Scoreboard(), x, 20);
        }
        
        showText("LEVEL 3", 750, 20);

    }
    
    public void items(){
        for(int x=50;x<600;x+=50){
            addObject(new Berry(), x, 100);
            addObject(new Berry(), x, 230);
            addObject(new Berry(), x, 280);
            addObject(new Berry(), x, 380);
            addObject(new Berry(), x, 430);
            addObject(new Berry(), x, 530);
            addObject(new Berry(), x, 580);
            addObject(new Berry(), x, 680);
            addObject(new Berry(), x, 730);
            addObject(new Berry(), x, 830);
        }
        for(int x=350;x<600;x+=50){
            addObject(new Berry(), x, 180);
            addObject(new Berry(), x, 480);
            addObject(new Berry(), x, 780);
        }
        for(int x=950;x<1500;x+=50){
            addObject(new Berry(), x, 100);
            addObject(new Berry(), x, 230);
            addObject(new Berry(), x, 280);
            addObject(new Berry(), x, 380);
            addObject(new Berry(), x, 430);
            addObject(new Berry(), x, 530);
            addObject(new Berry(), x, 580);
            addObject(new Berry(), x, 680);
            addObject(new Berry(), x, 730);
            addObject(new Berry(), x, 830);
        }
        for(int x=950;x<1200;x+=50){
            addObject(new Berry(), x, 180);
            addObject(new Berry(), x, 480);
            addObject(new Berry(), x, 780);
        }
        for(int x=650;x<900;x+=50){
            addObject(new Berry(), x, 100);
            addObject(new Berry(), x, 780);
            addObject(new Berry(), x, 830);
        }
        for(int x=150;x<800;x+=50){
            addObject(new Berry(), 650, x);
            addObject(new Berry(), 700, x);
            addObject(new Berry(), 800, x);
            addObject(new Berry(), 850, x);
        }
        addObject(new Apple(),600,350);
        addObject(new Apple(),900,630);
    }

    public void chacters(){
        addObject(caperuza, 50, 113);
        addObject(new Wolf(), 700,450);
        addObject(new Lives(), 1400,30);
        addObject(new TeleportLevel3(),1460,830);
        addObject(new Points(), 30, 20);
        addObject(new Spider(), 100,300);
        addObject(new Spider(), 100,650);
        addObject(new Spider(), 1400,300);
        addObject(new Spider(), 1400,650);
        addObject(new Spider(), 830,800);
    }
}
