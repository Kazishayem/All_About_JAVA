public class Practice_array_1 {
    public static void main(String[] args) {
        int [] value ={1,2,3,45,4};
        // String [] value1 ={}
        // Scanner sc = new Scanner(System.in);


        int sum = 0;

        for(int i : value){
            sum +=i;
            System.out.println("the sum of the array is: "+sum);

        }
        
    }
}
