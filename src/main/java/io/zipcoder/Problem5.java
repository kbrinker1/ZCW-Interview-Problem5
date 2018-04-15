package io.zipcoder;

public class Problem5 {

    public static String reverseString (String input){
        String answer = "";
        //for loop starts at the end of the input and adds each letter to a new string
        for (int i =input.length()-1; i >= 0; i--){
            answer += input.charAt(i);
        }

        return answer;
    }
}
