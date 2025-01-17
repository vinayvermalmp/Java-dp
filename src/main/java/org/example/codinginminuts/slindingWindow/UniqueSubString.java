package org.example.codinginminuts.slindingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueSubString {

    private static String unique_substring(String str) {
        int i= 0;
        int j= 0;
        int window_len = 0;
        int max_window_len = 0;
        int start_window = -1;

        HashMap<Character , Integer> m = new HashMap<>();

        while (j < str.length()){
            char ch = str.charAt(j);

            //if it is inside hashmap & its idx >= start of the current window
            if(m.containsKey(ch) && m.get(ch)>=i){
                //later on..
                i = m.get(ch)  + 1;
                window_len = j - i; //updated remaining window len excluding current char
            }
            m.put(ch, j);
            window_len++;
            j++;

            //update max_window_len at every step
            if(window_len > max_window_len){
                max_window_len = window_len;
                start_window = i;
            }
        }
        return substringutil(str, start_window,max_window_len);

    }

    private static String substringutil(String str, int startWindow, int i) {
        int inc = startWindow;
        StringBuilder stringBuilder = new StringBuilder();
        while (i !=0){
            stringBuilder.append(str.charAt(inc));
            inc++;
            i--;
        }
        return  stringBuilder.toString();
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.next();

        System.out.println(unique_substring(str));
    }


}
