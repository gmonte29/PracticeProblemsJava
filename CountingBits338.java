import java.util.*;

public class CountingBits338 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    //99.96% runtime, 90.08% memory solution for LeetCode 338
    public static int[] countBits(int n) {
        int [] arr = new int [n+1];

        for(int i = 0; i < arr.length; i ++){
            int x = i;

            int counter = 0;

            while(x != 0){
                x = x & (x-1);
                counter++;
            }
            arr[i] = counter;
        }

        return arr;
    }

}
