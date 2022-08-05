public class MultithreadMain {

    public static void main(String[] args) {

        for (int i = 1; i <= 2; i++) {
            MultithreadingTest thread = new MultithreadingTest("Thread: "+i);
            thread.start();
            try {
                thread.sleep(1000);
            }
            catch (Exception ex){
                System.out.println("Exception caught "+ex);
            }
        }
        System.out.println("Main thread is ending its execution");

    }
}


