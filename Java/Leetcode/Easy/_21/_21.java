package com.Markurion.Leetcode.Easy._21;

/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list.
The list should be made by splicing together the nodes of the first two lists.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 */

//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

import java.util.ArrayList;
import java.util.Collections;

public class _21 {
    public static void main(String[] args){

        //ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        //ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);

        ListNode output = mergeTwoLists(list1, list2);

        System.out.println("Output test: ");
        while(output != null){
            System.out.print(output.val);
            output = output.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arrList = new ArrayList<>();

        while(list1 != null){
            arrList.add(list1.val);
            list1 = list1.next;
        }

        while(list2 != null){
            arrList.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(arrList);
        System.out.println(arrList.toString());

        int arrSize = arrList.size();

        ListNode last = null;
        for(int x=arrSize-1; x>= 0; x--){
            System.out.println(arrList.get(x));
            last = new ListNode(arrList.get(x),last);
        }
        return last;
    }
}
