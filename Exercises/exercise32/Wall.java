package Exercises.exercise32;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(0, 0);
    }
    public Wall(double width,double height){
        setWidth(width);
        setHeight(height);
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width<0 ? 0: width;
    }
    public void setHeight(double height){
        this.height = height<0 ? 0: height;
    }
    public double getArea(){
        return height*width;
    }
}
