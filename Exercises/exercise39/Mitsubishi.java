package Exercises.exercise39;

public class Mitsubashi extends Car{
    public Mitsubashi(int cylinders,String name){
        super(cylinders,name);
    }
    @Override
    public String startEngine(){
        return "Mitsubashi -> startEngine()";
    }
    @Override
    public String accelerate(){
        return "Mitsubashi -> accelerate()";
    }
    @Override
    public String brake(){
        return "Mitsubashi -> brake()";
    }

}
