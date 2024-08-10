package org.example.codinginminuts.stringproblems;

public class CheckSubset {

    public static boolean isSubset(String s1, String s2){
        int i = s1.length()-1;
        int j = s2.length()-1;
        
        while(i>=0 && j>= 0){
            if (s2.charAt(j) == s1.charAt(i)) {
                i--;
                j--;
            } else {
                i--;
            }
        }
        if(j==-1) {
           return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "codinginminutes";
        String s2 = "cines";
        System.out.println(isSubset(s1,s2));
    }
}
