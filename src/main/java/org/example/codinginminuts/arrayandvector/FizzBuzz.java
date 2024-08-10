package org.example.codinginminuts.arrayandvector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/*
* FizzBuzz Test
Write a fizzbuzz function that returns a vector<string> with the numbers from 1 to n with the following restrictions:

for multiples of 3 store "Fizz" instead of the number

for multiples of 5 store "Buzz" instead of the number

for numbers which are multiples of both 3 and 5 store "FizzBuzz"

You may use the std::to_string(number) method to convert a number into a string.
*
* Example o/p

fizzbuzz(15) == {
"1", "2", "Fizz", "4", "Buzz",
"Fizz", "7", "8", "Fizz", "Buzz",
"11", "Fizz", "13", "14", "FizzBuzz"
}
*
* */
public class FizzBuzz {

    public static List<String> fizzbuzz(int n){

        List<String> result =new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if((i%15)==0){
                result.add("FizzBuzz");
            }
            else if(i%5 == 0){
                result.add("Buzz");
            }
            else if(i%3 == 0){
                result.add("Fizz");
            }
            else{
                result.add(i+"");
            }

        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(fizzbuzz(15));

    }

}

