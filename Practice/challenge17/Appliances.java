package Practice.challenge17;

public class Appliances {
}
class Refrigirator extends Appliances{
    private boolean hasWorkTODo; 

    public void setHasWorkToDO(boolean hasWorkTODo){
        this.hasWorkTODo=hasWorkTODo;
    }
    public void orderFood(){
        if(hasWorkTODo==true){
            System.out.println("ordering food");
        }else{
            System.out.println("doing nothing");
        }
    }
}
class DishWasher extends Appliances{
    private boolean hasWorkTODo;
    
    public void setHasWorkToDO(boolean hasWorkTODo){
        this.hasWorkTODo=hasWorkTODo;
    }
    public void doDishes(){
        if(hasWorkTODo==true){
            System.out.println("doing dishes");
        }else{
            System.out.println("doing nothing");
        }
    }
}
class CoffieMaker extends Appliances{
    protected boolean hasWorkTODo;

    public void setHasWorkToDO(boolean hasWorkTODo){
        this.hasWorkTODo=hasWorkTODo;
    }
    public void brewCoffie(){
        if (hasWorkTODo==true) {
            System.out.println("brewing coffie");
        }else{
            System.out.println("doing nothing");
        }
    }
}
