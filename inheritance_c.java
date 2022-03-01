class Programmer{
    int id;
    String name;
}
class Work extends Programmer{


    int id = 123;
    String name = "kazi";

}

public class inheritance_c {
    public static void main(String[] args) {

        Work m = new Work();

        System.out.println("The salary of the Programmer is: "+m.id);
        System.out.println("The bonus of the Programmer is: "+m.name);
        
    }
}
