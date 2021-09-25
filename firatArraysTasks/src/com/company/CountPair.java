package com.company;

import java.util.HashMap;

public class CountPair {


    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans= k-arr[i];

            if(map.containsKey(ans)){
                count+=map.get(ans);
            }

            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }

}

