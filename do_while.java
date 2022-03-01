public class do_while {

    public static void kazi(int a){
        if(a < 18){
            throw new ArithmeticException("Person not eligible to give vote");


        }
        else{
            System.out.println("Person eligible to give vote");
        }
    }
    public static void main(String[] args) {
        kazi(19);

    }
}
