package Exercises.exercise36;

public class Circle {
    protected double radius;

    public Circle(double radius){
        this.radius= radius<0?0:radius;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
