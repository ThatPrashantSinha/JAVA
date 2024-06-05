public class challenge5 {
    public static void getDurationString(int seconds) {
        int zz =0;
        if (seconds<0){
            System.out.println("invalid input");
        }else{
            int yys=(seconds/60);
            zz=seconds%60;
            getDurationString(yys,zz);
        }
    }
    public static void getDurationString(int minutes,int seconds) {
        int xx =0;
        int yy =0;
        int zz =0;
        if ((seconds<0||seconds>59)&&(minutes<0)){
            System.out.println("invalid input");
        }else{
            zz=seconds;
            yy=minutes%60;
            xx=minutes/60;
            System.out.println(xx+"h "+yy+"m "+zz+"s");
        }
    }
    public static void main(String[] args) {
        getDurationString(3600);
        getDurationString(180,46);
    }
}
