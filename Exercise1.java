package com.company;
import java.util.Scanner;
public class Exercise1 {
    public void work(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number=scanner.nextInt();
        double doubleValue=number;
        Integer integerNumber=number;
        System.out.println(Integer.toOctalString(number));
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toHexString(number));
        System.out.println(Double.toHexString(doubleValue));
    }
}
