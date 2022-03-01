interface friend {

    public void chawdury();
    public void shayem();
    public void farhad();

}

/**
 * DigitalLab
 */
 interface DigitalLab {

   public void shayem2();
   public  void farhad2();

}
class all implements friend,DigitalLab{
    public void chawdury(){
        System.out.println("chawdury");
    }
    public void shayem(){
        System.out.println("shayem");
    }
    public void farhad(){
        System.out.println("farhad");
    }
    public void shayem2(){
        System.out.println("shayem2");
    }
    public void farhad2(){
        System.out.println("farhad2");
    }
}


public class interface_2 {
    public static void main(String[] args) {

        all a = new all();

        a.chawdury();
        a.farhad();
        a.shayem();
    
    }
}
