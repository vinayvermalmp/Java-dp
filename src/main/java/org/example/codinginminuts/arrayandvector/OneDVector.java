package org.example.codinginminuts.arrayandvector;

import java.util.Vector;

public class OneDVector {

    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        arr.add(12);
        arr.add(23);
        for (int number : arr) {
            System.out.println(number);
        }
    }
}
