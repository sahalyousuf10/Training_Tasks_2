package com.example.helloworld;

public class Info extends inheritancee implements speciality,timing{
    public void name(){
        System.out.println("Employee name is Sahal Yousuf");
    }

    public void designation() {
        super.designation();
    }

    public void company(){
        super.company();
    }

    public void cnic(){
        System.out.println("Cnic number is: "+cnic);
    }

    public void contact(){
        System.out.println("Contact number is: "+contact);
    }

    public void commandlang(){
        System.out.println("Language: Java");
    }

    public void time(){
        System.out.println("Timing is 8 hour");
    }



}
