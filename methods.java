import java.util.Scanner;

public class methods {


    // public static void PrintMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    public static int CalculateSum(int a , int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = CalculateSum(a,b);

        System.out.println("The Result is: " + sum);

        // PrintMyName(name); 
       
    }
}
 