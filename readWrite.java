// public class readWrite {

// }
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Class
class GFG {

    // Main driver method
    public static void main(String[] args) throws Exception {

        try {

            FileReader fr = new FileReader("F:\\task_01\\sample.txt");

            FileWriter fw = new FileWriter("F:\\task_01\\sample.txt");

            String str = "";

            int i;

            while ((i = fr.read()) != -1) {

          
                str += (char) i;
            }

            System.out.println(str);

            fw.write(str);

            fr.close();
            fw.close();

            System.out.println(
                    "File reading and writing both done"+fr);
        }

        // Catch block to handle the exception
        catch (IOException e) {

    

    
            System.out.println(
                    "There are some IOException");
        }
    }
}
