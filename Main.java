public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        // Create a subclass of Thread
        MyThread thread1 = new MyThread();
        
        //or

        // Implement Runnable interface and pass instance as an argument to Thread constructor
        MyRunnable runnable1 = new MyRunnable();
        
        Thread thread2 = new Thread(runnable1); 

        // the main thread doesn't wait for daemon thread to finish
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000); // calling thread (ex. main) wait until the specified dies or for x milliseconds
        thread2.start();

        // Threads runs indepently of each other

        // Main thread waits for all user threads even if it's with error
        System.out.println(1/0); 
 
    }    
}