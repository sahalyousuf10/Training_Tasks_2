package com.example.helloworld;

public class abstractt {
    abstract static class student {
        public abstract void studentname();
        public abstract void department();
        public abstract void workplace();

        public void studentid() {
            System.out.println("Student Id is 15213");
        }
        public void contact(){
            System.out.println("03132674262");
        }
    }

    static class info extends student {
        public void studentname() {
            System.out.println("Student name is Sahal Yousuf");
        }

        public void department() {
            System.out.println("Department is BSCS");
        }

        public void workplace() {
            System.out.println("Workplace is Nisum");

        }
    }

        public static void main(String[] args) {
            info myinfo = new info(); // Create a Pig object
            myinfo.studentname();
            myinfo.studentid();
            myinfo.contact();
            myinfo.department();
            myinfo.workplace();

        }
    }

