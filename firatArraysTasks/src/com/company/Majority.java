package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Majority {
    public void  majority(int[]number){
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j =i+1; j < number.length; j++) {
                if(number[i]==number[j]){

                }
            }

        }
       System.out.println(Collections.max(list)) ;
        System.out.println(list);
    }
    public static void main(String[]args){
        Majority obj=new  Majority();
        int[] number={3,1,3,3,2,5,5,5,3,2,2,} ;
        obj. majority(number);

    }
}

