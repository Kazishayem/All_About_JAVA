class chawdury{
    int id;
    String work;
    String experience;
    
    
}
class shayem extends chawdury{
    int id =123;
    String work = "web";
    String experience = "Loading";
}

class farhad extends shayem{
    // int id =125;
    // String work = "web";
    // String experience = "ReactJS";
} 


public class inheritance_2 {
    public static void main(String[] args) {

        farhad a = new farhad();
        shayem b = new shayem();

        System.out.println("id:"+a.id);
        System.out.println("work:"+a.work);
        System.out.println("experience:"+a.experience);

        System.out.println("id:"+b.id);
        System.out.println("work:"+b.work);
        System.out.println("experience:"+b.experience);

    
        
    }
}
