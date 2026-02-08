package ImportantQue;

import java.util.HashMap;

public class CheckIfAnagram {

    static boolean checkIfAnagram(String s1, String s2){

        // 1st case 
        if(s1.length() != s2.length()){
            return false;
        }

        // If len are same now work on checking there characters are same or not 
        HashMap<Character, Integer> map = new HashMap<>();

        // get the character occurance count from string 1 s1
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Now run in s2 and decrese the count if found in hashmap for that particular character
        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            
            // check if this ch not availbale in hashmap ... so alrady decided can't be anagram
            if(!map.containsKey(ch)){
                return false;
            }

            // if contains key then decrese the count in map for particular character
            map.put(ch, map.getOrDefault(ch, 0) - 1);

            // Now check after updating count if it becomes negetive then no anagram 
            if(map.get(ch) < 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // String s1= "hello";   
        // String s2 =  "world";
        System.out.println(checkIfAnagram(s1, s2));
    }
}