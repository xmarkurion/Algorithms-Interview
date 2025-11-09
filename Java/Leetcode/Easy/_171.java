package com.Markurion.Leetcode.Easy;

//Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
//
//        For example:
//
//        A -> 1
//        B -> 2
//        C -> 3
//        ...
//        Z -> 26
//        AA -> 27
//        AB -> 28
//        ...

// ASCII NUMBERS
// 65 = A
// 90 = Z

public class _171 {
    public static void main(String[] args){
        System.out.println(titleToNumber("AAA"));

    }

    //$number = 26 do potęgi w zależności od for-a * wartość litery + $number

    public static int titleToNumber(String columnTitle) {
        int temp = 0;
        int powPower = 0;
        int charPosition = 0;

        int stringLength = columnTitle.length() - 1;
        for(int x = stringLength; x >= 0; x--) {
            charPosition = getASCIIdigitOrder(columnTitle.charAt(x));
            temp += (int) Math.pow(26,powPower) * charPosition;
            powPower++;
        }
        return temp;
    }
    
    public static int getASCIIdigitOrder(char character){
        return (int) character - 64;
    }
}
