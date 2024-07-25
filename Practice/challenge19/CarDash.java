package Practice.challenge19;

import java.util.Scanner;
public class CarDash {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("Enter your car type:");
        String type=scaner.nextLine();
        System.out.println("Enter your car name:");
        String name=scaner.nextLine();
        HybridCar hybrid = new HybridCar(name, 2, 2, 2);
        hybrid.display();
        Car car = new Car(name);
        car.startEngine();
        scaner.close();
        
    }
}
