package com.Markurion.Leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class _2103 {

    public static void main(String[] args){
        System.out.print(countPoints("B0B6G0R6R0R6G9"));
    }


    public static int countPoints(String rings) {
        int itsTheFinalCountDown = 0;
        ArrayList<ArrayList<String>> pals = new ArrayList<>();
        for(int x=0; x<=9; x++){
            pals.add(new ArrayList<String>());
        }

        for(int y=0; y<rings.length(); y+=2){
            String color = String.valueOf(rings.charAt(y));
            int position = Integer.parseInt(String.valueOf(rings.charAt(y + 1)));

            System.out.print(rings.charAt(y));
            System.out.println(rings.charAt(y+1));

            ArrayList<String> temp = pals.get(position);
            temp.add(color);
            pals.set(position, temp);
        }
             System.out.println(pals.size());

        for (ArrayList<String> i : pals){
            boolean R = i.contains("R");
            boolean G = i.contains("G");
            boolean B = i.contains("B");
            if (R && G && B){ itsTheFinalCountDown++;}

            System.out.println("Pals: " + i.size());

        }
        return itsTheFinalCountDown;
    }

}

