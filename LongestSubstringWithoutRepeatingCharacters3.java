public class LongestSubstringWithoutRepeatingCharacters3 {

    public static void main(String[] args) {
        String s = "abcb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    //19.5% runtime, 12.08% memory solution for LeetCode 3
    public static int lengthOfLongestSubstring(String s) {
        String tracker = "";
        int max = Integer.MIN_VALUE;
        int temp = 0;

        for(char item : s.toCharArray()){
            if(tracker.contains(Character.toString(item))){
                max = Math.max(temp, max);
                for(int i = 0; i < tracker.length(); i++){
                    if(tracker.charAt(i)==item){
                        tracker = tracker.substring(i+1, tracker.length());
                        temp = tracker.length();
                        break;
                    }
                }
            }
            tracker += item;
            temp++;
        }

        return Math.max(temp, max);

    }

}
