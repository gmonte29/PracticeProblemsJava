import java.util.Arrays;

public class plusOne66 {

    public static void main(String[] args) {
        int [] list = {1,8,3,2,5,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(list)));

    }

    //100% runtime, 99.07% memory solution for LeetCode 66
    public static int[] plusOne(int [] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        int index = digits.length - 1;
        while (index >= 0 && digits[index] == 9) {
            digits[index] = 0;
            index--;
        }
        if (index == -1) {
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                temp[i + 1] = digits[i];
            }
            digits = temp;
        } else digits[index]++;
        return digits;
    }
}
