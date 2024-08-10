package org.example.codinginminuts.stringproblems;

import java.util.Comparator;
import java.util.Vector;

public class SortSubsequence {

    public static void subsequence(String s, String o, Vector<String> vector){
        //base case
        if (s.length() == 0) {
            vector.add(o);
            return;
        }
        //rec case
        char ch = s.charAt(0);
        String reduced_input = s.substring(1);
        System.out.println(reduced_input);
        //includes
        subsequence(reduced_input, o + ch, vector);

        //excludes
        subsequence(reduced_input, o , vector);

    }

    public static void main(String[] args) {
        String s = "abcd";
        Vector<String> vector = new Vector<>();
        String o ="";
        subsequence(s, o, vector);

        vector.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() < o2.length() ? -1: 1;
            }
        });

        System.out.println(vector);
    }
}
