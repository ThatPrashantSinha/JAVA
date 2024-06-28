package Exercises.exercise33;

public class Point {
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x,int y){
        setY(y);
        setX(x);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return distance(0,0);
    }
    public double distance(int x2,int y2){
        int theX = x - x2;
        int theY = y - y2;
        return Math.sqrt((theX*theX)+(theY*theY));
    }
    public double distance(Point a){
        return distance(a.x,a.y);
    }

}
