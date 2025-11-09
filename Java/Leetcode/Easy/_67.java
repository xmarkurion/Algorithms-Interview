package com.Markurion.Leetcode.Easy;

public class _67 {
    public static void main(String[] args){
        System.out.println(addBinary("11","1"));
    }

    public static String addBinary(String a, String b) {
        String maxNumber;
        String minNumber;
        if(a.length() > b.length()){
            maxNumber = a; minNumber = b;
        }else{
            maxNumber = b; minNumber = a;
        }
        int maxLength = maxNumber.length();

        String temp ="";
        for(int q=0; q < maxLength-minNumber.length(); q++){
            temp +="0";
        }
        minNumber = temp + minNumber;

        String output = "";
        int sum = 0;
        boolean rest = false;

        System.out.println("Max: " + maxNumber + " Min: " + minNumber);

        //Number counting logic
        for(int x=maxLength-1; x>=0; x--){

            int intMinNumber = Integer.parseInt(String.valueOf(minNumber.charAt(x)));
            int intMaxNumber = Integer.parseInt(String.valueOf(maxNumber.charAt(x)));
            int intRest = rest ? 1: 0;
            sum = intMaxNumber + intMinNumber + intRest;
            System.out.println("At x: " + x + " Sum is: " + sum);
            if(sum < 2){
                output += Integer.toString(sum);
                rest = false;
            }
            if(sum == 2){
                output += "0";
                rest = true;
            }
            if(sum == 3){
                output += "1";
                rest = true;
            }
        }

        if(rest){
            output += "1";
        }

        StringBuilder finalOutput = new StringBuilder();
       finalOutput = new StringBuilder(output);
       finalOutput.reverse();

    return finalOutput.toString();
    }
}
