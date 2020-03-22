package com.company;
import java.util.Random;
import java.math.BigInteger;

public class Exercise10 {
    public void work(){
        System.out.println(Long.toString(new BigInteger(200,new Random()).longValue(),36));
    }
}
