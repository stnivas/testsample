package com.company;

import java.util.Arrays;

public class WaveForm {
    public void wave(int[]number){
        int temp=0;
        int i=0;
        while ( i<number.length) {
            if(i+1< number.length && number[i]<number[i+1]){
                temp=number[i];
                number[i]=number[i+1];
                number[i+1]=temp;
            }
            i=i+2;
        }
        System.out.println(Arrays.toString(number));
    }
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};
        WaveForm obj=new WaveForm();
         obj.wave(number);

    }
}
