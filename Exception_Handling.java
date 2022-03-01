public class Exception_Handling {
    public static void main(String[] args) {
        try
        {
            double da = 10/0;
            System.out.println("Right: " + da);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error");
        }
    }
}
