package com.example.helloworld;

public class HelloWorld {

     public static class addition{
         private int num1;
         private int num2;

         public addition(int num1 , int num2){
             this.num1 = num1;
             this.num2 = num2;
         }
         public int result(){
             return num1+num2;
         }
     }
     public static class subtraction extends addition{

         public subtraction(int num2){
             super(num2, num2);
         }
     }

     public static class myname{
         public void name(){
             String name = "Sahal";
         }
     }

     public static class empname extends myname{
         @Override
         public void name() {
             String name = "Sahal Yousuf";
             System.out.println(name);

         }
     }

    public static void main(String[] args) {

         addition add = new addition(8, 9);
         subtraction sub = new subtraction(9);
         empname en = new empname();


         int result = sub.result();
         int result2 = add.result();
         System.out.println(result);
         System.out.println(result2);
         en.name();

    }



}
