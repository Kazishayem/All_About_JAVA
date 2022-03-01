package MultiTreading;

public class multitreading{
    public static void main(String[] args)  {

        for(int i=0;i<5;i++){
            theThings things1 = new theThings();
            things1.start();

        }
        
        // theThings things1 = new theThings();
        // theThings things2 = new theThings();

        // things1.run();
        // things2.run();

        // things1.start();
        // things2.start();
    }
}

