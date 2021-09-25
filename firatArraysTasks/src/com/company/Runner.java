package com.company;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ShuffleTheArray obj=new ShuffleTheArray();
        int[] number={2,5,1,3,4,7};
        int[] answer=obj.shuffle(number,3);
        System.out.println(Arrays.toString(answer));
    }

}
