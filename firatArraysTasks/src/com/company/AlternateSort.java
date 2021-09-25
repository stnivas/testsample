package com.company;

import java.util.Arrays;

public class AlternateSort  {
    public void alternateSort(int arr[]){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        int i=0;
        int[] number=new int[arr.length];
        while (start<=end){
            if(i%2==0)  number[i++]=arr[end--];

            else number[i++]=arr[start++];
        }
        System.out.println(Arrays.toString(number));
    }
    public static void main(String[] args) {
        int[]array={5,4,3,2,1};
        AlternateSort t=new AlternateSort ();
        t.alternateSort(array);
    }
}
