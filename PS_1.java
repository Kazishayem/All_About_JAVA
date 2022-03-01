import java.util.Scanner;

public class PS_1 {
    public static void main(String[] args) {
        int a = 30;
        int b = 30;
        int c = 30;

        int sum = a+b+c;

        System.out.println(sum);

        float sub1 = 45;
        float sub2 = 45;
        float sub3 = 45;

        float cgpa = (sub1+sub2+sub3)/31;
        System.out.println(cgpa);

        System.out.println("what is your name");

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("Helllo " + name + "  have a good day");



        System.out.println("Enter A Number");

        Scanner cc = new Scanner(System.in);
        System.out.println(cc.hasNextInt()); 


    }
}
