package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Test for Exercise 1");
        Exerscise1 exerscise1=new Exerscise1();
        exerscise1.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 2");
        Exercise2 exercise2=new Exercise2();
        System.out.println("Enter angle");
        int a=scan.nextInt();
        exercise2.work(a);

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 3");
        Exercise3 exercise3=new Exercise3();
        exercise3.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 4");
        Exercise4 exercise4=new Exercise4();
        exercise4.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 5");
        Exercise5 exercise5=new Exercise5();
        exercise5.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 6");
        Exercise6 exercise6=new Exercise6();
        exercise6.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 7");
        Exercise7 exercise7=new Exercise7();
        exercise7.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 8");
        Exercise8 exercise8=new Exercise8();
        exercise8.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 9");
        Exercise9 exercise9=new Exercise9();
        exercise9.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 10");
        Exercise10 exercise10=new Exercise10();
        exercise10.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 13");
        Exercise13 exercise13=new Exercise13();
        exercise13.work();

        System.out.println("---------------------------");
        System.out.println("Test for Exercise 14");
        Exercise14 exercise14=new Exercise14();
        exercise14.work();





    }
}
