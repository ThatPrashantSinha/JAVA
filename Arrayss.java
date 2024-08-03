import java.util.Arrays;
public class Arrayss {
    public static void main(String[] args) {
        int[] first = new int[]{1,2,3,4,5,6,7,8,9,0,69};
        for(int element:first){
            System.out.print(element+" \n");
        }
        Arrays.sort(first);
        int[] second = Arrays.copyOf(first, 10);
        System.out.println(Arrays.toString(first));
        Arrays.fill(first, 44);
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
    }
}
