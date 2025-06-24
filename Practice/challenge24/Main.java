package Practice.challenge24;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Place> travel = new LinkedList<>();
        Place sydney = new Place("Sydney", 0);
        Place melbourne = new Place("Melbourne", 877);
        Place brisbane = new Place("Brisbane", 917);
        Place adelaide = new Place("Adelaide", 1374);
        Place aliceSprings = new Place("Alice Springs", 2771);
        Place perth = new Place("Perth", 3923);
        Place darwin = new Place("Darwin", 3972);
        travel.add(sydney);
        travel.add(melbourne);
        travel.add(brisbane);
        travel.add(adelaide);
        travel.add(aliceSprings);
        travel.add(perth);
        travel.add(darwin);
        String inp;
        ListIterator<Place> iterator = travel.listIterator(0);
        do{
            System.out.println("""
                    Select One: 
                    (F)orward
                    (B)ackword
                    (L)ist Places
                    (M)enu
                    (Q)uit
                    """);
            inp = sc.nextLine();
            if(inp.equals("F")){
                if(iterator.hasNext()){
                    System.out.println(iterator.next().getName());
                }else{
                    System.out.println("NO Next Found");
                }
            }else if(inp.equals("B")){
                if(iterator.hasNext()){
                    System.out.println(iterator.previous().getName());
                }else{
                    System.out.println("NO Previous Found");
                }

            }else if(inp.equals("L")){
                while (iterator.hasNext()) {
                    System.out.println(iterator.next().getName());
                }
            }else if(inp.equals("M")){
                 System.out.println("""
                    Select One: 
                    (F)orward
                    (B)ackword
                    (L)ist Places
                    (M)enu
                    (Q)uit
                    """);
            }else if(inp.equals("Q")){
                break;
            }
        }while(inp != "Q");
    }
}
