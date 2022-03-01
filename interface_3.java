/**
 * Bank
 */
 interface Bank {

    float RateOfInterest();
}

class SBI implements Bank{
    public float RateOfInterest(){
        return 9.5f;
    }
}

class PNB implements Bank{
    public float RateOfInterest(){
        return 9.0f;
    }
}



public class interface_3 {
    public static void main(String[] args) {

        Bank b = new SBI();
        Bank a = new PNB();

        System.out.println("Profit:"+b.RateOfInterest());
        System.out.println("Profit:"+a.RateOfInterest());
        
    }
}
