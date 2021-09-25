package com.company;

public class MaxMin {
    public void maxMin(int[] number){
        int max=0;
        int min=0;
        for(int i=0; i<number.length;i++){
            if(number[i]>max) {
               // max = number[i];
                System.out.print(max+" ");
            }
            else if(number[i]<max){
              //  min=number[i];
                System.out.print(min+ " ");
            }
        }
    }
    public static void main(String[] args){
        MaxMin obj=new MaxMin();
        int[] number={7, 1, 2, 3, 4,5, 6};
        obj.maxMin(number);

  }
}
