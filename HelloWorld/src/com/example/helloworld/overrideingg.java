package com.example.helloworld;

public class overrideingg {

    static class calculate{
        int salary;
        int experience=2;
        String name="Mohammad Sahal Yousuf";
        void emp(){
            if (experience==0){
                salary=20000;
                System.out.println(name+" is intern salary is: "+salary);
            }
            else if (experience>0 && experience<=2) {
                salary=50000;
                System.out.println(name+" is Software engineer salary is "+salary);
            }
            else if (experience>2 && experience<=5) {
                salary=90000;
                System.out.println(name+" is Sr Software Engineer salary is "+salary);
            }
            else if (experience>5 && experience<=8) {
                salary=140000;
                System.out.println(name+" is project manager salary is "+salary);
            }
        }
    }

    static class ater1year extends calculate{

        @Override
        void emp(){

            experience=5;

            if (experience==0){
                salary=20000;
                System.out.println(name+" is intern salary is: "+salary);
            }
            else if (experience>0 && experience<=2) {
                salary=50000;
                System.out.println(name+" is Software engineer salary is "+salary);
            }
            else if (experience>2 && experience<=5) {
                salary=90000;
                System.out.println(name+" is Sr Software Engineer salary is "+salary);
            }
            else if (experience>5 && experience<=8) {
                salary=140000;
                System.out.println(name+" is project manager salary is "+salary);
            }
        }

    }

    static class ater3year extends calculate{
        //int experience = 8;

        @Override
        void emp(){
            experience=8;
            if (experience==0){
                salary=20000;
                System.out.println(name+" is intern salary is: "+salary);
            }
            else if (experience>0 && experience<=2) {
                salary=50000;
                System.out.println(name+" is Software engineer salary is "+salary);
            }
            else if (experience>2 && experience<=5) {
                salary=90000;
                System.out.println(name+" is Sr Software Engineer salary is "+salary);
            }
            else if (experience>5 && experience<=8) {
                salary=140000;
                System.out.println(name+" is project manager salary is "+salary);
            }
        }

    }

    public static void main(String[] args) {
        calculate c,c1,c2;
        c=new calculate();
        c1=new ater1year();
        c2=new ater3year();
        c.emp();
        c1.emp();
        c2.emp();
    }


}
