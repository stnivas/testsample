package com.company;

import java.util.Arrays;

public class MinimumDifferencePair {
    public int minimum_difference(int[] nums)

    {
        int min=Integer.MAX_VALUE;
        int ans=0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1;i++){
            ans=nums[i+1]-nums[i];
            if(ans<min){
                min=ans;

            }
        }
        return min;
    }
}

