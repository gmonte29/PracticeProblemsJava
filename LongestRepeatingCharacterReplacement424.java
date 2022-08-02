public class LongestRepeatingCharacterReplacement424 {
    public static void main(String[] args) {
        String s = "BAAAB";
        System.out.println(characterReplacement(s, 1));
    }

    //5.03% runtime, 49.07% memory solution for LeetCode 424
    //https://leetcode.com/problems/longest-repeating-character-replacement/
    public static int characterReplacement(String s, int k) {
        int start = 0;
        int end = 1;
        int max = Integer.MIN_VALUE;
        int kcount = k;

        while (end < s.length()){
            int current = s.charAt(start);
            if(s.charAt(end) != current){
                if(kcount > 0){
                    end++;
                    kcount--;
                }
                else{
                    max = Math.max(max, end-start);
                    kcount = k;
                    start++;
                    end = start+1;
                }
            }
            else end++;
        }
        int result = end - start;
        if(s.length()-result > 0) result+= Math.min(kcount, s.length()-result);

        return Math.max(max, result);
    }

}
