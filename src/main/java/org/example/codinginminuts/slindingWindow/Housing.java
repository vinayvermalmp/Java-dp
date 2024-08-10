package org.example.codinginminuts.slindingWindow;

public class Housing {


    private static void housing(int[] plots, int n, int k) {
        int i = 0;
        int j = 0;
        int cs = 0;

        //expand to right
        while (j<n){
            cs += plots[j];
            j++;

            //remove elements from the left till cs > sum and i<j
            while (cs > k && i < j){
                cs = cs-plots[i];
                i++;
            }
            //check if any given point
            if (cs == k) {
                //print that window
                System.out.println(i + " - " + (j - 1));
            }
        }
    }


    public static void main(String[] args) {

        int plots[] = {1, 3, 2, 1, 4, 1, 3, 2, 1, 1};
        int n = plots.length;
        int k = 8;

        housing(plots, n, k);

    }


}
