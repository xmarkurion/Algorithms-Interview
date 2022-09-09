package com.Markurion.Leetcode.Easy;

public class _9 {
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        String temp = "";
        for(int y= number.length()-1; y>=0; y--){
            temp += number.charAt(y);
        }
        return number.equals(temp);
    }
}
