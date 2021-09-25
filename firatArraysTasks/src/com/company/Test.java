package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static String split () {
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("2000");
        String output=null;
        while (m.find()){
            output=m.group();
        }
        return  output;
    }
    public static void main(String[] args) {
         String n=split();
        System.out.println(n);
    }
}

