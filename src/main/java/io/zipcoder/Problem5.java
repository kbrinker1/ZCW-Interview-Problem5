package io.zipcoder;

public class Problem5 {

    public static String reverseString (String input){
        String answer = "";

        for (int i =input.length()-1; i >= 0; i--){
            answer += input.charAt(i);
        }

        return answer;
    }
}
