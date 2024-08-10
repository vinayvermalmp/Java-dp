package org.example.codinginminuts.sorting;

import java.util.ArrayList;
/* WAF that take input an array of distinict intiger and return kth smallest in the array*/
/*Quick Select is a variation of the quicksort algorithm.
It is an optimized way to find the kth smallest/largest element in an unsorted array
* */

public class QuickSelect {

    private static int partition(ArrayList<Integer> arr, int s, int e) {
        int pivot = arr.get(e);
        int i = s-1;

        for (int j = s; j < e ; j++) {
            if (arr.get(j) < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, e);
        return i+1;
    }
    public static void swap(ArrayList<Integer> ar, int first, int second){
        int temp = ar.get(first);
        ar.set(first, ar.get(second));
        ar.set(second, temp);
    }

    private static int quickSelect(ArrayList<Integer> arr, int s, int e, int k) {
        //assuming that k will be inside the array
        int p = partition(arr, s , e);
        if (p == k) {
            return arr.get(p);
        } else if (k<p) {
            return quickSelect(arr, s, p-1, k);
        } else {
            return quickSelect(arr, p+1, e, k);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //int[] ar = {5,1,2,3,4};
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int k= 0;
        int n = arr.size();
        int s= 0;
        int e = n-1;
        System.out.println(quickSelect(arr, s, e, k));
    }




}
