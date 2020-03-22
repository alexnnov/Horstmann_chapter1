package com.company;

import java.util.Random;
import java.util.ArrayList;

public class Exercise13<i> {
    public void work(){
        Random random=new Random();
        ArrayList arrayList=new ArrayList();
        for(int i=1;i<=49;i++){
            arrayList.add(i);
        }
        int[] resultArray=new int[6];
        int randomIndex=0;
        for(int i=0;i<6;i++){
            randomIndex=random.nextInt(49)+1;
            arrayList.remove(randomIndex);
        }
        for(int i=1;i<=49;i++){
            if(!arrayList.contains(i)) System.out.println(i);
        }
    }
}
