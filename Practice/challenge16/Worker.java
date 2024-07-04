package Practice.challenge16;

public class Worker {
    protected String name;
    private String birthDate;
    private String endDate;

    public Worker(String name,String birthDate,String endDate){
        this.name=name;
        this.birthDate=birthDate;
        this.endDate=endDate;
    }
    public int getAge(){
        return 2024-Integer.parseInt(birthDate);
    }
    public double collectPay(){
        return 0.0;
    }
    public String terminate(String endDate2){
        return endDate;
    }

}
