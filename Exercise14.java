package com.company;
import java.util.Scanner;
public class Exercise14 {
    public void work(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two-dimentional array ");
        int numberOfElements=0,countOfStrings=0,sum=0;
        boolean isMagical=true;


        String s=scanner.nextLine();
        if(s.equals("")) return;
        countOfStrings++;
        String[] line=s.split(" ");


        numberOfElements=line.length;
        int ints[][]=new int[numberOfElements][numberOfElements];
        for(int i=0;i<numberOfElements;i++){
            ints[0][i]=Integer.parseInt(line[i]);
            sum+=ints[0][i];
        }
        
        while (true){
            s=scanner.nextLine();
            if(s.equals("")) break;
            countOfStrings++;
            line=s.split(" ");
            int localSum=0;

            for(int i=0;i<numberOfElements;i++){
                ints[countOfStrings-1][i]=Integer.parseInt(line[i]);
                localSum+=ints[countOfStrings-1][i];
            }
            if(sum!=localSum) isMagical=false;
            System.out.println(isMagical);
        }

        int columnSum=0;
        for(int i=0;i<numberOfElements;i++){
            for(int j=0;j<numberOfElements;j++){
                columnSum+=ints[j][i];

            }
            if(columnSum!=sum) isMagical=false;
        }
        System.out.println("Square is magical: "+isMagical);

    }
}

