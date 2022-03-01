abstract class kazi{       //java abstract class
    abstract void method();     ////java abstract method

    public void cat()
    {
        System.out.println("this is cat");
    }
}

class farha extends kazi{
    public void method(){
        System.out.println("right");
    }
}


public class try_abstract {
    public static void main(String[] args) {

        farha a = new farha();
        a.method();
        a.cat(); 
        
    }
}
