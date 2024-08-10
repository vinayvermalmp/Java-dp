package org.example.codinginminuts.arrayandvector;

import java.util.Vector;

public class TwoDVector {
    public static void main(String[] args) {


        Vector<Vector<Integer>> arr = new Vector<>();
        Vector<Integer> v1 = new Vector<>();
        v1.add(13);
        v1.add(12);
        Vector<Integer> v2 = new Vector<>();
        v2.add(23);
        v2.add(22);

        arr.add(v1);
        arr.add(v2);

        for (int i = 0; i < arr.size(); i++) {
            for (int num : arr.get(i)) {
                System.out.println(num +" ");
            }
            System.out.println(" ");
        }
    }
}
