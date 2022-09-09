package com.Markurion.Leetcode;

import java.awt.*;
import java.util.HashMap;

public class _13 {
    public static void main(String[] args){
        System.out.println(romanToInt("IV"));
    }

    //Char to string.
    public static String cs(char c){
        return Character.toString(c);
    }

    public static int romanToInt(String s){
        HashMap<Character, Integer> roma = new HashMap<Character, Integer>();
        roma.put('I',1);
        roma.put('V',5);
        roma.put('X',10);
        roma.put('L',50);
        roma.put('C',100);
        roma.put('D',500);
        roma.put('M',1000);

        int total = 0;

        for(int x = s.length()-1; x>=0; x-- ){
           int val1 = roma.get(s.charAt(x));
           int val2 = x<s.length()-1 ? roma.get(s.charAt(x+1)) : 0;
           if(val1 >= val2){total+=val1;}
           if(val1 < val2){total-=val1;}
        }
        return total;
    }
}
