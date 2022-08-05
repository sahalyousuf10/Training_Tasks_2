package com.example.helloworld;

public class Overloading {
    public static class calculate {

        public void addition(int a, int b) {

            int result = a + b;
            System.out.println("The addition is: " + result);

        }
        
        public void addition(double a, double b) {

            double result = a+b;
            System.out.println("The addition is: "+ result);
        }

        public void addition(int b, double a){

            long result = (long) a+b;
            System.out.println("The addition is: "+result);
        }
    }

    public static void main(String[] args) {
        calculate c = new calculate();
        c.addition(4,8);
        c.addition(3.99,8.7680);
        c.addition(7.5,8.2);
    }
}
