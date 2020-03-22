package com.company;

import java.util.Scanner;

public class Exercise8 {
    public void work(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=scanner.next();

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                System.out.println(s.substring(j,i+j));
            }
        }

    }
}
