package Exercises;

public class exercise14 {
    public static boolean isLeapYear(int year) {
        if(year<1 || year>9999){
            return false;
        }else{
            if((year%4==0)&&(year%100!=0)){
                return true;
            }else if((year%100==0)&&(year%400==0)){
                return true;
            }else{
                return false;
            }

        }
    }
    public static int getDaysInMonth(int month,int year) {
        if((year<1) || (year>9999)){
            return -1;
        }else{
            return switch (month) {
                case 1-> 31;
                case 2-> {
                    if(isLeapYear(year)){
                        yield 29;
                    }else{
                        yield 28;
                    }
                }
                case 3-> 31;
                case 4-> 30;
                case 5-> 31;
                case 6-> 30;
                case 7-> 31;
                case 8-> 31;
                case 9-> 30;
                case 10-> 31;
                case 11-> 30;
                case 12-> 31;
                
                default -> -1;
            };
        }
    }
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2000));
    }
}
