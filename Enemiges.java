import greenfoot.*;  

public class Enemiges extends Characters
{
    protected int lives;
    private int offset = 3;
    private int direction=3;

    public Enemiges(){
        getOffset();
    }

    public void move(){
        int x = getX();
        int y = getY();
        switch(direction){
            case 0:
            setLocation(x, y + offset);
            break;

            case 1:
            setLocation(x, y - offset);
            break;

            case 2:
            setLocation(x - offset, y);

            break;

            case 3:
            setLocation(x + offset, y);
            break;

        }

        if(isTouching(Obstacle.class)){
            getDireccion();
        }
    } 

    public void getDireccion(){
        int x = getX();
        int y = getY();

        switch(direction){
            case 0:
            setLocation(x, y - offset);
            changeDir();
            break;

            case 1:
            setLocation(x, y + offset);
            changeDir();
            break;

            case 2:
            setLocation(x + offset, y);
            changeDir();
            break;

            case 3:
            setLocation(x - offset, y);
            changeDir();
            break;

        }
    } 

    public void changeDir(){
        switch(Greenfoot.getRandomNumber(4)){
            case 0:
            direction=0;
            moveImage(direction);
            break;

            case 1:
            direction=1;
            moveImage(direction);
            break;

            case 2:
            direction=2;
            moveImage(direction);
            break;

            case 3:
            direction=3;
            moveImage(direction);
            break;

        }
    } 

    public void moveImage(int direction){}

    public int getOffset(){
        return 1;
    }
}
