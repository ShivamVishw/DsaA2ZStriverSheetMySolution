package ImportantQue;

import java.util.ArrayList;

public class ReverseStringByString {

    static String reverseString(String s){

        // This will store words
        ArrayList<String> words = new ArrayList<>();

        // each word will be store here temporary 
        StringBuilder word = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(word.length()>0){
                    // means space occurs first add individual word into words then make word empty again
                    words.add(word.toString());
                    word.setLength(0);
                }

            }else{
                word.append(ch);
            }
        }
        // For last length // 
        // means we have reached at last 
        if(word.length()>0){ // means there is a word remain which needs to add into words
            words.add(word.toString());

        }

        StringBuilder result = new StringBuilder();
        for(int i= words.size()-1; i>=0; i--){
            result.append(words.get(i)); // words added now add space
            if(i!=0){
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "I Love Coding";
        System.out.println(reverseString(s));
    }
}
