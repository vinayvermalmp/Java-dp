package org.example.codinginminuts.stringproblems;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenization {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
       int count =  stringTokenizer.countTokens();
       while (stringTokenizer.hasMoreTokens()){
           System.out.println("\"" +stringTokenizer.nextToken()+ "\"");
       }
    }
}
