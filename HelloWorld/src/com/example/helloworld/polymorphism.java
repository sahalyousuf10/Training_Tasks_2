package com.example.helloworld;

public class polymorphism {

    static class employees{
        void emp(){
            System.out.println("Company have 1800 employees");
        }
    }

    static class developers extends employees{
        @Override
        void emp(){
            System.out.println("70% employees are java employees");
        }
    }
    static class frontend extends developers{
        @Override
        void emp() {
            System.out.println("30% employees are frontend");
        }
    }

    public static void main(String[] args) {
        employees emp,emp1,emp2;
        emp = new frontend();
        emp1 = new developers();
        emp2 = new employees();
        emp.emp();
        emp1.emp();
        emp2.emp();

    }
}
