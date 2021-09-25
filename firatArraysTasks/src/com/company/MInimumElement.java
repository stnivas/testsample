package com.company;

class MinimumElement {

    public int firstMinimum(int[]number){
        int min=0;

           int temp;
            for (int i = 0; i < number.length; i++) {
                for (int j = 0; j < number.length; j++) {

                    if(number[i]>number[j]){
                        temp=number[i];
                        number[i]=number[j];
                        number[j]=temp;
                    }
                }
            }
            min=number[0];
            return min;
         }
    }

