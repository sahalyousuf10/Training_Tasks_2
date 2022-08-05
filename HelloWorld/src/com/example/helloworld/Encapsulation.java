package com.example.helloworld;

public class Encapsulation {

    private String name;
    private String designation;
    private int age;
    private int contactno;


    public String getName(){
          return name;
    }

    public String getDesignation(){
        return designation;
    }

    public int getAge(){
        return age;
    }

    public int getContactno(){
        return contactno;
    }

    public void setName(String newname){
        name=newname;
    }

    public void setDesignation(String newdesignation){
        designation=newdesignation;
    }

    public void setAge(int newage){
        if (age<=18) {
            age = newage;
        }
    }

    public void setContactno(int newcontactno){
        contactno = newcontactno;
    }

    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.setName("Mohammad Sahal Yousuf");
        en.setDesignation("Java Developer");
        en.setAge(22);
        en.setContactno(03132674262);

        System.out.println("Name: "+en.getName()+"\nDesignation: "+en.getDesignation()+"\nAge: "+en.getAge()+"\nContact Number: "+en.getContactno());
    }
}


