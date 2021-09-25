package com.company;

public class Search {
    public int findIndex(int[] number,int key){
        int ans=0;
        for (int i = 0; i <number.length ; i++) {
            if(number[i]==key){
                ans=i;
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Search obj=new Search();
        int key=10;
        int[] number={7, 1, 2, 10, 4,5, 6};
        int index=obj.findIndex(number,key);
        System.out.println("index of given key="+index);
    }
}
