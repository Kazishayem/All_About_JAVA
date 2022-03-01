
class MyThread extends Thread {

    public void Person() {
        while (true) {
            System.out.println("this is call");
            System.out.println("this is shayem");
        }

    }
}

class MyThread2 extends Thread {

    public void Person() {
        while (true) {
            System.out.println("this is sasacall");
            System.out.println("this is asasashayem");
        }

    }
}

public class multi_task {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        MyThread2 b = new MyThread2();

        a.start();
        b.start();
    }
}
