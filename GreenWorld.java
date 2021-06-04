import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenWorld extends World
{
    private int scoreAreaHeight = 60;
    public Scoreboard sb;
    private CaperuzaG c;
    private int startBugX = 340;
    private int startBugY = 220;
    private CaperuzaG caperuza;
    
    /**
     * Constructor for objects of class GreeWorld.
     * 
     */
    public GreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500,900,1); 
        String[] map = {};
        prepare();
    }
    
    private void prepare(){
        caperuza=new CaperuzaG();
        sb = new Scoreboard();
        addObject(sb, getWidth()/2, 30);
    }
   
    public int getAdjustedHeight(){
        return getHeight()-scoreAreaHeight;
    }
    
    protected void drawMap(String[] textMap){
        for(int i=0; i<textMap.length;i++){
            String mapLine=textMap[i];
            for(int j=0;j<mapLine.length();j++){
                char mapChar=mapLine.charAt(j);
                int y=i*56+85; //aquí hay que ver dimensiones de las imagenes para acomdarlo
                int x=j*72+36;
                switch(mapChar){
                    case '/':
                        addObject(new Wall(),x,y);
                        break;
                    case '.':
                        addObject(new Berry(),x,y);
                        break;
                    case '+':
                        addObject(new Apple(),x,y);
                        break;
                    case 'C':
                        addObject(new CaperuzaG(),x,y);
                        break;
                    case '-':
                        addObject(new Wolf(),x,y);
                        break;
                    case 's':
                        addObject(new Spider(),x,y);
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    public int getScoreAreaHeight(){
        return scoreAreaHeight;
    }
    
    public void changeScore(int amount){
        sb.changeScore(amount);
    }
    
    protected boolean levelIsComplete(){
        return getObjects(Collectable.class).isEmpty();
    }
    
    public GreenfootImage getPlayerImage(){
        CaperuzaG C = new CaperuzaG();
        return C.getImage();
    }
    
    public void loseLife(){
        removeObject(caperuza);
        if(sb.getLives()>0){
            addObject(caperuza, startBugX, startBugY);
            sb.loseLife();
        }
    }
}