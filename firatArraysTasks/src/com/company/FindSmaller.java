package com.company;

import java.util.Arrays;

public class FindSmaller {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int count=0;
        for(int run=0; run<nums.length; run++){
            for(int j=0; j<nums.length; j++){
                if(nums[run]>nums[j]){
                    count++;
                }
            }
            ans[run]=count;
            count=0;
        }
        return ans;
    }
    public static void main(String[] args) {
       int nums[]={8,1,2,2,3};
       FindSmaller obj=new FindSmaller();
       int[]answer=obj.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(answer));

        }
    }
