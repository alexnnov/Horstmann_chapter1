package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise14 {
    public void work(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two-dimentional array ");
        int numberOfElements=0,countOfStrings=0,sum=0;
        boolean isMagical=true;

        String s=scanner.next();
        countOfStrings++;
        String [] line=s.split(" ");
        for(int i=0;i<line.length;i++){
            System.out.println(line[i]);
        }
        numberOfElements=s.length();
        int ints[][]=new int[numberOfElements][numberOfElements];
        for(int i=0;i<numberOfElements;i++){
            ints[0][i]=Integer.parseInt(line[i]);
            System.out.println(ints[0][i]);
            sum+=ints[0][i];
        }
        while (true){
            s=scanner.next();
            if(s.equals("")) break;
            countOfStrings++;
            line=s.split(" ");
            int numberOfElems=s.length();
            int localSum=0;

            for(int i=0;i<numberOfElems;i++){
                ints[countOfStrings-1][i]=Integer.parseInt(line[i]);
                localSum+=ints[countOfStrings-1][i];
            }
            if(sum!=localSum) isMagical=false;
        }

        int columnSum=0;
        for(int i=0;i<numberOfElements;i++){
            for(int j=0;j<numberOfElements;j++){
                columnSum+=ints[j][i];

            }
            if(columnSum!=sum) isMagical=false;
        }

    }
}
