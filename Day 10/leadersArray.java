package com.sbprojects.SCart.dsa;

import java.util.ArrayList;
import java.util.Collections;

public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> ans = leaders(arr);
        System.out.println(ans);
    }

//    static ArrayList<Integer> leaders(int[] arr) {
//        // code here
//        ArrayList<Integer> list = new ArrayList<>();
//        boolean flag = false;
//        for(int i=0; i<arr.length-1; i++){
//            flag = false;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] < arr[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if(!flag){
//                list.add(arr[i]);
//            }
//        }
//        list.add(arr[arr.length-1]);
//
//        return list;
//    }


    static ArrayList<Integer> leaders(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        int i=arr.length-1;

        while(i >= 0){
            if(arr[i] >= max){
                max = arr[i];
                list.addFirst(arr[i]);
            }
            i--;
        }

//        for(int j=0; j<arr.length; j++){
//
//        }
//        Collections.reverse(list);
        return list;
    }
}
