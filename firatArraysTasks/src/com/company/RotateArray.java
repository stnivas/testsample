package com.company;

import java.util.ArrayList;

public class RotateArray {
    public ArrayList<Integer> rotate(int[]number,int position) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            for (int i = position; i < number.length; i++) {
                list.add(number[i]);
            }
            for (int i = 0; i < position; i++) {
                list.add(number[i]);
            }
        }
          catch (IndexOutOfBoundsException e){
              System.out.println("please enter the correct input and position");
          }
            return list;
        }

    public static void main(String [] args){
        RotateArray obj=new RotateArray();

        int[] number={1,2,3,4,5};
        int position=2;
       ArrayList<Integer>list= obj.rotate(number,position);
        System.out.println(list);
    }
}
