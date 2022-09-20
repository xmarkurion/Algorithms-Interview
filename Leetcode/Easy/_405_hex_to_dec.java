package com.Markurion.Leetcode.Easy;

/*
Given an integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.
All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.
Note: You are not allowed to use any built-in library method to directly solve this problem.

Example 1:
Input: num = 26
Output: "1a"

Example 2:
Input: num = -1
Output: "ffffffff"

Constraints:
    -231 <= num <= 231 - 1
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.BinaryOperator;

public class _405_hex_to_dec {
    public static void main(String[] args){

        //We could use this but, we can't so ...... WHY.GOD..WHY....
        //System.out.println(Integer.toHexString(-2));

        System.out.println(toHex(26));
    }

    public static String toHex(int num) {
        String output = null;
        if(num == 0)  output = "0";
        if(num > 0)  output = toPosHex(num);
        if(num < 0)  output = negativeHex(num);
        return output;
    }

    public static String negativeHex(int num){
        HashMap<Integer, String> table = tablee();
        StringBuilder stringB = new StringBuilder();
        for (int i=0; i<32; i+=4) {
            int n = num & 0xf;
            stringB.append(table.get(n));
            num >>= 4;
        }
        return stringB.reverse().toString();
    }

    public static String toPosHex(int num) {
        HashMap<Integer, String> table = tablee();
        ArrayList<String> numbers = new ArrayList<>();
        int temp = num;
        int hexNo;
        while (num > 0){
            hexNo = num % 16;
            numbers.add(table.get(hexNo));
            num = num / 16;
        }
        String fin = "";
        for(int x=numbers.size()-1; x >= 0; x--){
            fin += numbers.get(x);
        }
        return fin;
    }

    public static HashMap<Integer,String> tablee (){
        HashMap<Integer, String> table = new HashMap<>();
        int x=0;
        for(; x<10; x++){
            table.put(x,Integer.toString(x));
        }
        for(int y=97;x<16; x++){
            table.put(x,Character.toString(y));
            y++;
        }
        return table;
    }

}
