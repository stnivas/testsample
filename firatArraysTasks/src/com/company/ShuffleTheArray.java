package com.company;

public class ShuffleTheArray {


    public int[] shuffle(int[] nums, int n) {
        int[] one = new int[nums.length / 2];
        int[] two = new int[nums.length / 2];

        for (int i = 0; i < nums.length / 2; i++) {
            one[i] = nums[i];
        }

        int j = 0;
        for (int i = nums.length / 2; i < nums.length; i++, j++) {
            two[j] = nums[i];
        }
        int k = 0;
        int l = 0;
        for (int run = 0; run < nums.length; run++) {
            if (run % 2 == 0) {
                nums[run] = one[l];
                l++;
            } else if (run % 2 == 1) {
                nums[run] = two[k];
                k++;
            }

        }

        return nums;
    }
}
