public class MultithreadingTest extends Thread{

    MultithreadingTest(String name){
        super(name);
    }

    public void run(){

        try {
            System.out.println(Thread.currentThread().getName()+" is running");

        }
        catch (Exception ex){

            System.out.println("Exception is caught");

        }

    }
}
