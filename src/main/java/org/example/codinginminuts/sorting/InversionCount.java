package org.example.codinginminuts.sorting;


import java.util.Vector;

/*
two element a[i] and a[j] form inversion if a[i] > a[j] and i < j;
* */
public class InversionCount {

    public static int merge(Vector<Integer> array, int s, int e){
        int i = s;
        int m = (s+e)/2;
        int j = m + 1;

        Vector<Integer> temp = new Vector<>();

        int cnt  = 0;

        while(i<=m && j<=e){
            if(array.get(i) < array.get(j)){
                temp.add(array.get(i));
                i++;
            }
            else{
                cnt += (m - i + 1);
                temp.add(array.get(j));
                j++;
            }
        }

        //copy rem elements from first array
        while(i<=m){
            temp.add(array.get(i));
            i++;
        }

        // or copy rem elements from second array
        while(j<=e){
            temp.add(array.get(j));
            j++;
        }
        //copy back the eleemtns from temp to original array
        int k = 0 ;
        for(int idx = s; idx <=e ;idx++){
            array.set(idx, temp.get(k++));
        }
        return cnt;

    }
    private static int inversion_count(Vector<Integer> ar, int s, int e) {
        if (s>= e) {
           return 0;
        }
        int mid = (s+e)/2;
        int c1 = inversion_count(ar, s, mid);
        int c2 = inversion_count(ar, mid+1, e);
        int crossInversion = merge(ar, s, e);

        return c1+ c2+ crossInversion;
    }



    public static void main(String[] args) {
        Vector<Integer> arr= new Vector<>();
        //int[] ar = {5,1,2,3,4};
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int s= 0;
        int e = arr.size()-1;
        System.out.println(inversion_count(arr, s , e));
    }
}
