package com.company;

public class Contiguous {

    public void contiguous(int[] number){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int[] arr=new int[number.length];
        for (int i = 0; i < number.length; i++){
                sum=number[i]+sum;
                arr[i]=sum;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max+" ");
    }
    public static void main(String[] args){
        Contiguous obj=new Contiguous();
        int[] number={-1,-2,-3,-4,-5};
        obj.contiguous(number);
    }
}
