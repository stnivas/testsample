package com.company;

public class Leaders {
    public void findLeader(int[]number){
        int count=0;
        for (int i = 0; i <number.length ; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i]<number[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.print(number[i]+" ");
            }
            count=0;
        }
    }
    public static void main(String[] args){
        Leaders obj=new Leaders();
        int[] number={16,17,4,3,5,2};
        obj.findLeader(number);
    }
    
}
