import java.io.FileWriter;

public class file_write {
    public static void main(String[] args) throws Exception {
        try {

            FileWriter myWriter = new FileWriter("F:\\task_01\\sample.txt");
            myWriter.write("Today's Date ok");
            myWriter.close();
            System.out.println("Successfully");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
