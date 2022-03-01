class test{

    int a;
    int b;
    test(int a,int b){
        this.a = a;
        this.b = b;

    }
    void display(){
        System.out.println("a:" +a+" "+"b:"+b);
    }
}


public class th {
    public static void main(String[] args) {
        test c = new test(10,20);

        c.display();
    }
}
