package Practice.challenge16;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name,String birthDate,String endDate,long employeeId,String hireDate,double annualSalary,boolean isRetired){
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary=annualSalary;
        this.isRetired=isRetired;
    }
    public void retire(String endDate){
        terminate(endDate);
    }
    public double collectPay(){
        System.out.println(isRetired==true?"you're retired.":"you're not retired.");
        return isRetired==true? (annualSalary/24):(annualSalary/12);
    }

}
