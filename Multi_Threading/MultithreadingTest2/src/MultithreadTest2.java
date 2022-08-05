public class MultithreadTest2 implements Runnable {

    public void run(){

        try {
            System.out.println(Thread.currentThread().getName()+" is running");

        }
        catch (Exception ex){

            System.out.println("Exception Caught");
        }
    }
}
