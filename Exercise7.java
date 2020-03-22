package com.company;

import java.util.Scanner;

public class Exercise7 {
    public void work(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number a between 0 and 65535");
        short a=(short) (scanner.nextInt()-32768);
        System.out.println("Enter number b between 0 and 65535");
        short b=(short) (scanner.nextInt()-32768);
        long longA=a;
        long longB=b;
        System.out.println("a+b= "+(longA+longB));
        System.out.println("a-b= "+(longA-longB));
        System.out.println("a*b= "+(longA*longB));
        System.out.println("a/b= "+(longA+longB));

    }
}
