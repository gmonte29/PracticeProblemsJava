import java.util.*;

public class happyNumber202 {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    //97.05% runtime, 42.13% memory solution for LeetCode 202
    public static boolean isHappy(int num) {
        List<Integer> list = new LinkedList<>();

        while(num != 1){
            int temp = num;
            num = 0;

            while(temp != 0){
                int digit = temp %10;
                num+= digit * digit;
                temp /= 10;
            }
            if(list.contains(num)) return false;
            list.add(num);
        }
        return true;
    }
}
