package com.company;

public class Exercise9 {
   public void work(){
       String s1="Hello";
       String s2= new String("Hello");
       String s3="Hello";
       System.out.println(s1==s2);
       System.out.println(s1==s3);
       System.out.println("Hello".equals(s1));
      
   }
}
