package ImportantQue;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

    static int longestSubstringWithoutRepeatingCharacter(String s){
        int left =0;
        int right =0;
        int maxlen =0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length()){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                maxlen = Math.max(maxlen, right- left +1);
                right++;
            }else{
                set.remove(ch);
                left++;
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstringWithoutRepeatingCharacter(s));
    }
}
