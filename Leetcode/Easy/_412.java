package com.Markurion.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _412 {
    public static void main (String[] args){
        System.out.println(fizzBuzz(5));


    }

    public static List<String> fizzBuzz(int n) {
        List<String> data = new ArrayList<String>();

        for(int x=0; x<n;x++){
            int number = x+1;
            if(number % 3 == 0 && number % 5 == 0){
                data.add("FizzBuzz");
                continue;
            }
            if(number % 3 == 0){
                data.add("Fizz");
                continue;
            }
            if(number % 5 == 0){
                data.add("Buzz");
                continue;
            }
            data.add(Integer.toString(number));
        }

        return data;
    }
}
