import java.io.*;
import java.io.File;
import java.util.Scanner;

public class file {

    public static void main(String[] args) throws Exception {
        try {

            String path = "F:\\task_01\\sample.txt";
            // File txt = new File("F:\\task_01\\sample.txt");

            BufferedReader myFile = new BufferedReader(new FileReader(path));
            

            // System.out.println(myFile);

            String ab = myFile.readLine();

            

//             String myStr = "Hello";
// System.out.println(ab.startsWith("wewc"));   // true
// System.out.println(ab.endsWith(""));   // false
// System.out.println(ab.startsWith("o"));  
            // BufferedReader reader = new BufferedReader(new FileReader(path));
            // int Counter = 1;
            // String line;
            // while ((line = reader.readLine()) != null) {
            //     //read the line 
            //     Scanner scanner = new Scanner(line);
            //    //now split line using char you want and save it to array
            //     for (String token : line.split("@")) {
                    
            //         //add element to array here 
            //         System.out.println(token);
            //     }
            // }
            // reader.close();

            // String result;
            // while ((result = myFile.readLine()) != null)
            // System.out.println(result);

        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
