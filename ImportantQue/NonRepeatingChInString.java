package ImportantQue;

import java.util.HashMap;

public class NonRepeatingChInString {

    static char nonRepeatingCh(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        // Get the count 
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        // check 
        for(char ch: s.toCharArray()){
            if(map.get(ch) ==1){  // Non repeating character

                return ch;

            }
        }

        return '1';
    }

    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(nonRepeatingCh(s)); // w
    }
}


// Given a string, find the first character that does not repeat.
// If none exists, return -1 (or any indicator you prefer).

// Example

// Input:  "swiss"
// Output: 'w'