package org.example.codinginminuts.stringproblems;


import java.util.Vector;

/*
* Warm Up - Search All!
Implement a function that returns a list of all occurrences of a given  substring inside a big string.
Return empty vector if smaller string is not present inside bigger string.

Sample Input

string bigString = "I liked the movie, acting in movie was great!";
string smallString = "movie"


Sample Output
12, 29
* */
public class StringSearch {

    public static Vector<Integer> strSearch(String big , String small){

        Vector<Integer> result = new Vector<>();
        int index = big.indexOf(small);

        while (index != -1){
            result.add(index);
            index = big.indexOf(small, index+1);
        }

        return result;
    }

    public static void main(String[] args) {
        String bigString = "I liked the movie, acting in movie was great!";
        String smallString = "movie";
        System.out.println(strSearch(bigString, smallString));
    }

}
