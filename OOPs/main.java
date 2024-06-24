package OOPs;

public class main {
    private String brand = "acer";
    private double size = 16.5;
    private String color = "black";
    private boolean available = true;

    public String getBrand(){
        return brand;
    }

    public double getSize(){
        return size;
    }

    public String getColor(){
        return color;
    }

    public boolean getIsAvailable(){
        return available;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setSize(double size){
        this.size=size;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setIsAvailable(boolean availavle){
        this.available=availavle;
    }
    public void discribe() {
        System.out.println("brand "+brand+" size "+size+" color "+color+" is it available? "+available);
    }
}
