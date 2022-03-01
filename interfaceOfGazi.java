/**
 * gazi1
 */
 interface gazi1 {
     public int gg=23;
    public void test1();
    public void test2();
}
interface gazi2{
    public void test3();
}

class Gazi implements gazi1,gazi2{
   public void test1(){
System.out.println("ami gazi from interface gazi1");
   }
   public void test2(){
    System.out.println("ami gazi from interface gaz1");
   }
   public void test3(){
    System.out.println("ami gazi from interface gaz2");
   }
}



public class interfaceOfGazi {
    public static void main(String[] args) {
        Gazi obj=new Gazi();
        System.out.println(obj.gg);
        obj.test2();
    }
}