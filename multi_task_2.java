class MyTask extends Thread{
    public void run()  {
        try{

            System.out.println("My task"+Thread.currentThread().getId()+"is completed");

        }catch(Exception e){
            System.out.println("Passing Error");

        }
    }
}

public class multi_task_2 {
    public static void main(String[] args) {
        int i = 8;
        for(i=0;i<i;i++){
            MyTask a = new MyTask();
            a.start();

        }
    }
}
