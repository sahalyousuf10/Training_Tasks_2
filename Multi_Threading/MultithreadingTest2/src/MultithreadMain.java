public class MultithreadMain {

    public static void main(String[] args) {

        for (int i=1; i<=2; i++){
            Thread thread2 = new Thread(new  MultithreadTest2());
            thread2.start();
            try {
                thread2.sleep(1000);
            }
            catch (Exception ex){
                System.out.println("Exception Caught "+ex);
            }
        }
        System.out.println("Main Thread ended its execution");

    }

}
