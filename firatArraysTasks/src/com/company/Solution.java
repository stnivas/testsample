package com.company;

public class Solution {
    public void minValueToBalance(int[] number){
        int ans=0;
        int sum=0;
        int sums=0;
        int len=number.length;
       // int[] one=new int[len /2];
        //int[] two=new int[len/2];

        for (int i = 0; i < number.length/2; i++) {
           // one[i]=number[i];

            sum=sum+number[i];
        }
        int j = 0;
        for (int i =number.length/2;i<number.length;i++,j++){
           //two[j]=number[i];
           sums=sums+number[i];
        }
         ans= sum-sums;
        System.out.println(Math.abs(ans));

    }
    public static void main (String[] args){
        Solution obj=new Solution();
        int [] number=  { 1, 2, 1, 2, 1, 3, };
        obj.minValueToBalance(number);
    }

}
