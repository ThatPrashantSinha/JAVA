package Exercises;
public class exercise9 {
    public static double area(double radius) {
        if (radius<0){
            return -1.0;
        }else{
            return 3.14159*radius*radius;
        }
    }
    public static double area(double x, double y) {
        if (x<0 || y<0){
            return -1.0;
        }else{
            return x*y;
        }
    }
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5,2));
    }
}
