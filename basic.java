public class basic {

    public static void main(String[] args) {
      
//print statement and basic numbers
         int num=5;
         System.out.print(num + "\n");
          int secondNum=10;
          int thirdNum= num*2 + secondNum;
      System.out.print(thirdNum + "\n");

//datatypes 
         byte bytenum=127;
         short shortnum=32_000;
         int intnum=2_100_000_000;
         long longnum=9_000_000_000_000_000_000L;
         float floatnum= 69.69f;
         double doublenum= 69.6969;
         char charnum='d';
         boolean booleannum= false;
         System.out.print(bytenum + "\n");
         System.out.print(shortnum + "\n");
         System.out.print(intnum + "\n");
         System.out.print(longnum + "\n");
         System.out.print(floatnum + "\n");
         System.out.print(doublenum + "\n"); 
         System.out.print(charnum + "\n");
         System.out.print(booleannum + "\n");
//diclaring multiple variables in a single line
         int inum =100,iinum=10000;
         short snum=2674; byte bnum=2;
         System.out.print(inum +" "+ iinum + "\n");

//casting
         int castingNum= (int)((snum+22)*bnum);
         System.out.print(castingNum + "\n");

//quick operators += -= *= /= %=

         int ran = 10;
         ran +=20;
         System.out.println(ran + "\n");
  
    }
}

    

