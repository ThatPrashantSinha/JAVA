package Practice.challenge19;

public class Car {
    private String description;
    public Car(String description){
        this.description=description;
    }
    public void startEngine(){
        System.out.println(description);
        System.out.println("engine starting");
    }
    public void drive(){
        runEngine();
    }
    protected void runEngine(){
        System.out.println("ENGINE RUNNING");
    }
}
    class GasPoweredCar extends Car{
        private double avgKmPerLiter;
        private int cylinders;
        public GasPoweredCar(String description,double avgKmPerLiter,int cylinders){
            super(description);
            this.avgKmPerLiter=avgKmPerLiter;
            this.cylinders=cylinders;
        }
        public void startEngine(){
            System.out.println("engine starting");
        }


    }
    class ElectricCar extends Car{
        private double avgKmPerCharge;
        private int batterySize;
        public ElectricCar(String description,double avgKmPerCharge,int batterySize){
            super(description);
            this.avgKmPerCharge=avgKmPerCharge;
            this.batterySize=batterySize;
        }

    }
    class HybridCar extends Car{
        private double avgKmPerLiter;
        private int batterySize;
        private int cylinders;
        public HybridCar(String description,double avgKmPerLiter,int batterySize,int cylinders){
            super(description);
            this.avgKmPerLiter=avgKmPerLiter;
            this.batterySize=batterySize;
            this.cylinders=cylinders;
        }
        public void display(){
            System.out.println(avgKmPerLiter+batterySize+cylinders);
        }
    }

