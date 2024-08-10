package org.example.codinginminuts.sorting;

import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] ar, int s, int e) {
        if (s < e) {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(ar, s, e);
            // Separately sort elements before
            // partition and after partition
            quickSort(ar, s, pi-1);
            quickSort(ar,pi+1, e);
        }
    }

    private static int partition(int[] arr, int s, int e) {

        // assume the pivot
        int pivot = arr[e];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (s - 1);

        for (int j = s; j <=e-1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, e);
        return (i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] ar = {5,6,6,7,8,4,1};
        int n = ar.length;
        quickSort(ar, 0, n-1);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(ar));
    }
}



