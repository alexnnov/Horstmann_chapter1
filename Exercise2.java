package com.company;

public class Exercise2
{
    public void work(int angle){
        if(angle>=0&&angle<359){
            System.out.println(angle);
            return;
        }
        else if(angle>=360){
            angle%=360;
            System.out.println(angle);
            return;
        }
        else{
            angle%=360;
            angle=angle+360;
            System.out.println(angle);
        }
    }
}
