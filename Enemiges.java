import greenfoot.*;  
public class Enemiges extends Characters
{
    private int offset = 3;
    private int direction=3;

    public Enemiges(){

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
            getdireccion();
        }
    } 

    public void getdireccion(){
        int x = getX();
        int y = getY();

        switch(direction){
            case 0:
            setLocation(x, y - offset);
            changedir();
            break;

            case 1:
            setLocation(x, y + offset);
            changedir();
            break;

            case 2:
            setLocation(x + offset, y);
            changedir();
            break;

            case 3:
            setLocation(x - offset, y);
            changedir();
            break;

        }
    } 

    public void changedir(){
        switch(Greenfoot.getRandomNumber(4)){
            case 0:
            direction=0;
            moveimage(direction);
            break;

            case 1:
            direction=1;
            moveimage(direction);
            break;

            case 2:
            direction=2;
            moveimage(direction);
            break;

            case 3:
            direction=3;
            moveimage(direction);
            break;

        }
    } 

    public void moveimage(int direction){}

}
