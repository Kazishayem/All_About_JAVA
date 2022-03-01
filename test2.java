class Employee{
    int id;
    String name;

    public void Person(){//access modifier--public--return type---void---method name---Person
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
        
       
    }
}


public class test2 {
    public static void main(String[] args) {
        // System.out.println("This is class");

        // kazi ha = new kazi();
        // kazi gaq = new kazi();

        Employee harry = new Employee();
        harry.id= 12;
        harry.name ="kazi";

        harry.Person();


        // System.out.println(harry.id);
        // System.out.println(harry.name);
        
    }
}
