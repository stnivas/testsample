package com.company;

public class NonRepeat {
    public int nonRepeatElement(int number[]){

           int ans=0;
           int count=0;
              for(int i=0; i<number.length;i++){
                 for(int j=0; j<number.length;j++){
                    if(number[i]==number[j]){
                     count++;
                   }
                 }
                 if(count==0){
                    ans=number[i];
                    count=0;
                }
              }
              return ans;
          }
    }

