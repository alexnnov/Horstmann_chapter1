package com.company;

import java.math.BigInteger;
import java.util.Scanner;


public class Exercise6 {

    public void work() {
        System.out.println("Enter number");
        Scanner scanner=new Scanner(System.in);
        int inputNum=scanner.nextInt();
        BigInteger bi=BigInteger.valueOf(inputNum);
        if(bi.equals(0)||bi.equals(1)){
            System.out.println("1");
            return;
        }
        BigInteger temp=BigInteger.valueOf(0);
        BigInteger res=BigInteger.valueOf(1);


        for(int i=2;i<=bi.intValue();i++){

            temp=BigInteger.valueOf(i);
            res=res.multiply((temp));

        }
        System.out.println(res);



    }
}
