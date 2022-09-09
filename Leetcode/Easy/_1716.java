package com.Markurion.Leetcode;

import java.util.Arrays;

public class _1716 {
    public static void main(String[] args){

    }

    public int totalMoney(int n) {
        
        int temp = 0;
        int weeks = 0;
        int bank = 0;
        
        for(int y=1; y<=n; y++){
            temp++;
            bank += temp;
            
            if(y % 7 == 0 ){
                weeks++;
                temp = weeks;
             }
            
        }
        
        return bank;


}
