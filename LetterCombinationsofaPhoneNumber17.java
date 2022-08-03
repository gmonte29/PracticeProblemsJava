import java.util.*;

public class LetterCombinationsofaPhoneNumber17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    //95.92% runtime, 78.56% memory solution for LeetCode 17
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        Map<Character, List<Character>> buttons = new HashMap<>();
        buttons.put('2', new ArrayList<>(Arrays.asList('a','b','c')));
        buttons.put('3', new ArrayList<>(Arrays.asList('d','e','f')));
        buttons.put('4', new ArrayList<>(Arrays.asList('g','h','i')));
        buttons.put('5', new ArrayList<>(Arrays.asList('j','k','l')));
        buttons.put('6', new ArrayList<>(Arrays.asList('m','n','o')));
        buttons.put('7', new ArrayList<>(Arrays.asList('p','q','r','s')));
        buttons.put('8', new ArrayList<>(Arrays.asList('t','u','v')));
        buttons.put('9', new ArrayList<>(Arrays.asList('w','x','y','z')));

        return letterCombinations(digits, buttons, 0, "", new ArrayList<>());
    }

    public static List<String> letterCombinations(String digits, Map<Character,List<Character>> buttons, int index, String s, List<String> result) {
        if(index == digits.length()){
            result.add(s);
            return result;
        }

        List<Character> temp = buttons.get(digits.charAt(index));

        for(int i = 0; i < temp.size(); i++){
            result = letterCombinations(digits, buttons, index+1, s + temp.get(i), new ArrayList<>(result));
        }

        return result;

    }

}
