public class Practice_array_2 {
    public static void main(String[] args) {
        int [] num ={4,5,3,6,7,9};

        int sum= 0;

        for(int i=0;i<num.length;i++)
        {
            sum = sum+num[i];

            //calculate avg

            double avg = sum / num.length;
            System.out.println("the avg of the array: "+avg);
        }


    }
}
