class Employee7{
    protected int id;
    protected String name;

    public String GetName(){
        return name;
    }

    public void SetName(String n){
        this.name =n;
    }
    public void SetID(int i){
        id =i;
    }
    public int GetID(){
        return id;
    }
    
}



public class modifiers {
    public static void main(String[] args) {

        Employee7 kazi = new Employee7();
        // kazi.id = 12;
        // kazi.name = "shayem";

        kazi.SetName("KAZI SHAYEM");
        System.out.println(kazi.GetName());
        kazi.SetID(5);
        System.out.println(kazi.GetID());
        
    }
}
