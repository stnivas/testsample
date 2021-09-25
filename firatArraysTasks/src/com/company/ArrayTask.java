package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTask {
 //2 question
    public int[] findSmaller(int[] number){
        int[]counts= new int[number.length];
        int count=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if(number[i]>number[j]){
                    count++;
                }
            }
            counts[i]=count;
            count=0;
        }

        return counts;
    }
    public static void main(String[] args){
        ArrayTask obj=new ArrayTask();
        int[] number={8,1,2,2,3,};
        int[]answer=obj.findSmaller(number);
        System.out.println(Arrays.toString(answer));


    }
}


