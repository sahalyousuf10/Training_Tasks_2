package com.example.helloworld;

public class Inheritance {

    public static class employee{

        String name;
        public  void designation(){
            System.out.println("Java Developer");
        }

    }
    public static class name extends employee{

        public void display(){
            System.out.println("Employee name is " + name);
        }
    }

    public static void main(String[] args) {


        name nm = new name();
        nm.name = "Sahal Yousuf";
        nm.display();
        nm.designation();

    }
}
