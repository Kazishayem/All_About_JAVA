class MultithreadingDemo extends Thread {
    public void run() {
        while (true) {
            System.out.println("My thread is in running state.");
            System.out.println("My thread is not running state.");
            
        }
        

    }

    public void run2() {

        while (true) {
            System.out.println("My thread is try running state.");
            System.out.println("My thread is bad running state.");
            
        }
        
    }
}

public class th2 {
    public static void main(String[] args) {
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
    }
}
