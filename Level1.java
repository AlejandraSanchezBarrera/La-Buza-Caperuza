import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    private static CaperuzaGame caperuza;
    private int lives;
    private static int points=0;
    
    public Level1()
    {
        super();
        map();
        scoreBoard();
        items();
        caperuza=new CaperuzaGame();
        chacters();
        points=0;
        lives=caperuza.getlives();
        showText(" = " + lives, 1430, 30);
    }

    public void map(){
       for(int x=0; x < 1550; x+=72){
            this.addObject(new Wall(), x, 50);
            this.addObject(new Wall(), x, 900);
        }
        for(int y=0; y < 900; y+=55){
            this.addObject(new Wall(), 0, y);
            this.addObject(new Wall(), 1500, y);
        }
        for(int x=0; x < 400; x+=72){
            this.addObject(new HorizontalWall(), x, 160);
        }
        for(int x=1100; x < 1550; x+=72){
            this.addObject(new HorizontalWall(), x, 160);
        }

        for(int x=0; x < 1550; x+=72){
            this.addObject(new Scoreboard(), x, 20);
        }

        for(int x=610; x < 900; x+=70){
            this.addObject(new HorizontalWall(), x, 160);
            this.addObject(new HorizontalWall(), x, 786);
        }

        for(int x=0; x < 300; x+=70){
            this.addObject(new HorizontalWall(), x, 260);
            this.addObject(new HorizontalWall(), x, 586);
        }
        for(int x=150; x < 400; x+=70){
            this.addObject(new HorizontalWall(), x, 410);
            this.addObject(new HorizontalWall(), x, 776);
        }
        for(int x=1100; x < 1550; x+=70){
            this.addObject(new HorizontalWall(), x, 776);
        }
        for(int y=270; y < 700; y+=55){
            this.addObject(new VerticalWall(), 630, y);
            this.addObject(new VerticalWall(), 850, y);
        }
        for(int y=270; y < 716; y+=55){
            this.addObject(new VerticalWall(), 1280, y);
        }
        
        for(int y=180,z=630; y < 300; y+=55,z+=55){
            this.addObject(new VerticalWall(), 1080, y);
            this.addObject(new VerticalWall(), 1080, z);
            
        }
        
        for(int y=100,z=730; y < 300; y+=55,z+=55){
            this.addObject(new VerticalWall(), 995, y);
            this.addObject(new VerticalWall(), 995, z);
        }
        this.addObject(new HorizontalWall(), 990, 450);
        this.addObject(new HorizontalWall(), 1050, 450);
        this.addObject(new HorizontalWall(), 1100, 450);
        for(int y=180; y < 786; y+=56){
            this.addObject(new VerticalWall(), 400, y);
        }

        showText("LEVEL 1", 750, 20);

    }

    public void chacters(){
        addObject(caperuza, 50, 113);
        addObject(new Spider(), 200,220);
        addObject(new Spider(), 1350,200);
        addObject(new Spider(), 750,450);
        addObject(new Lives(), 1400,30);
        addObject(new Points(), 30, 20);
        addObject(new TeleportLevel1(),1460,830); 
    }
    
    public void items(){
        for(int x=100;x<1000;x+=50){
            addObject(new Berry(), x, 110);
            addObject(new Berry(), x, 840);
        }
        for(int x=1050;x<1500;x+=50){
            addObject(new Berry(), x, 100);
            addObject(new Berry(), x, 830);
        }
        for(int x=50;x<400;x+=50){
            addObject(new Berry(), x, 210);
            addObject(new Berry(), x, 310);
            addObject(new Berry(), x, 360);
            addObject(new Berry(), x, 450);
            addObject(new Berry(), x, 500);
            addObject(new Berry(), x, 550);
            addObject(new Berry(), x, 640);
            addObject(new Berry(), x, 690);
            addObject(new Berry(), x, 740);
        }
        for(int x=150;x<830;x+=50){
            addObject(new Berry(), 450, x);
            addObject(new Berry(), 500, x);
            addObject(new Berry(), 550, x);
        }
        for(int x=200;x<800;x+=50){
            addObject(new Berry(), 680, x);
            addObject(new Berry(), 740, x);
            addObject(new Berry(), 790, x);
            addObject(new Berry(), 900, x);
            addObject(new Berry(), 950, x);
        }
        for(int x=200;x<800;x+=50){
            addObject(new Berry(), 1330, x);
            addObject(new Berry(), 1380, x);
            addObject(new Berry(), 1430, x);
            addObject(new Berry(), 1230, x);
            addObject(new Berry(), 1180, x);
        }
        for(int x=200,z=500;x<450;x+=50,z+=50){
            addObject(new Berry(), 1130, x);
            addObject(new Berry(), 1030, z);
            addObject(new Berry(), 1130, z);
            addObject(new Berry(), 1030, x);
        }
        addObject(new Apple(),70,790);
    }

    public void scoreBoard(){
        for(int x=0; x < 1550; x+=72){
            this.addObject(new Scoreboard(), x, 20);
        }
        addObject(new Points(), 30, 20);
        showText("LEVEL 1", 750, 20);
        addObject(new TeleportLevel1(),1460,830); 
        addObject(new Lives(), 1400,30);
    }
}
