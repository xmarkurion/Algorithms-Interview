package com.Markurion.Leetcode;

import java.util.Arrays;

public class _1342 {
    public static void main(String[] args){

    }

    public static int numberOfSteps(int num) {
        int temp=0;
       
        while(num != 0){
            if(num % 2 != 0){
            num--;
            temp++;
        }else{
            num = num / 2;
            temp++;
        }
        }
        
    
        return temp;
    }


}
