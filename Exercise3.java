package com.company;
import java.util.Scanner;
public class Exercise3 {
    Scanner scanner=new Scanner(System.in);
    public void work(){

        int n1,n2,n3;
        System.out.println("Enter number 1");
        n1=scanner.nextInt();
        System.out.println("Enter number 2");
        n2=scanner.nextInt();
        System.out.println("Enter number 3");
        n3=scanner.nextInt();


        n1=Math.max(n1,n2);
        n1=Math.max(n1,n3);
        System.out.println("Maximal number is: "+n1);

        if(n1>n2&&n1>n3) {
            System.out.println("Maximal number is"+n1);
            return;
        }
        if(n2>n1&&n2>n3) {
            System.out.println(n2);
            return;
        }
        System.out.print("Maximal number is: "+n3);

    }
}
